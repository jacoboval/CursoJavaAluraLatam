import java.util.Random;
import java.util.Scanner;

public class    AdivinaNumero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numGenerado = new Random().nextInt(100);
        System.out.println(numGenerado);
        int intentos = 0;
        while (intentos < 5){

            System.out.println("Ingerse un número: ");
            int numUser = lector.nextInt();
            intentos ++;

            if (numUser == numGenerado){
                System.out.println("Felicidades, Adivinaste");
                break;
            }else if(numUser < numGenerado){
                System.out.println("El número ingresado en menor.");
            }else{
                System.out.println("El númewor ingresado es mayor");
            }
        }

        if(intentos == 5){
        System.out.println("No lo lograste");
        }


    }
}

