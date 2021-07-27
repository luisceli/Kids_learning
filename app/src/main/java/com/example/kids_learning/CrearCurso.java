package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CrearCurso extends AppCompatActivity {


    private Button atras2,crear;
    private TextView codigo;
    private EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_curso);

        atras2= findViewById(R.id.button2);
        crear= findViewById(R.id.button);
        codigo=(TextView)findViewById(R.id.textView4);
        nombre=(EditText)findViewById(R.id.editTextTextPersonName);

        atras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(CrearCurso.this,MenuDocente.class);
                startActivity(a);
            }
        });
    }

    public void crear(View view){
    
           String nom= nombre.getText().toString();
           if(nom.equals("")){
               Toast.makeText(this, "Ingrese nombre del Curso", Toast.LENGTH_SHORT).show();
           }else {
               Integer  numero = (int) (Math.random() * 8999) + 999;
               String aux=String.valueOf(numero);
               codigo.setText(aux);
        }
    }
}