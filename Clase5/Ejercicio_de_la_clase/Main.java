package Ejercicio_de_la_clase;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoPorHoras("Juan", 123, 40, 15);
        System.out.println(empleado1.toString(empleado1.nombre, empleado1.legajo));
    }
}
