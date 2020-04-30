package com.example.test3_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取文本框
        EditText editText = findViewById(R.id.editText);
        //获取按钮
        Button button = findViewById(R.id.button);
        //为按钮设置单击响应事件
        button.setOnClickListener(v -> {
            Intent intent = new Intent();
            String data = editText.getText().toString();
            Uri uri = Uri.parse(data);
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

    }
}
