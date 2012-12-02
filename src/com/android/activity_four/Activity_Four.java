package com.android.activity_four;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Four extends Activity {

	public int game;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__four);
        
        final TextView result = (TextView)findViewById(R.id.description);
        
        final TextView cooking = (TextView)findViewById(R.id.cooking_mama);
        cooking.setOnClickListener(new OnClickListener (){
        	public void onClick (View V) {
        		result.setText("Cooking Mama Description");
        		result.setBackgroundColor(Color.GREEN);
        		game=1;
        	}
        });
        
        final TextView angry = (TextView)findViewById(R.id.angry_birds);
        angry.setOnClickListener(new OnClickListener(){
        	public void onClick (View V) {
        		result.setText("Angry Birds Description");
        		result.setBackgroundColor(Color.RED);
        		game=2;
        	}
        });
        
        final TextView plants = (TextView)findViewById(R.id.plants);
        plants.setOnClickListener(new OnClickListener(){
        	public void onClick (View V) {
        		result.setText("Plants vs Zombies Description");
        		result.setBackgroundColor(Color.BLUE);
        		game=3;
        	}
        });
        
        /*final Button play = (Button)findViewById(R.id.play);
        play.setOnClickListener(new OnClickListener(){
        	public void onClick (View V) {
        		if (result.getText().equals("Cooking Mama Description")) {
        			Intent intnt = new Intent(V.getContext(),CookingMamaActivity.class);
            		startActivityForResult(intnt,0);
        		} 
        		else if (result.getText().equals("Angry Birds Description")) {
        			Intent intnt = new Intent(V.getContext(),AngryBirdsActivity.class);
            		startActivityForResult(intnt,0);
        		} 
        		else if (result.getText().equals("Plants vs Zombies Description")) {
        			Intent intnt = new Intent(V.getContext(),PlantsActivity.class);
            		startActivityForResult(intnt,0);
        		}
        	}
        });*/
        
        final Button play = (Button)findViewById(R.id.play);
        play.setOnClickListener(new OnClickListener(){
        	public void onClick (View V) {
        		if (game==1) {
        			Intent intnt = new Intent(V.getContext(),CookingMamaActivity.class);
            		startActivity(intnt);
        		} 
        		else if (game==2) {
        			Intent intnt = new Intent(V.getContext(),AngryBirdsActivity.class);
            		startActivity(intnt);
        		} 
        		else if (game==3) {
        			Intent intnt = new Intent(V.getContext(),PlantsActivity.class);
            		startActivity(intnt);
        		}
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_activity__four, menu);
        return true;
    }

    
}
