package com.example.cookingassistant;

public class Proceso {
    public  int SepararDatos(String datos, String separador){
        return datos.split(separador).length;
    }
}
