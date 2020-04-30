# 实验四 Intent
## 代码和解释
### test4_intent
MainActivity
```
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
```
### test4_mybrowser
MainActivity
```
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从intent获取数据
        String url=getIntent().getDataString();
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl(url);
        //设置使直接通过WebView显示网页
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //使用WebView加载显示url
                view.loadUrl(url);
                // 返回true
                return true;
            }

        });
    }
}
```
AndroidManifest.xml
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.test">

<!-- 添加网络权限 -->
    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:usesCleartextTraffic="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
<!--         添加新的过滤条件-->
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="http"></data>
            </intent-filter>
        </activity>
    </application>
</manifest>
```
## 实验截图
Intent响应<br>
![image](https://github.com/LWF061/Test/blob/master/images/test4_Intent.png)<br>
MyBrowser截图<br>
![image](https://github.com/LWF061/Test/blob/master/images/test4_MyBrowser.png)

