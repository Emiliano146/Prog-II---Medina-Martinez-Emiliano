package Clase7.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.operar(1, 2));
        // Acá se usa la firma int operar(int num1, int num2)
        // La sobrecarga se decide en tiempo de compilación

        System.out.println(calc.operar(1.0, 2.0));
        // Acá se usa la firma double operar(double num1, double num2)
        // Se decide en tiempo de compilación

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(calc.operar(nums));
        // Acá se usa la firma int operar(int[] nums)
        // Se decide en tiempo de compilación
    }
}
