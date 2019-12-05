package com.example.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registrarse extends AppCompatActivity {

    Button btn_ir_inicioSesion,btnRegistrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        btn_ir_inicioSesion=findViewById(R.id.btnIniciar_sesion);
        btnRegistrarse=findViewById(R.id.btnIrRegistrarse);



        btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrarse.this,Login.class));
                finish();
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registrarse.this, "Registrar Usuario", Toast.LENGTH_SHORT).show();
                //Aquí codigo
            }
        });
    }


}
