# 实验三 UI组件
## ListView的用法
### 主要代码
#### layout_chatitem.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    
    <TextView
        android:id="@+id/name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="20sp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/header"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintRight_toRightOf="parent"/>
    
</androidx.constraintlayout.widget.ConstraintLayout>
```
#### java代码
```
    final String[] name = {"紫发帅哥","短发美女","长发美女","可爱小狗"};
    final int[] header = {R.drawable.libai,R.drawable.qingzhao,R.drawable.nongyu,R.drawable.tiger};
    private int[] item = new int[name.length];
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String,Object>> dataList = new ArrayList<>();
        for (int i = 0; i <name.length ; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("name",name[i]);
            map.put("header",header[i]);
            dataList.add(map);
        }
        final String[] from = {"name","header"};
        final int[] to = {R.id.name,R.id.header};
        //创建Adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,dataList,R.layout.layout_chatitem,from,to);
        //创建listview
        ListView listView = findViewById(R.id.mylist);
        //将adapter和listviw绑定
        listView.setAdapter(simpleAdapter);
        //为listviw设置监听
        listView.setOnItemClickListener(((parent, view, position, id) -> {
            Toast toast = Toast.makeText(MainActivity.this,name[position],Toast.LENGTH_SHORT);//创建toast
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
            if (item[position]==0){
                view.setBackgroundColor(getResources().getColor(R.color.red));
                item[position]=1;
            }
            else if(item[position]==1){
                view.setBackgroundColor(getResources().getColor(R.color.white));
                item[position]=0;
            }

        }));
     }
 ```
### 代码解释
  先创建ListView里Item的布局，再创建一个Adapter，将布局和Adapter绑定，然后将Adapter和ListView绑定，最后为ListView设置监听。
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/test3_ListView.png)

## 创建自定义布局的AlertDialog
### 主要代码
#### layout_alertdialog.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFC107"
        android:padding="20dp"
        android:gravity="center"
        android:text="ANDROID APP"
        android:textColor="@android:color/white"
        android:textSize="30sp" />

    <EditText
        android:id="@+id/et_name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Username"
        android:textSize="18sp" />

    <EditText
        android:id="@+id/et_pwd"
        android:inputType="textPassword"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Password"
        android:textSize="18sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:paddingLeft="5dp"
        android:paddingRight="5dp">

        <Button
            android:id="@+id/btn_cancel"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="10dp"
            android:layout_weight="1"
            android:background="@color/white"
            android:text="cancel"
            android:textSize="16sp" />

        <Button
            android:id="@+id/btn_login"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@color/white"
            android:text="sign in"
            android:textSize="16sp" />
    </LinearLayout>

</LinearLayout>
```
#### java代码
```
 public void btnOnClickListener(View view) {
        //创建对话框builder
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //通过builder创建对话框
        final AlertDialog alertDialog = builder.create();
        //获取对话框布局
        View alertDialogView = View.inflate(this,R.layout.layout_alertdialog,null);
        //将布局和对话框绑定
        alertDialog.setView(alertDialogView);
        //显示对话框
        alertDialog.show();

        final Button btnLogin = alertDialogView.findViewById(R.id.btn_login);
        final Button btnCancel = alertDialogView.findViewById(R.id.btn_cancel);

      btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"登录中....",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

    }
}
```
### 代码解释
  先创建对话框Builder，然后通过Builder创建一个AlertDialog，再将布局和对话框绑定，最后为对话框上的按钮设置单击事件显示对话框即可。
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/test3_AlertDialog.png)

## 使用XML定义菜单
### 主要代码
#### menu_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="字体大小">
        <menu>
            <group >
                <item
                    android:id="@+id/font_10"
                    android:title="小"/>
                <item
                    android:id="@+id/font_16"
                    android:title="中"/>
                <item
                    android:id="@+id/font_20"
                    android:title="大"/>
            </group>
        </menu>
    </item>
    <!--定义一个普通菜单项-->
    <item android:id="@+id/plain_item"
        android:title="普通菜单项"/>
    <item android:title="字体颜色">
        <menu>
            <group >
                <item
                    android:id="@+id/red_font"
                    android:title="红"/>
                <item
                    android:id="@+id/black_font"
                    android:title="黑"/>
            </group>
        </menu>
    </item>
</menu>
```
#### java代码
```
 @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem mi){

        if(mi.isCheckable()){
            mi.setChecked(true);
        }
        switch (mi.getItemId()){
            case R.id.font_10:
                textView.setTextSize(10);
                break;
            case R.id.font_16:
                textView.setTextSize(16);
                break;
            case R.id.font_20:
                textView.setTextSize(20);
            case R.id.black_font:
                textView.setTextColor(getResources().getColor(R.color.black));
                break;
            case R.id.red_font:
                textView.setTextColor(getResources().getColor(R.color.red));
                break;
            case R.id.plain_item:
                Toast.makeText(MainActivity.this,"单击了普通项",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
```
### 代码解释
  重载方法onCreateOptionsMenu和onOptionsItemSelected，在onCreateOptionsMenu种绑定布局，在onOptionsItemSelected设置响应逻辑
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/test3_OptionMenu_PlainItem.png)
![image](https://github.com/LWF061/Test/blob/master/images/test3_OptionMenu_TextColor.png)

## 创建上下文操作模式(ActionMode)的上下文菜单
### 主要代码
#### menu_actionmode.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <item
        android:id="@+id/delete"
        app:showAsAction="always"
        android:icon="@drawable/delete"
        android:title="delete"
        >
    </item>
</menu>
```
#### java代码
```
        //为listview设置上下文操作
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            int num;
            int[] items;
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                if (checked == true) {
                    num++;
                } else {
                    num--;
                }
                if (items[position]==0){
                    listView.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.green));
                    items[position]=1;
                }
                else if(items[position]==1){
                    listView.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.white));
                    items[position]=0;
                }

                mode.setTitle("  " + num + " Selected");

            }

            private void cancel(){
                for (int i = 0; i <listView.getCount() ; i++) {
                    listView.getChildAt(i).setBackgroundColor(getResources().getColor(R.color.white));
                    item[i]=0;
                }
            }

            //仅在创建的时候调用
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater menuInflater = mode.getMenuInflater();
                menuInflater.inflate(R.menu.menu_actionmode,menu);
                num=0;
                return true;
            }

            //每次显示菜单时都会调用
            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                items = new int[listView.getCount()];
                cancel();
                return false;
            }

            //监听菜单栏点击事件
            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delete:
                        cancel();
                        mode.finish();
                        break;
                }
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                cancel();
            }
        });

```
### 代码解释
  先设置ListView可多选，然后实现AbsListView.MultiChoiceModeListener接口
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/test3_ActionModeMenu.png)
