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
一个垂直的线性布局嵌套四个水平的线性布局，每个水平布局放置四个Textview，第一、第二、第三行的第一、第三、第四个Textview权重为1，第二个Textview权重为2，第三行情况相反。边框的代码来源百度。
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/LinerLayout.png)
## 约束布局
### 主要代码
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/TextView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="GREEN"
        android:padding="20dp"
        android:background="#4CAF50"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/TextView2"
        app:layout_constraintBottom_toTopOf="parent"
        app:layout_constraintTop_toBottomOf="parent"/>

    <TextView
        android:id="@+id/TextView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="BULE"
        android:padding="20dp"
        android:background="#3F51B5"
        app:layout_constraintLeft_toRightOf="@+id/TextView1"
        app:layout_constraintRight_toLeftOf="@+id/TextView3"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toTopOf="parent"
        app:layout_constraintTop_toBottomOf="parent"/>

    <TextView
        android:id="@+id/TextView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="INDIGO"
        android:padding="20dp"
        android:background="#673AB7"
        app:layout_constraintLeft_toRightOf="@+id/TextView2"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toTopOf="parent"
        app:layout_constraintTop_toBottomOf="parent"/>

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FF0000"
        android:gravity="center"
        android:padding="20dp"
        android:text="RED"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFC107"
        android:gravity="center"
        android:padding="20dp"
        android:text="ORANGE"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFEB3B"
        android:gravity="center"
        android:padding="20dp"
        android:text="YELLOW"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintRight_toRightOf="parent" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="0dp"
        android:layout_height="100dp"
        android:background="#EE82EE"
        android:gravity="center"
        android:text="VIOLET"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent" />

### 代码解释
Red约束在左上，Orange约束在上左右，Yellow约束在右上。Green、Blue、Indigo用链约束在中间。Violet约束在下左右，填满整个宽。
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/ConstraintLayout.png)
## 表格布局
### 主要代码
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000">

    <TableRow>


        <TextView
            android:id="@+id/textView1"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_marginLeft="10dp"
            android:layout_weight="1"
            android:gravity="left"
            android:textColor="#FFFFFF"
            android:text="Open...."
             />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="right"
            android:textColor="#FFFFFF"
            android:text="Ctrl-O"
             />
    </TableRow>
    <TableRow>


        <TextView
            android:id="@+id/textView3"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_marginLeft="10dp"
            android:layout_weight="1"
            android:gravity="left"
            android:textColor="#FFFFFF"
            android:text="Save...."
            />

        <TextView
            android:id="@+id/textView4"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="right"
            android:textColor="#FFFFFF"
            android:text="Ctrl-S"
            />
    </TableRow>
    <TableRow>


        <TextView
            android:id="@+id/textView5"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_marginLeft="10dp"
            android:layout_weight="1"
            android:gravity="left"
            android:textColor="#FFFFFF"
            android:text="Save As...."
            />

        <TextView
            android:id="@+id/textView6"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="right"
            android:textColor="#FFFFFF"
            android:text="Ctrl-Shift-O"
            />
    </TableRow>
    <TableRow>

        <TextView
            android:id="@+id/textView8"
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="#FFFFFF"/>

    </TableRow>

    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent" >

        <TextView
            android:id="@+id/textView9"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_weight="1"
            android:text="X Import...."
            android:textColor="#FFFFFF"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent" >

        <TextView
            android:id="@+id/textView10"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_weight="1"
            android:text="X Export...."
            android:textColor="#FFFFFF"/>
        <TextView
            android:id="@+id/textView11"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:gravity="right"
            android:padding="5dp"
            android:layout_weight="1"
            android:text="Ctrl-E"
            android:textColor="#FFFFFF"/>

    </TableRow>
    <TableRow>

        <TextView
            android:id="@+id/textView12"
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="#FFFFFF"/>

    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent" >

        <TextView
            android:id="@+id/textView13"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:padding="5dp"
            android:layout_marginLeft="10dp"
            android:layout_weight="1"
            android:text="Quit"
            android:textColor="#FFFFFF"/>

    </TableRow>
</TableLayout>


### 代码解释
分割线也是一行，里面放置一个背景为白色的Textview。第二列的文字靠右。
### 实验截图
![image](https://github.com/LWF061/Test/blob/master/images/TableLayout.png)



