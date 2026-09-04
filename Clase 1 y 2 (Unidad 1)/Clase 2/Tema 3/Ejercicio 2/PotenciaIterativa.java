public class PotenciaIterativa {

    // Método iterativo, se utiliza un for.

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
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
