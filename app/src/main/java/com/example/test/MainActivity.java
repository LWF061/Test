package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] names = new String[]{"虎头", "弄玉", "李清照", "李白"};
    private String[] descs = new String[]{"可爱的小孩", "一个擅长音乐的女孩",
            "一个擅长文学的女性", "浪漫主义诗人"};
    private int[] imageIds = new int[]{R.drawable.tiger,
            R.drawable.nongyu, R.drawable.qingzhao, R.drawable.libai};
    private String CHANNEL_ID = "channel_one";
    private int notificationId = 0x123;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建一个List集合，List集合的元素是Map
        List<Map<String, Object>> listItems = new ArrayList<>();
        for (int i = 0; i < names.length; i++)
        {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }
        // 创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.simple_item, new String[]{"personName", "header", "desc"},
                new int[]{R.id.name, R.id.header, R.id.desc});
        ListView list = findViewById(R.id.mylist);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        // 为ListView的列表项的单击事件绑定事件监听器
        list.setOnItemClickListener((parent, view, position, id) -> {
            Log.i("-CRAZYIT-", names[position] + "被单击了");
        });
        // 为ListView的列表项的选中事件绑定事件监听器
       /* list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Log.i("-CRAZYIT-", names[position] + "被选中了");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });*/
       list.setOnItemClickListener(((parent, view, position, id) -> {
           Log.i("message",descs[position]+"被单击了");
           NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                   .setSmallIcon(imageIds[position])
                   .setContentTitle("您收到了一条新消息")
                   .setContentText(descs[position]+"给你发送了一条消息")
                   .setPriority(NotificationCompat.PRIORITY_DEFAULT);
           createNotificationChannel();
           NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

           // notificationId is a unique int for each notification that you must define
           notificationManager.notify(notificationId, builder.build());
       }));
    }

    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

}
