package Clase7.Tema2.Ejercicio1;

public abstract class Figura {
    private String nombre;

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

}