package Clase6.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo redondo = new Circulo(50);
        Rectangulo cuadrado = new Rectangulo(20, 20);

        System.out.println("Area del círculo: " + redondo.calcularArea());
        System.out.println("Area del rectángulo: " + cuadrado.calcularArea());


        // Yo puedo hacer esto:
        Figura figura = new Figura("Figura");
        System.out.println(figura.getNombre());
        // Pero no tiene sentido, figura no debería poder instanciarse
        // Pero nada previene que pueda hacerlo y no de ningún error
        // para prevenir eso, hay que usar abstract
    }
}