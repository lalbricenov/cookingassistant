package com.example.cookingassistant.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cookingassistant.R;

import java.util.ArrayList;

public class AdapterPaso extends RecyclerView.Adapter<AdapterPaso.ViewHolderTareas> {

    ArrayList<String> listDatos;

    public AdapterPaso(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderTareas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pasos,parent,false);
        return new ViewHolderTareas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTareas holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderTareas extends RecyclerView.ViewHolder {

        TextView titulo, pasos;

        public ViewHolderTareas(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.tituloPaso);
            pasos = itemView.findViewById(R.id.detallesPaso);
        }

        public void asignarDatos(String s) {
            String[] data = s.split("\\|");

            titulo.setText(data[0]);
            pasos.setText(data[1]);
        }
    }
}
