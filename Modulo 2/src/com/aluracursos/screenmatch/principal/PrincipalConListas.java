package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("encanto",2001,120);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Dragones",2021, 95);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("Lord rings",2000, 130);
        peliculaDeBruno.evalua(10);

        Serie miSerie = new Serie("Flash",2021, 105);

        ArrayList<Titulo> listaSeriesAndPeliculas = new ArrayList<>();
        listaSeriesAndPeliculas.add(miPelicula);
        listaSeriesAndPeliculas.add(otraPelicula);
        listaSeriesAndPeliculas.add(peliculaDeBruno);
        listaSeriesAndPeliculas.add(miSerie);

        for (Titulo item: listaSeriesAndPeliculas){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula){
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
        }

        //ArrayList<String> ListaDeArtistas = new ArrayList<>();
        List<String> ListaDeArtistas = new LinkedList<>();  // genera una lita doble enlazada
        ListaDeArtistas.add("Ricado Arjona");
        ListaDeArtistas.add("Avril Lavigne");
        ListaDeArtistas.add("Michael Jackson");
        ListaDeArtistas.add("Moenia");

        System.out.println("ListaDeArtistas = " + ListaDeArtistas);

        Collections.sort(ListaDeArtistas);
        System.out.println("Lista de artistas ordenada " + ListaDeArtistas);

        Collections.sort(listaSeriesAndPeliculas);
        System.out.println("lista ordenada de titulos " + listaSeriesAndPeliculas);

        listaSeriesAndPeliculas.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Lista ordenada por fecha: " + listaSeriesAndPeliculas);





    }
}
