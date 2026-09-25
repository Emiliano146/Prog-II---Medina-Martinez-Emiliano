package Clase6.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo redondo = new Circulo("Círculo", 50);
        Rectangulo cuadrado = new Rectangulo("Rectángulo", 20, 20);

        try {
            Circulo juan = new Circulo("a", 56);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
