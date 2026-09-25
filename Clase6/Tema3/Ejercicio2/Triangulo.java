package Clase6.Tema3.Ejercicio2;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        // el super debe ir antes de la validación, ya que es obligatorio
        super("Triángulo");

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Herón
        // No voy a mentir, busqué en internet

        double perimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));

        return area;
    }

}
