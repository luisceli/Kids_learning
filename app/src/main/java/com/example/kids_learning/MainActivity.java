package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EtUsuario,etpasswor;
    private String Udocente = "1", Cdocente= "1", Uestudiante= "estudiante", Cestudiante= "estudiante", Ututor= "tutor", Ctutor= "tutor";
    private Button registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtUsuario=(EditText)findViewById(R.id.editTextTextPersonName2);
        etpasswor=(EditText)findViewById(R.id.editTextTextPassword2);
        registro=findViewById(R.id.btn_registro);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,Registro.class);
                startActivity(a);
            }
        });
    }

    public void login(View view){

        String user= EtUsuario.getText().toString();
        String password= etpasswor.getText().toString();


        if(user.equals("")|| password.equals("")){
            Toast.makeText(MainActivity.this,"Ingrese un usuario o contraseña",Toast.LENGTH_SHORT).show();
        }else if(user.equals(Udocente)&& password.equals(Cdocente)){
            Intent i= new Intent(MainActivity.this,MenuDocente.class);
            startActivity(i);
        }else if(user.equals(Uestudiante)&& password.equals(Cestudiante)){
            Intent w= new Intent(MainActivity.this,MenuEstudiante.class);
            startActivity(w);

        }else if(user.equals(Ututor)&& password.equals(Ctutor)){
            Intent w= new Intent(MainActivity.this,MenuRepresentante_Legal.class);
            startActivity(w);
    }else {
            Toast.makeText(this, "Contraseña o usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }


}