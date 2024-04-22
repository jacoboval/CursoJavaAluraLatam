public class main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + figura1.calcularArea()); // Salida: Área del círculo: 78.54
        System.out.println("Área del rectángulo: " + figura2.calcularArea()); // Salida: Área del rectángulo: 12.0
    }
}