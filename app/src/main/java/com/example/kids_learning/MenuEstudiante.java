package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuEstudiante extends AppCompatActivity {

    private Button codigo,ranking;
    private ImageButton lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_estudiante);
    codigo= findViewById(R.id.button8);
    lista=(ImageButton) findViewById(R.id.imageButton);


    lista.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent n= new Intent(MenuEstudiante.this,ListaEvaluaciones.class);
            startActivity(n);
        }
    });
    codigo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a= new Intent(MenuEstudiante.this,IngresarCodigo.class);
            startActivity(a);
        }
    });

    }
}