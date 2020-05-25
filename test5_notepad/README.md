# 期中实验-NotePad
## 增加时间戳显示
### 实现过程
1.将数据库create和modify字段改为TEXT类型
```
   @Override
       public void onCreate(SQLiteDatabase db) {
           db.execSQL("CREATE TABLE " + NotePad.Notes.TABLE_NAME + " ("
                   + NotePad.Notes._ID + " INTEGER PRIMARY KEY,"
                   + NotePad.Notes.COLUMN_NAME_TITLE + " TEXT,"
                   + NotePad.Notes.COLUMN_NAME_NOTE + " TEXT,"
                   + NotePad.Notes.COLUMN_NAME_CREATE_DATE + " TEXT,"
                   + NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE + " TEXT"
                   + ");");
       }
```
2.将NotePadProvider里的insert方法中获取时间的代码改为获取yyyy-MM-dd HH:mm:ss格式的时间字符串
```
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String now = dateFormat.format(System.currentTimeMillis());
```
3.将NoteEditor里的updateNote方法中获取时间的代码改为获取yyyy-MM-dd HH:mm:ss格式的时间字符串
```
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String now = dateFormat.format(System.currentTimeMillis());
values.put(NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE, now);
```
4.向NoteList中的PROJECTION添加modify字段
```
  private static final String[] PROJECTION = new String[] {
            NotePad.Notes._ID, // 0
            NotePad.Notes.COLUMN_NAME_TITLE,// 1
            NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE,//2
    };
```
5.将notelist_item布局改为垂直布局，并增加text2用于显示时间戳
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="fill_parent"
    android:layout_height="fill_parent">



    <TextView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@android:id/text1"
        android:layout_width="match_parent"
        android:layout_height="?android:attr/listPreferredItemHeight"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:gravity="center_vertical"
        android:paddingLeft="5dip"
        android:singleLine="true"/>

    <TextView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@android:id/text2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center_vertical"
        android:paddingLeft="5dip"
        android:singleLine="true"/>
        
</LinearLayout>
```
6.添加时间数据和TextView的映射
```
        // The names of the cursor columns to display in the view, initialized to the title column
        String[] dataColumns = { NotePad.Notes.COLUMN_NAME_TITLE,NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE } ;

        // The view IDs that will display the cursor columns, initialized to the TextView in
        // noteslist_item.xml
        int[] viewIDs = { android.R.id.text1,android.R.id.text2 };
```
### 实验结果
![image](https://github.com/LWF061/Test/blob/master/images/test5_timestamp.png)

## 增加笔记查询功能
### 实现过程
1.在list_options_menu.xml布局中增加一个SearchView
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <item
        android:id="@+id/menu_search"
        android:title="Search"
        android:actionViewClass="android.widget.SearchView"
        android:showAsAction="always"
    ></item>
    <!--  This is our one standard application action (creating a new note). -->
    <item android:id="@+id/menu_add"
          android:icon="@drawable/ic_menu_compose"
          android:title="@string/menu_add"
          android:alphabeticShortcut='a'
          android:showAsAction="always" />
    <!--  If there is currently data in the clipboard, this adds a PASTE menu item to the menu
          so that the user can paste in the data.. -->
    <item android:id="@+id/menu_paste"
          android:icon="@drawable/ic_menu_compose"
          android:title="@string/menu_paste"
          android:alphabeticShortcut='p' />
</menu>
```
2.在onCreateOptionsMenu()中获取SearchView，并添加监听，当点击搜索按钮时将搜索内容传给NotesList
```
        * 获取搜索框，并对其监听*/
        MenuItem search=menu.findItem(R.id.menu_search);
        SearchView mysearchview=(SearchView)search.getActionView();
        mysearchview.setQueryHint("搜索");
        mysearchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            //当点击搜索按钮时
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent1 = new Intent(NotesList.this,NotesList.class);
                intent1.putExtra("data",query);
                startActivity(intent1);
                return false;
            }

            //当搜索框内容改变时
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
```
3.在NoteList中添加selection和selectionArgs，当无“data”数据时，selection和selectionArgs则为空，即显示全部笔记
```
        String selection = null;
        String[] selectionArgs = null;

        if(intent.getStringExtra("data")!= null){
            selection = NotePad.Notes.COLUMN_NAME_TITLE + " Like ? ";
            selectionArgs = new String[]{"%" + intent.getStringExtra("data") + "%"};
        }
```
### 实验结果
1.在搜索框中输入查询内容，支持模糊查询<br>
![image](https://github.com/LWF061/Test/blob/master/images/test5_search1.png)<br>
2.搜索结果<br>
![image](https://github.com/LWF061/Test/blob/master/images/test5_search2.png)<br>
