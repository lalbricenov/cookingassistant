package com.example.cookingassistant.ui.receta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cookingassistant.R;
import com.example.cookingassistant.ui.AdapterPaso;

import java.util.ArrayList;

public class RecetaActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        recycler = findViewById(R.id.recyclerDatos);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false));

        listDatos = new ArrayList<>();

        for(int i = 0 ; i < 10; i++)
        {
            String n = String.valueOf(i);
            listDatos.add("Paso " + n + "| Detalles del paso " + n);
        }

        AdapterPaso adapter = new AdapterPaso(listDatos);
        recycler.setAdapter(adapter);
    }
}