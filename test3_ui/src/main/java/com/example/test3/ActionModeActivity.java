package com.example.test3;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionModeActivity extends AppCompatActivity {

    final String[] name = {"One","Two","Three","Four","Five"};
    final int[] header = {R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android};
    private int[] item = new int[name.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actionmode);
        List<Map<String, Object>> dataList = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", name[i]);
            map.put("header", header[i]);
            dataList.add(map);
        }
        final String[] from = {"name", "header"};
        final int[] to = {R.id.name, R.id.header};
        //创建Adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, dataList, R.layout.layout_actionmode_chatitem, from, to);
        //创建listview
        ListView listView = findViewById(R.id.mylist2);
        //将adapter和listviw绑定
        listView.setAdapter(simpleAdapter);

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
                    listView.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.blue));
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

    }
}
