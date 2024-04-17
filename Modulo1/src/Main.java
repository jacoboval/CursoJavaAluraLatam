public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido (a) a Sccreen Match");
        System.out.println("Peliculas:Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis= """
                Matrix paradoja
                la mejor peli
                lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombre2 = "Juan";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre2, aulas);

        System.out.println(mensaje);

        double temperarturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperarturaEnCelsius * 1.8) +32;

        String mensaje2 = String.format("La temperartura de %f Ceslsius es equivalente a %f Farhenheit", temperarturaEnCelsius,temperaturaEnFahrenheit);
        System.out.println(mensaje2);

        int temperaturaEnFahrenheintEntero = (int) temperaturaEnFahrenheit;
        System.out.println("LA temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheintEntero);





    }
}