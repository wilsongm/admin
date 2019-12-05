package com.example.admin;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {


    Button btnIniciar_sesion,btnIr_Registrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnIniciar_sesion=findViewById(R.id.btnIniciar_sesion);
        btnIr_Registrarse=findViewById(R.id.btnIrRegistrarse);



        btnIr_Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Login.class));
                finish();
            }
        });

        btnIniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Registrar Usuario", Toast.LENGTH_SHORT).show();
                //Aquí codigo
            }
        });
    }


}
