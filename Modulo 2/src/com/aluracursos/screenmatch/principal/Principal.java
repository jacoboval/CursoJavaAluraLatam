package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //  PELICULA
        Pelicula miPelicula = new Pelicula("encanto",2001,120);

//        miPelicula.setFechaDeLanzamiento(2020);
//        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.evalua(8.5);
        miPelicula.evalua(9.5);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        // SERIE
        System.out.println("****  SERIES ****");
        Serie miSerie = new Serie("Flash",2021, 105);
        //miSerie.setFechaDeLanzamiento(2018);
        miSerie.setIncluidoEnPlan(true);
        miSerie.setTemporada(3);
        miSerie.setEpisodiosPorTemporada(25);
        miSerie.setMinutosPorEpisodio(45);
        //miSerie.setDuracionEnMinutos();

        miSerie.muestraFichaTecnica();
        System.out.println("Duraciòn total en MInutos: " + miSerie.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miSerie);

        Pelicula otraPelicula = new Pelicula("Dragones",2021, 95);
        //otraPelicula.setNombre("Dragones");
        //otraPelicula.setFechaDeLanzamiento(1980);
        //otraPelicula.setDuracionEnMinutos(190);
        calculadora.incluye(otraPelicula);

        System.out.println("Tiempo neceario para ver stu pelicuals y series:  = "
                + calculadora.getTiempoTotal() + "minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNuemro(1);
        episodio.setNombre("casa");
        episodio.setSerie("flash");
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtro(episodio);

        //Pelicula peliculaDeBruno = new Pelicula();

        var peliculaDeBruno = new Pelicula("Lord rings",2000, 130);
        //peliculaDeBruno.setNombre();
        //peliculaDeBruno.setDuracionEnMinutos(100);
        //peliculaDeBruno.setFechaDeLanzamiento(2021);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("\nTamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(2).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());











    }

}
