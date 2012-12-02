package com.android.activity_four;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Resources res = getResources();
        TabHost tabHost = getTabHost(); //Reusable
        TabHost.TabSpec spec; //Reusable
        Intent intent; //Reusable
        
        intent = new Intent().setClass(this, Tab1.class);
        spec = tabHost.newTabSpec("artists")
        		.setIndicator("Artists",res.getDrawable(R.drawable.ic_action_search))
        		.setContent(intent);
        
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab2.class);
        spec = tabHost.newTabSpec("albums")
        		.setIndicator("Albums",res.getDrawable(R.drawable.ic_action_search))
        		.setContent(intent);
        
        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(1);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
