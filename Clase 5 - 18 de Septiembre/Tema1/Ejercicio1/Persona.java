package Tema1.Ejercicio1;

public class Persona {
    private String nombre;
    private int dni, edad;

    // Constructor
    Persona(String nombre, int dni, int legajo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = legajo;
    }

    public String toString() {
        return nombre + " (" + dni + ") - " + edad;
    }
}
