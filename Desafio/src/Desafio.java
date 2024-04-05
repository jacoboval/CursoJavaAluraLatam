import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Jacobo Valencia";
        String tipoDeCuenta = "Corriente";
        double saldo = 1500.99;
        int opcion = 0;


        System.out.println("************************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("\n************************************");

        String menu = """
                *** Escriba el nùmero  de ña opciòn deseada ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2 :
                    System.out.println("¿Valor a retirar?");
                    double valorARerirar = teclado.nextDouble();
                    if (valorARerirar > saldo){
                        System.out.println("Saldo  insuficiente");
                    }else{
                        saldo = saldo - valorARerirar;
                        System.out.println("Saldo actualziado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Valor a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Saldo actualziado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, Gracias");
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione otra opción ");
            }
        }
    }
}