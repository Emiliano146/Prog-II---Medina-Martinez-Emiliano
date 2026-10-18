
package Clase8.Ejercicio2.modelo;

public abstract class Espacio implements Reservable {

    private String identificador;
    private int capacidadMaximaPersonas;
    private double precioXhora;

    public Espacio(String identificador,
            int capacidadMaximaPersonas,
            double precioXhora) {

        if (identificador == null || identificador.trim().isEmpty()) {
            throw new IllegalArgumentException("El identificador no puede ser nulo ni estar vacío.");
        }

        if (capacidadMaximaPersonas <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }

        if (precioXhora <= 0) {
            throw new IllegalArgumentException("El precio por hora debe ser mayor a cero.");
        }

        this.identificador = identificador;
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        this.precioXhora = precioXhora;
    }

    public String nuevaCapacidad(int nuevaCapacidad) {
        validarCapacidad(nuevaCapacidad);
        capacidadMaximaPersonas = nuevaCapacidad;

        return "Nueva capacidad de " + identificador + ": " + capacidadMaximaPersonas;
    }

    public String nuevaCapacidad(int nuevaCapacidad,
            boolean mobiliarioEspecialNecesario) {

        validarCapacidad(nuevaCapacidad);
        capacidadMaximaPersonas = nuevaCapacidad;

        if (mobiliarioEspecialNecesario
                && !identificador.endsWith(" [Mobiliario Especial]")) {
            identificador += " [Mobiliario Especial]";
        }

        return "Nueva capacidad de " + identificador + ": " + capacidadMaximaPersonas;
    }

    private void validarCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getCapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public double getPrecioXhora() {
        return precioXhora;
    }

    @Override
    public abstract double calcularCosto(double horas);

    @Override
    public abstract boolean estaDisponible();

    @Override
    public String toString() {
        return "Identificador: " + identificador
                + " | Capacidad: " + capacidadMaximaPersonas
                + " | Precio por hora: $" + precioXhora;
    }
}