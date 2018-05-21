# AndroidDrawerLayout
Android 双向抽屉布局。

### 本应用的示例

![image](https://github.com/iWay7/AndroidDrawerLayout/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
##### 类似这样，在布局文件中声明一个 DrawerLayout 视图即可：
```
<site.iway.androidhelpers.DrawerLayout
    android:id="@+id/drawerLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_centerInParent="true"
    app:centerViewId="@+id/centerView"
    app:leftViewId="@+id/leftView"
    app:rightViewId="@+id/rightView">

    <LinearLayout
        android:id="@id/leftView"
        android:layout_width="250dp"
        android:layout_height="match_parent"
        android:gravity="top|center"
        android:orientation="vertical">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="LEFT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="LEFT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="LEFT BUTTON" />
    </LinearLayout>

    <LinearLayout
        android:id="@id/rightView"
        android:layout_width="250dp"
        android:layout_height="match_parent"
        android:gravity="top|center"
        android:orientation="vertical">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="RIGHT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="RIGHT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="RIGHT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="RIGHT BUTTON" />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="15dp"
            android:gravity="center"
            android:text="RIGHT BUTTON" />
    </LinearLayout>

    <LinearLayout
        android:id="@id/centerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/red"
        android:gravity="center"
        android:orientation="vertical">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:scaleType="center"
            android:src="@mipmap/ic_launcher" />
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:scaleType="center"
            android:src="@mipmap/ic_launcher"
            android:layout_marginTop="8dp"/>
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:scaleType="center"
            android:src="@mipmap/ic_launcher"
            android:layout_marginTop="8dp"/>
    </LinearLayout>

</site.iway.androidhelpers.DrawerLayout>
```
##### 相关的 View 属性
```
app:centerViewId 指定主要的视图，可以被拖动
app:leftViewId 指定左侧视图，在主视图向右滑动时展示，为空则无法滑动
app:rightViewId 指定右侧视图，在主视图向左滑动时展示，为空则无法滑动
```
##### 请确保 centerView 位于 leftView 和 rightView 上层，在 xml 文件则为下方。<br/>另外，请给 centerView 设定一个背景，以遮挡 leftView 或 rightView 的内容。
