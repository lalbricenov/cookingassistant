package com.example.cookingassistant.ui.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cookingassistant.R;
import com.example.cookingassistant.databinding.ActivityInicioBinding;
import com.example.cookingassistant.ui.buscar.BuscarReceta;
import com.example.cookingassistant.ui.receta.RecetaActivity;

public class InicioActivity extends AppCompatActivity {

    private ActivityInicioBinding binding;

    private TextView welcomeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInicioBinding.inflate(getLayoutInflater());

        //setContentView(R.layout.activity_inicio);
        setContentView(binding.getRoot());

        welcomeTv = binding.welcomeTv;

        final Button ultRecetaBtn = binding.ultRecetaBtn;
        final Button login2 = binding.login2;
        final Button login3 = binding.login3;
        final Button login4 = binding.login4;

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        welcomeTv.setText("Bienvenido " + username);

        ultRecetaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recetaIntent = new Intent(getApplicationContext(), RecetaActivity.class);
                startActivity(recetaIntent);
            }
        });

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscarIntent = new Intent(getApplicationContext(), BuscarReceta.class);
                startActivity(buscarIntent);
            }
        });

        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscarIntent = new Intent(getApplicationContext(), BuscarReceta.class);
                startActivity(buscarIntent);
            }
        });

        login4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscarIntent = new Intent(getApplicationContext(), BuscarReceta.class);
                startActivity(buscarIntent);
            }
        });
    }
}