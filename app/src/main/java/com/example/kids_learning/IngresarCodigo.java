package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IngresarCodigo extends AppCompatActivity {

    private Button atras3, ingreso;
    private EditText codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_codigo);

        atras3= findViewById(R.id.button9);
        ingreso=findViewById(R.id.button5);
        codigo=(EditText)findViewById(R.id.editTextTextPersonName7);
        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(codigo.length()== 0){
                  Toast.makeText(IngresarCodigo.this, "Ingrese el codigo", Toast.LENGTH_SHORT).show();
              }else {
                  Toast.makeText(IngresarCodigo.this, "Se ingreso al curso", Toast.LENGTH_SHORT).show();
                  Intent a= new Intent(IngresarCodigo.this,MenuEstudiante.class);
                  startActivity(a);
              }


            }
        });
        atras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(IngresarCodigo.this,MenuEstudiante.class);
                startActivity(a);
            }
        });
    }
}