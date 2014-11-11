package com.example.playnote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     
        //Declaramos las variables
        Button btn1;
         EditText edt1;
        EditText edt2;


        //Recuperamos las variables del xml
        btn1=(Button)  findViewById(R.id.btn);
        edt1=(EditText) findViewById(R.id.edtx1);
        edt2=(EditText) findViewById(R.id.edtx2);

        final String nombreusuario=edt1.toString();


        //Metodo para verificar si esta en la base de datos.

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombreusuario=="sebas"){
                    Intent intent= new Intent(MainActivity.this,Registro.class);
                    startActivity(intent);

                }


            }
});


    }
    }


    
}
