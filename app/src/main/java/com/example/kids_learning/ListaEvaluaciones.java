package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaEvaluaciones extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment  fragmentinicio,fragmentlista,fragmentranking;
   // private ListView ec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_evaluaciones);

        fragmentinicio= new inicioFragment();
        fragmentlista= new Lista_EvaluacionesFragment();
        fragmentranking=new Lista_RankingFragment();

    }

    public void onClick(View view){

        transaction= getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.button12: transaction.replace(R.id.contenedorFragment,fragmentlista).commit();
                break;
            case R.id.button10:transaction.replace(R.id.contenedorFragment,fragmentranking).commit();
                break;
        }
    }
}