package LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(5);
        rectangulo.setAlto(10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Rectangulo cuadrado = new Cuadrado();
        cuadrado.setAncho(5); // Esto también ajusta la altura en la subclase Cuadrado
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
