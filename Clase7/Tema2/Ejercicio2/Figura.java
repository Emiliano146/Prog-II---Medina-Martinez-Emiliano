package Clase7.Tema2.Ejercicio2;

public abstract class Figura implements Comparable<Figura> {
    private String nombre;

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.calcularArea(), o.calcularArea());
    }

}