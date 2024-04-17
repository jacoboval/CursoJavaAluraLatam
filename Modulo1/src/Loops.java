import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 8;
        double mediaEvaluaciones = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota para lña pelicula de Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluacines para Matrix ex: " + mediaEvaluaciones/3);
    }
}
