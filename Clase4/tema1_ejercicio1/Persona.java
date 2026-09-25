package Clase4.tema1_ejercicio1;

// uso package para organizar los archivos

public class Persona {

    private String nombre;
    private int dni;
    private int edad;

    // Constructor parametrizado
    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad;
    }

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 12345678, 30);
        Persona p2 = new Persona("Maria", 87654321, 25);
        Persona p3 = new Persona("Pedro", 11223344, 40);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}