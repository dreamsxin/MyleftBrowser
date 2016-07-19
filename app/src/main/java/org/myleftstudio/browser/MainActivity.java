package org.myleftstudio.browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    private XWalkView mXWalkView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mXWalkView = (XWalkView) findViewById(R.id.xwalkView);
        mXWalkView.load("http://www.myleft.org/", null);
    }
}
