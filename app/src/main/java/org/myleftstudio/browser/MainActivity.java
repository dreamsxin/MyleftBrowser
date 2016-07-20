package org.myleftstudio.browser;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    private XWalkView mXWalkView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setTitle("御舟");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mXWalkView = (XWalkView) findViewById(R.id.xwalkView);
        mXWalkView.load("http://www.myleft.org/", null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return  true;
    }
}
