package Ejercicio_de_la_clase;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    EmpleadoPorHoras(String nombre, int legajo, double horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}