package Clase6.Tema1.Ejercicio1;

public class EmpleadoAsalariado extends Empleado {
    private double sueldoBasico;
    private double bono;

    // Constructor
    EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getBono() {
        return bono;
    }
}