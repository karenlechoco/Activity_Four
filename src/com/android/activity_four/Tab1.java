package com.android.activity_four;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tab1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tab1, menu);
        return true;
    }
}
