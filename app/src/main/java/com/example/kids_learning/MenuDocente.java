package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuDocente extends AppCompatActivity {


    private Button crear_curso,listaEs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_docente);

        crear_curso=findViewById(R.id.button);
        listaEs= findViewById(R.id.button2);

        listaEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MenuDocente.this,menu_listas.class);
                startActivity(a);
            }
        });

        crear_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MenuDocente.this,CrearCurso.class);
                startActivity(a);
            }
        });
    }
}