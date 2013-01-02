package com.sferadev.tareas;

import com.sferadev.tareas.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;


public class MainActivity extends Activity {
    Chronometer crono1;
    Chronometer crono2;
    Chronometer crono3;

    @Override
public void onBackPressed() {
    new AlertDialog.Builder(this)
        .setTitle("Do you want to Exit?")
        .setMessage("Are you sure you want to exit? All Timers will be reseted!")
        .setNegativeButton(android.R.string.no, null)
        .setPositiveButton(android.R.string.yes, new OnClickListener() {

            public void onClick(DialogInterface arg0, int arg1) {
                MainActivity.super.onBackPressed();
            }
        }).create().show();
}
    
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
        
        
}



