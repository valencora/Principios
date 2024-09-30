package LiskovSubstitutionPrinciple;

public class Cuadrado extends Rectangulo {
    @Override
    public void setAncho(int lado) {
        this.ancho = this.alto = lado; // Ancho y alto deben ser iguales
    }

    @Override
    public void setAlto(int lado) {
        this.ancho = this.alto = lado; // Ancho y alto deben ser iguales
    }
}
