package com.sferadev.tareas;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
	    }
	
    public void click_xda(View v) {
        String url = "http://forum.xda-developers.com/showthread.php?t=2078102";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}
	
    public void click_github(View v) {
        String url = "https://github.com/SferaDev/Multiple-Task-Manager";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}

    public void click_paypal(View v) {
        String url = "http://forum.xda-developers.com/donatetome.php?u=4710474";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}
    

<<<<<<< HEAD
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.exit:
			Intent intent = new Intent(this, TaskerActivity.class);
        		this.startActivity(intent);
        		break;
        	default:
        		return super.onOptionsItemSelected(item);
		}
		return true;
    }    
=======
>>>>>>> Version 2.5
	
}
