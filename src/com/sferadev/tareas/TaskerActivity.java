package com.sferadev.tareas;

import com.sferadev.tareas.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;



public class TaskerActivity extends Activity {
    
	@Override
	public void onBackPressed()
	{
	      moveTaskToBack(true);
	}
	
	@Override
	public boolean onKeyLongPress( int keyCode, KeyEvent event ) {
		if( keyCode == KeyEvent.KEYCODE_BACK ) {
			super.finish();
			return true;
		}
		return super.onKeyLongPress(keyCode, event);
	}
	
	Chronometer crono1;
    Chronometer crono2;
    Chronometer crono3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        crono1 = (Chronometer) findViewById(R.id.chronometer1);
        crono2 = (Chronometer) findViewById(R.id.Chronometer2);
        crono3 = (Chronometer) findViewById(R.id.Chronometer3);
        
        button = (Button) findViewById(R.id.start1);
        button.setOnClickListener(mStartListener1);
        button = (Button) findViewById(R.id.stop1);
        button.setOnClickListener(mStopListener1);
        button = (Button) findViewById(R.id.reset1);
        button.setOnClickListener(mResetListener1);
        
        button = (Button) findViewById(R.id.Start2);
        button.setOnClickListener(mStartListener2);
        button = (Button) findViewById(R.id.Stop2);
        button.setOnClickListener(mStopListener2);
        button = (Button) findViewById(R.id.Reset2);
        button.setOnClickListener(mResetListener2);
        
        button = (Button) findViewById(R.id.Start3);
        button.setOnClickListener(mStartListener3);
        button = (Button) findViewById(R.id.Stop3);
        button.setOnClickListener(mStopListener3);
        button = (Button) findViewById(R.id.Reset3);
        button.setOnClickListener(mResetListener3);
        
               
    }
    View.OnClickListener mStartListener1 = new OnClickListener() {
        public void onClick(View v) {
            crono1.setBase(SystemClock.elapsedRealtime());
        	crono1.start();
        }
    };
    View.OnClickListener mStopListener1 = new OnClickListener() {
        public void onClick(View v) {
            crono1.stop();
        }
    };
    View.OnClickListener mResetListener1 = new OnClickListener() {
        public void onClick(View v) {
            crono1.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener mStartListener2 = new OnClickListener() {
            public void onClick(View v) {
            	crono2.setBase(SystemClock.elapsedRealtime());
            	crono2.start();
            }
        };
    View.OnClickListener mStopListener2 = new OnClickListener() {
            public void onClick(View v) {
                crono2.stop();
            }
        };
        View.OnClickListener mResetListener2 = new OnClickListener() {
            public void onClick(View v) {
                crono2.setBase(SystemClock.elapsedRealtime());
            }
        };
        
        View.OnClickListener mStartListener3 = new OnClickListener() {
            public void onClick(View v) {
            	crono3.setBase(SystemClock.elapsedRealtime());
            	crono3.start();
            }
        };
    View.OnClickListener mStopListener3 = new OnClickListener() {
            public void onClick(View v) {
                crono3.stop();
            }
        };
        View.OnClickListener mResetListener3 = new OnClickListener() {
            public void onClick(View v) {
                crono3.setBase(SystemClock.elapsedRealtime());
            }
        };
        
        
        @Override
    	public boolean onCreateOptionsMenu(Menu menu) {
    		// Inflate the menu; this adds items to the action bar if it is present.
    		getMenuInflater().inflate(R.menu.activity_main, menu);
    		return true;
    	}
        
        @Override
    	public boolean onOptionsItemSelected(MenuItem item) {
    		switch (item.getItemId()) {
    		case R.id.exit:
    			finish();
    			return true;
    			
    		case R.id.about:
    			Intent intent = new Intent(this, AboutActivity.class);
    	        this.startActivity(intent);
    	        break;
    			
    		}
			return false;
        }     
}