package Clase6.Tema1.Ejercicio2;

public class Circulo extends Figura {
    private double radio;

    //Constructor
    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
