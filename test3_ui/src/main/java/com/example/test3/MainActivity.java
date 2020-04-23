package com.example.test3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

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


        textView = findViewById(R.id.txt);
    }

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
