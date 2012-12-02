package com.android.activity_four;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tab2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tab2, menu);
        return true;
    }
}
