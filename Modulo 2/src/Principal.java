import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
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

//        try {
//            miPelicula.muestraFichaTecnica();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

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
        System.out.println("calculadora.getTiempoTotal() = " + calculadora.getTiempoTotal());
    }

}
