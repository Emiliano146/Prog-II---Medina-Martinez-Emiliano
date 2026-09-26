package Clase7.Tema2.Ejercicio2;

import java.util.Arrays;
// Agrego esto para usar Arrays.sort

public class Main {
    public static void main(String[] args) {

        Figura c = new Circulo(5);
        Figura r = new Rectangulo(5, 10);
        Figura t = new Triangulo(5, 10, 9);
        Figura q = new Cuadrado(5);

        Figura[] figuras = {c, r, t, q};
        
        System.out.println("\nAntes de ordenar: ");
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + ": " + figura.calcularArea());
        }
        
        Arrays.sort(figuras);

        System.out.println("\nDespués de ordenar: ");

        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + ": " + figura.calcularArea());
        }
    }
}