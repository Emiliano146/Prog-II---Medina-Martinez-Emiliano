package Clase7.Tema1.Ejercicio2;

public class EmpleadoAsalariado extends Empleado {
    private double sueldoBasico;
    private double bono;

    // Constructor
    EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    // Sobrecarga del constructor anterior
    EmpleadoAsalariado(String nombre, int legajo) {
        super(nombre, legajo);
        this.sueldoBasico = 0;
        this.bono = 0;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}