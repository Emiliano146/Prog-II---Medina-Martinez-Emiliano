package Clase7.Tema2.Ejercicio1;

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
