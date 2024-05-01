import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java. lang. String;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarDivisa consulta = new ConsultarDivisa();

        //while(true){
            System.out.println("Bienvenid@ al Convertidor de monedas");


//            var seleccion = Integer.parseInt(teclado.nextLine());
////
////
//            System.out.println("******************************");
//            System.out.println("Bienvenid@ al Convertidor de monedas");
//            System.out.println("1) Dolar => Peso Argentino");  // USD > ARS
//            System.out.println("2) Peso Argentino => Dolar");  // ARS > USD
//            System.out.println("3) Dolar => Real Brasileño");  // USD > BRL
//            System.out.println("4) Real Brasileño => Dolar");  // BRL > USD
//            System.out.println("5) Dolar => Peso Mexicano");   // USD > MXM
//            System.out.println("6 Peso Mexicano => Dolar");    // MXM > USD
//            System.out.println("7) Salir");
//            System.out.println("Elija una opción valida:");
//            System.out.println("******************************");
//
//            switch (seleccion){
//                case 1:
//                    String codigoDivisa = "ARS";
//                    break;
//                case 2:
//                    String codigoDivisa = "USD";
//                    break;
//                case 3:
//                    String codigoDivisa = "BRL";
//                    break;
//
//            }


            ///
//            if(seleccion == 1)
//                String codigoDivisa == "USD";
                String codigoDivisa = (teclado.nextLine());
//
//
//            if (seleccion==1){
//                break;
//            }
//

            Divisa divisa = consulta.buscarDivisa(codigoDivisa);
            System.out.println(codigoDivisa);

            //buscar en el diccionario
            //Map<String, Double> usandoHasMap = new HashMap<>();
            //Double divisaConvertir = usandoHasMap.get("EUR");


            System.out.println("Valores de " + divisa);



            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            try {
                generador.guardarJson(divisa);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }catch (NumberFormatException e) {
                System.out.println("Divisa no encontrada. " + e.getMessage());
            }

       // }// llave del while

    }
}
