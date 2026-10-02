package Clase8.Ejercicio2.modelo;

public class EscritorioIndividual extends Espacio {

    // Constructor
    public EscritorioIndividual(String identificador, int capacidadMaximaPersonas, double precioXhora, boolean monitorExtra) {

        super(identificador, capacidadMaximaPersonas, calcularPrecio(precioXhora, monitorExtra));

    }

    // Método para agregar 15% al precio por hora, en caso de que haya un monitor extra
    private static double calcularPrecio(double precio, boolean monitorExtra) {
        if (monitorExtra) {
            precio *= 1.15;
        }

        return precio;
    }
}