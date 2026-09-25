package Clase6.Tema3.Ejercicio2;

public class Main {

    public static void sumarArea(Figura[] figuras) {
    double total = 0;

    for (Figura figura : figuras) {
        double area = figura.calcularArea();

        System.out.println("Area del " + figura.getNombre() + " = " + area);

        total += area;
    }

    System.out.println("La suma de todas las areas es " + total);
}
    public static void main(String[] args) {

        Figura figuras[] = new Figura[6];
        figuras[0] = new Circulo(40);
        figuras[1] = new Rectangulo(20, 10);
        figuras[2] = new Triangulo(10, 20, 20);
        figuras[3] = new Circulo(10);
        figuras[4] = new Rectangulo(30, 20);
        figuras[5] = new Triangulo(2, 3, 4);

        try {
            figuras[5] = new Triangulo(2, 3, 44444);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sumarArea(figuras);
    }
}