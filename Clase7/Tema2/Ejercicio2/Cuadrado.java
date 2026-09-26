package Clase7.Tema2.Ejercicio2;

public class Cuadrado extends Figura {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}