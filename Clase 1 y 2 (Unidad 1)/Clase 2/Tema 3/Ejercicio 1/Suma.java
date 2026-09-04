public class Suma {

    public static int sumarDigitos(int n) {
        if (n < 10) { 

            // CASO BASE: Si tiene un solo dígito, la suma es el propio número.
            // El programa termina, sino sería un bucle infinito.

            return n;

        } else {

            // CASO RECURSIVO: Suma el último dígito al resto del número.
            // Hay que tener cuidado al usar recursividad, debe haber un caso base que lo detenga.
            return (n % 10) + sumarDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 1212;
        System.out.println("La suma de los dígitos es: " + sumarDigitos(numero));
    }
}