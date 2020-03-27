## 线性布局
### 主要代码
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#000000"
    android:paddingLeft="16dp"
    android:paddingRight="16dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView11"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="one,one" />

        <TextView
            android:id="@+id/textView12"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="one,two" />

        <TextView
            android:id="@+id/textView13"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="one,three" />

        <TextView
            android:id="@+id/textView14"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="one,four" />

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView21"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="two,one" />

        <TextView
            android:id="@+id/textView22"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="two,two" />

        <TextView
            android:id="@+id/textView23"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="two,three" />

        <TextView
            android:id="@+id/textView24"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="two,four" />

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView31"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="three,one" />

        <TextView
            android:id="@+id/textView32"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="three,two" />

        <TextView
            android:id="@+id/textView33"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="three,three" />

        <TextView
            android:id="@+id/textView34"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="three,four" />

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/textView41"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="four,one" />

        <TextView
            android:id="@+id/textView42"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="2"
            android:text="four,two" />

        <TextView
            android:id="@+id/textView43"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="four,three" />

        <TextView
            android:id="@+id/textView44"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFFFFF"
            android:background="@drawable/textview_border"
            android:layout_margin="3dp"
            android:padding="5dp"
            android:gravity="center"
            android:layout_weight="1"
            android:text="four,four" />

    </LinearLayout>
</LinearLayout>

### 代码解释
一个垂直的线性布局嵌套四个水平的线性布局，每个水平布局放置四个Textview，第一、第二、第三行的第一、第三、第四个Textview权重为1，第二个Textview权重为2，第三行情况相反。边框的代码来源百度
### 实验结果
![image](https://github.com/LWF061/Test/images/LinerLayout.png)
