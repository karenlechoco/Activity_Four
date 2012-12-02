package com.android.activity_four;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NavUtils;

public class PlantsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);
        
        final Button back = (Button)findViewById(R.id.plants_back);
        back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intnt = new Intent();
				setResult(RESULT_OK,intnt);
				finish();
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_plants, menu);
        return true;
    }

    
}
