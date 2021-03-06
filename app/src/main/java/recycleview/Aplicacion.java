package com.example.recycleview;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;

public class Aplicacion extends Application {
    private ArrayList<Alumno> alumnos;
    private  MiAdaptador adaptador;
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }

    public MiAdaptador getAdaptador() {
        return adaptador;
    }
    @Override
    public void onCreate(){
        super.onCreate();
        alumnos = Alumno.llenarAlumno();
        adaptador = new MiAdaptador(alumnos, this);
        Log.d("","onCreate: tamaño array list" + alumnos.size());
    }
}
