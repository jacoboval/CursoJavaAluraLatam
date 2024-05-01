package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //public void  incluye (Titulo titulo) {
    public void  incluye (Titulo titulo) {
        System.out.println("Agregando duracon en minutos: " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
    public void  incluye (Serie serie){
        tiempoTotal += serie.getDuracionEnMinutos();
    }

}
