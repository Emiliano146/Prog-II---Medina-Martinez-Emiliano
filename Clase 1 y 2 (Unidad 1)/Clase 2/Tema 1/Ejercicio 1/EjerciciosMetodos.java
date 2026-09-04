public class EjerciciosMetodos {
    public static void tablaDeMultiplicar(int n) {

        // Muestra la tabla de multiplicar del número n. No retorna nada.

        System.out.println("Tabla de multiplicar del " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
    }

    public static double promedio(int[] valores) {

        // Retorna el promedio de los valores del arreglo.

        double suma = 0;

        for (int i = 0; i < valores.length; i++) {

            // Sumo cada valor del arreglo a la variable suma.
            suma += valores[i];
        }

        // Lo divido y retorno.
        return suma / valores.length;
    }

    public static void main(String[] args) {

        // tablaDeMultiplicar es un procedimiento, ya que no retorna nada.
        tablaDeMultiplicar(5);

        // promedioValores es una función, ya que retorna un valor.
        int[] numeros = { 10, 20, 30, 40, 50 };
        double promedioValores = promedio(numeros);
        System.out.println("El promedio es: " + (int) promedioValores);

        // Java no usa una sintaxis especial para diferenciar entre procedimientos y funciones,
        // pero la diferencia radica en si retornan un valor o no.
    }
}
