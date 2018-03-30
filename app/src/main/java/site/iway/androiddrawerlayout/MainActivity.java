package site.iway.androiddrawerlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import site.iway.androidhelpers.DrawerLayout;

public class MainActivity extends Activity implements OnClickListener {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        findViewById(R.id.btn_left).setOnClickListener(this);
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_right).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_left:
                mDrawerLayout.showLeftView();
                break;
            case R.id.btn_center:
                mDrawerLayout.showCenterView();
                break;
            case R.id.btn_right:
                mDrawerLayout.showRightView();
                break;
        }
    }
}
