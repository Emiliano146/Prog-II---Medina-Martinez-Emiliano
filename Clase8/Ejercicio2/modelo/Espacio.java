package Clase8.Ejercicio2.modelo;

public abstract class Espacio {
    // identificador y código único

    private String identificador;
    private int capacidadMaximaPersonas;
    private double precioXhora;

    // Constructor
    public Espacio(String identificador, int capacidadMaximaPersonas, double precioXhora) {
        if (identificador == null || identificador.isEmpty()) {
            throw new IllegalArgumentException("El identificador no puede estar vacío.");
        }

        if (capacidadMaximaPersonas <= 0) {
            throw new IllegalArgumentException("La capacidad máxima de personas debe ser mayor a 0.");
        }

        if (precioXhora <= 0) {
            throw new IllegalArgumentException("El precio por hora debe ser mayor a 0.");
        }

        this.identificador = identificador;
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        this.precioXhora = precioXhora;
    }

    public String nuevaCapacidad(int nuevaCapacidad) {
        capacidadMaximaPersonas = nuevaCapacidad;

        return "Nueva capacidad: " + capacidadMaximaPersonas;
    }

    public String nuevaCapacidad(int nuevaCapacidad, boolean mobiliarioEspecialNecesario) {
        capacidadMaximaPersonas = nuevaCapacidad;

        if (mobiliarioEspecialNecesario) {
            return "Nueva capacidad: " + capacidadMaximaPersonas + " [Mobiliario Especial]";
        }

        return "Nueva capacidad: " + capacidadMaximaPersonas;
    }

    
    
}
