package com.example.cookingassistant.ui.buscar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cookingassistant.AdapterReceta;
import com.example.cookingassistant.R;
import com.example.cookingassistant.ui.AdapterPaso;

import java.util.ArrayList;

public class BuscarReceta extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_receta);

        recycler = findViewById(R.id.recyclerRecetas);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false));

        listDatos = new ArrayList<>();

        for(int i = 0 ; i < 10; i++)
        {
            String n = String.valueOf(i);
            listDatos.add("Receta " + n + "| Descripcion de la receta " + n);
        }

        AdapterReceta adapter = new AdapterReceta(listDatos);
        recycler.setAdapter(adapter);
    }
}