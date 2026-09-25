package Ejercicio_de_la_clase;

public class Empleado {
    protected String nombre;
    protected int legajo;

    Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    double calcularSueldo() {
        return 0;
    }

    String toString(String nombre, int legajo) {
        return nombre + " (" + legajo + ") - $" + calcularSueldo();
    }
}