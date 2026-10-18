
package Clase8.Ejercicio2.modelo;

public class EscritorioIndividual extends Espacio {

    private boolean monitorExtra;

    public EscritorioIndividual(String identificador,
            int capacidadMaximaPersonas,
            double precioXhora,
            boolean monitorExtra) {

        super(identificador, capacidadMaximaPersonas, precioXhora);
        this.monitorExtra = monitorExtra;
    }

    @Override
    public double calcularCosto(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero.");
        }

        double costo = getPrecioXhora() * horas;

        if (monitorExtra) {
            costo *= 1.15;
        }

        return costo;
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }

    public boolean tieneMonitorExtra() {
        return monitorExtra;
    }

    @Override
    public String toString() {
        return "Escritorio Individual | " + super.toString()
                + " | Monitor extra: " + (monitorExtra ? "Sí" : "No");
    }
}