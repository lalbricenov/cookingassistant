package com.example.cookingassistant.ui.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cookingassistant.R;
import com.example.cookingassistant.databinding.ActivityInicioBinding;

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

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        welcomeTv.setText("Bienvenido " + username);
    }
}