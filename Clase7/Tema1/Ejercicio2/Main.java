package Clase7.Tema1.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAsalariado("Emi", 12122);
        // Acá se usa el constructor EmpleadoAsalariado(String nombre, int legajo);
        // El empleado tendrá un sueldo de 0 y un bono de 0

        Empleado empleado2 = new EmpleadoAsalariado("Mario", 11188, 99999, 777);
        // Acá se usa el constructor EmpleadoAsalariado(String nombre, int legajo, int sueldoBasico, int bono);
        // El empleado tendrá un sueldo de 99999 y un bono de 7

        // Acá usamos sobrecarga de constructores.
        // Los dos constructores tienen el mismo nombre, pero reciben distintos parámetros.
        // Java decide qué constructor utilizar según los argumentos que pasamos.
        // Esta decisión se realiza en compilación.

        System.out.println("Sueldo empleado1: $" + empleado1.calcularSueldo());
        System.out.println("Sueldo empleado2: $" + empleado2.calcularSueldo());

        // Acá usamos sobreescritura.
        // EmpleadoAsalariado hereda de Empleado y redefine el método calcularSueldo().
        // El método tiene la misma firma, pero cambia su comportamiento.
        // En este caso, la versión que se ejecuta se determina durante la ejecución,
        // según el tipo real del objeto.

        // Por ejemplo, aunque empleado1 está declarado como Empleado,
        // el objeto que realmente creamos es un EmpleadoAsalariado.
        // Por eso se ejecuta calcularSueldo() de EmpleadoAsalariado.
    }
}
