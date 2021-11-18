package com.example.cookingassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterReceta extends RecyclerView.Adapter<AdapterReceta.ViewHolderReceta> {

    ArrayList<String> listDatos;

    public AdapterReceta(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderReceta onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_receta, parent,false);
        return new ViewHolderReceta(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderReceta holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderReceta extends RecyclerView.ViewHolder {

        TextView titulo, descripcion;

        public ViewHolderReceta(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.nombreReceta);
            descripcion = itemView.findViewById(R.id.descripcion);
        }

        public void asignarDatos(String s) {
            String[] data = s.split("\\|");

            titulo.setText(data[0]);
            descripcion.setText(data[1]);
        }
    }
}
