package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lista_Estudiantes extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private  String listaEtudiantes[]={"Wilmer Carrion","Juan Gomez","Andres Ruiz","Mateo Dante","Dandiel Tacuri","Carlos Juca",
                        "Daniel Mazias","Danilo Jaramillo","Manue Gonsalez","Jaime Celi","Umberto Acaro","Paulo Londra"};
    private Integer listaNotas[]={7,8,6,10,8,8,7,9,6,8,9,7};

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        lv=(ListView)findViewById(R.id.lista_est);
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,R.layout.lista_item,listaEtudiantes);
        lv.setOnItemClickListener(this);
        lv.setAdapter(adapter);

        //////////////////////


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String  valor= (String) parent.getItemAtPosition(position);

        Intent nuevof= new Intent(Lista_Estudiantes.this,PerfilEstudiante.class);
        nuevof.putExtra("names",valor);
        nuevof.putExtra("nota",listaNotas[position]+"");

       // Toast.makeText(this, position+"", Toast.LENGTH_SHORT).show();
        startActivity(nuevof);
    }
}