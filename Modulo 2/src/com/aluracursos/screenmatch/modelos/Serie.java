package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento ,int duracionEnMinutos) {
        super(nombre, fechaDeLanzamiento,duracionEnMinutos);
    }


    @Override
    public int getDuracionEnMinutos() {
        //return super.getDuracionEnMinutos();
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporadas;
    }

    public void setTemporada(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie:" + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";

    }
}