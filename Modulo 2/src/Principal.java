import com.aluracursos.screenmatch.Episodio;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //  PELICULA
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2020);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.evalua(8.5);
        miPelicula.evalua(9.5);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        // SERIE
        System.out.println("****  SERIES ****");
        Serie miSerie = new Serie();
        miSerie.setNombre("Flash");
        miSerie.setFechaDeLanzamiento(2018);
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
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Dragones");
        otraPelicula.setFechaDeLanzamiento(1980);
        otraPelicula.setDuracionEnMinutos(190);
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

    }

}
