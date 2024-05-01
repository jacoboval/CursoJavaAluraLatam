package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;
import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula  extends Titulo implements Clasificacion {
    private String director;

//    public Pelicula(String nombre) {
//        this.setNombre(nombre);
//    }

    public Pelicula(String nombre, int fechaDeLanzamiento,int duracionEnMinutos) {
        super(nombre, fechaDeLanzamiento,duracionEnMinutos);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calcularMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
