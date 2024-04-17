public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaPelicula = 8.2;
        String tipoPlan = "plus";
//        if (fechaDeLanzamiento > 2022) {
//
//            System.out.println("Pelicula mas popilares");
//        }else {
//            System.out.println("Peliculas retro que aun vale la pena ver.");
//        }

        if(incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfruta de tu pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }


    }
}

