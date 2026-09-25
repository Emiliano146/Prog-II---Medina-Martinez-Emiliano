package Clase6.Tema2.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Emi", 54321, 40, 20000);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Leonel", 44444, 650000, 10500);

        System.out.println("Empleado 1: " + empleado1.getNombre() + ", es un EmpleadoPorHoras");
        System.out.println("Sueldo: $" + empleado1.calcularSueldo() + "\n");

        System.out.println("Empleado 2: " + empleado2.getNombre() + ", es un EmpleadoAsalariado");
        System.out.println("Sueldo: $" + empleado2.calcularSueldo());        
    }

}
