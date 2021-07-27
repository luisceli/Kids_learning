package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PerfilEstudiante extends AppCompatActivity {

    private TextView name,nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_estudiante);

        name=(TextView) findViewById(R.id.textView6);
        nota=(TextView)findViewById(R.id.textView7);
        Bundle p= getIntent().getExtras();


        if(p!= null){
            name.setText(p.getString("names"));
            nota.setText("Promedio: "+p.getString("nota"));
        }
    }
}