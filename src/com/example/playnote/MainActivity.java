package com.example.playnote;

import java.security.Principal;

import com.example.registro.Registro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     
        //Declaramos las variables
        Button btn1,btn2;
         EditText edt1;
        EditText edt2;
        


        //Recuperamos las variables del xml
        btn1=(Button)  findViewById(R.id.btnInicio);
        edt1=(EditText) findViewById(R.id.edtx1);
        edt2=(EditText) findViewById(R.id.edtx2);
        btn2=(Button) findViewById(R.id.btnRegistrarse);
        
        final String nombreusuario=edt1.toString();
        String contra = edt2.toString();
        
        final int contrasena = Integer.valueOf(contra); // vuelve entero la cadena contra
        
        //Metodo para verificar si esta en la base de datos.

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombreusuario=="sebas" && contrasena==15){
                	Intent intent = new Intent(MainActivity.this,Principal.class);
                	startActivity(intent);

                }
                else {
                	
                	
                    
                    String texto = "No estas Registrado";
                	Toast toast1 = Toast.makeText( getApplicationContext(), texto,Toast.LENGTH_SHORT); //Alerta de no registrado
                	
                	toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                	toast1.show();
                	
                	
                }


            }
});

        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 
			 Intent intent2 = new Intent(MainActivity.this,Registro.class);
				startActivity(intent2);
			}
		});
        	
        

    }
    }


    

