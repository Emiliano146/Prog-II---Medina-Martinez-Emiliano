public class PotenciaRecursiva {

    // Método recursivo, se llama a sí mismo con un caso base.

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            // CASO BASE: Cualquier número elevado a la potencia de 0 es 1.
            return 1;
        } else {
            // CASO RECURSIVO: Multiplica la base por la potencia de la base con el exponente reducido en 1.
            return base * potencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        int base = 7;
        int exponente = 5;

        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero no negativo.");
        } else {
            System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));
        }
    }
}