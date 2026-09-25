package Clase6.Tema3.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Empleado empleados[] = new Empleado[4];
        empleados[0] = new EmpleadoPorHoras("Emi", 54321, 40, 20000);
        empleados[1] = new EmpleadoAsalariado("Leonel", 44444, 650000, 10500);
        empleados[2] = new EmpleadoPorHoras("Roberto", 75633, 48, 18500);
        empleados[3] = new EmpleadoAsalariado("Luana", 99834, 600000, 25000);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + " es " + empleado.getClass().getSimpleName());
            System.out.println("Sueldo: $" + empleado.calcularSueldo() + "\n");
        }

        // Aunque la referencia declarada es de tipo Empleado, se ejecuta la fórmula correcta de cada subclase
        // ya que se está invocando a la función calcularSueldo() de cada subclase
        // Esto funciona gracias al polimorfismo con el @Override
    }
}
