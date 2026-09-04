public class Compilacion {

    // Atributo de clase. Todo el código de la clase puede acceder a esta variable.
    static int x = 100;
    
    public static void por2(int x) {

        // Multiplica el valor de x por 2.

        int resultado;
        if (x > 0) {
            resultado = x * 2;
            System.out.println(resultado);
        }
    }

    public static void shadowing(int x) {

        // En este método, se usa el parámetro x.
        // La variable de clase x queda "oculta" por el parámetro x.
        // Se puede acceder a la variable de clase usando Compilacion.x
        // A esto se le llama "shadowing" (ocultamiento).

        if (x > 0) {
            System.out.println("x: " + x);
            System.out.println("Compilacion.x: " + Compilacion.x);
        }

    }

    public static void main(String[] args) {
        por2(5);
        shadowing(9);
    }
}
