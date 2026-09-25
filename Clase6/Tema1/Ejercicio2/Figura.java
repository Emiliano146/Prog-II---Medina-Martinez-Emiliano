package Clase6.Tema1.Ejercicio2;

public class Figura {
    private String nombre;

    // Constructor
    public Figura(String nombre) {
        if (!nombre.equals("Círculo") && !nombre.equals("Rectángulo")) {
            throw new IllegalArgumentException("La figura solo puede ser \"Círculo\" o \"Rectángulo\"");
        }

        this.nombre = nombre;
    }
}