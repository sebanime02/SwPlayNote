package com.example.registro;

import java.security.Principal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.playnote.R;

public class Registro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Button btn;
		btn = (Button) findViewById(R.id.btnOK);
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Registro.this,Principal.class);
				startActivity(intent);
			}
		});
		
	}
	
	
	
}
