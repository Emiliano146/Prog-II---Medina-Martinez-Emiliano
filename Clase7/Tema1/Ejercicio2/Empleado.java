package Clase7.Tema1.Ejercicio2;

public class Empleado {
    private String nombre;
    private int legajo;

    //Constructor
    Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo() {
        return 0;
    }
}
