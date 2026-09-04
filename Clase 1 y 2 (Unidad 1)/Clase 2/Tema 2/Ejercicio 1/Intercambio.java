public class Intercambio {

    public static void intercambio(int a, int b) {
        
        // Intercambia los valores de a y b.
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método intercambio: a = " + a + ", b = " + b);
    }
    
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
        intercambio(a, b);
        System.out.println("Después del intercambio: a = " + a + ", b = " + b);

        // ¿Por qué los valores de a y b no se intercambian en el método main?

        // Porque en Java, los parámetros se pasan por valor.
        // Esto significa que cuando se llama al método intercambio,
        // se pasa una copia de los valores de a y b, no las variables originales.

        // Por lo tanto, cualquier cambio realizado dentro del método intercambio
        // no afecta a las variables a y b en el método main.

    }
    
}
