import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2020);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.5);
        miPelicula.evalua(9.5);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calcularMedia());
    }

}
