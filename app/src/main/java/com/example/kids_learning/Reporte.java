package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reporte extends AppCompatActivity {

    private ListView ls;
    private String arrReport[]={"Reporte_1      1/01/2021","Reporte_2      1/08/2021","Reporte_2      1/15/2021","Reporte_2      1/22/2021","Reporte_3      2/5/2021","Reporte_4      2/13/2021","Reporte_5      2/20/2021","Reporte_6      2/28/2021",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);

        ls=(ListView)findViewById(R.id.list_reportes);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_reporte,arrReport);
        ls.setAdapter(adapter);

    }


}