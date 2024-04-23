package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int nuemro;
    private String nombre;
    private String serie;
    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNuemro() {
        return nuemro;
    }

    public void setNuemro(int nuemro) {
        this.nuemro = nuemro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualizaciones > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
