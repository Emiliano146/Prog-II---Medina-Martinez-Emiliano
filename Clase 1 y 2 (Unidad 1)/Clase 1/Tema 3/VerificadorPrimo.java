import java.util.Scanner;

public class VerificadorPrimo {

    public static void esPrimo(int n) {

        // Si el número ingresado es menor o igual a 1, aviso al usuario y termino el programa.

        if (n <= 1) {
            System.out.println("El número debe ser mayor que 1.");
            return;
        }

        // Ya que el número es mayor que 1, el programa continúa.
        // Creo un bool para saber después si es primo o no, por defecto lo pongo en verdadero.

        boolean esPrimo = true;

        // Hago un for, desde el número 2 (el primo más pequeño) hasta la raíz cuadrada de num.

        for (int i = 2; i <= Math.sqrt(n); i++) {

            // Si el resto del número dividido por i es 0, entonces no es primo.

            if (n % i == 0) {
                System.out.println(n + " no es primo.");
                esPrimo = false;
                break;
            }

        }

        // Si el número es primo, la variable esPrimo seguirá siendo verdadera.

        if (esPrimo) {
            System.out.println(n + " es primo.");
        }
    }

    public static void main(String[] args) {

        // Le pido al usuario un número y lo guardo en la variable n.
        // Para ello, creo un scanner para leer la entrada del usuario.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número a comprobar si es primo: ");
        int n = scanner.nextInt();

        // VS Code me recomienda cerrar el scanner, lo hago por si las dudas.
        scanner.close();

        esPrimo(n);
        }
    }