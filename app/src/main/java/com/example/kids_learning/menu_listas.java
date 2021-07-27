package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu_listas extends AppCompatActivity {

    private ImageButton listaesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_listas);

        listaesta=findViewById(R.id.imageButton4);
        listaesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(menu_listas.this,Lista_Estudiantes.class);
                startActivity(a);
            }
        });
    }
}