
package Clase8.Ejercicio2.modelo;

public class SalaReuniones extends Espacio {

    private double costoLimpieza;
    private boolean incluyeProyector;

    public SalaReuniones(String identificador,
            int capacidadMaximaPersonas,
            double precioXhora,
            double costoLimpieza,
            boolean incluyeProyector) {

        super(identificador, capacidadMaximaPersonas, precioXhora);

        if (costoLimpieza < 0) {
            throw new IllegalArgumentException("El costo de limpieza no puede ser negativo.");
        }

        this.costoLimpieza = costoLimpieza;
        this.incluyeProyector = incluyeProyector;
    }

    @Override
    public double calcularCosto(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero.");
        }

        return (getPrecioXhora() * horas) + costoLimpieza;
    }

    @Override
    public boolean estaDisponible() {
        return !(incluyeProyector && costoLimpieza == 0);
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }

    public boolean incluyeProyector() {
        return incluyeProyector;
    }

    @Override
    public String toString() {
        return "Sala de Reuniones | " + super.toString()
                + " | Costo de limpieza: $" + costoLimpieza
                + " | Incluye proyector: "
                + (incluyeProyector ? "Sí" : "No");
    }
}