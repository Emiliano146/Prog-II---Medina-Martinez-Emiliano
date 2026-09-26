package Clase7.Tema2.Ejercicio1;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    //Constructor
    public Rectangulo (double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
    
}
