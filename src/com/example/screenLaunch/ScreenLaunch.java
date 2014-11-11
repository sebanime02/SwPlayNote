package com.example.screenLaunch;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import com.example.playnote.MainActivity;
import com.example.playnote.R;

public class ScreenLaunch extends Activity {
	  private static final long SPLASH_SCREEN_DELAY = 5000;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {


	        super.onCreate(savedInstanceState);




	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//Configurar Portrair
	        requestWindowFeature(Window.FEATURE_NO_TITLE); // Para que no tenga actionbar,solo screenimage
	        setContentView(R.layout.screenlaunch);

	        TimerTask task = new TimerTask() { //Temporizador ventana de carga (3 segundos)
	            @Override
	            public void run() {


	                Intent mainIntent= new Intent().setClass(
	                        ScreenLaunch.this, MainActivity.class);
	                startActivity(mainIntent);

	                // Close the activity so the user won't able to go back this
	                // activity pressing Back button
	                finish();
	            }
	        };

	        // Simulate a long loading process on application startup.
	        Timer timer = new Timer();
	        timer.schedule(task, SPLASH_SCREEN_DELAY);

	    }
}
