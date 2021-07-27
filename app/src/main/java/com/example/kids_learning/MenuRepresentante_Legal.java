package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuRepresentante_Legal extends AppCompatActivity {

    private ImageButton report;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_representante_legal);

        report=(ImageButton)findViewById(R.id.imageButton2);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g= new Intent(MenuRepresentante_Legal.this,Reporte.class);
                startActivity(g);
            }
        });
    }

}