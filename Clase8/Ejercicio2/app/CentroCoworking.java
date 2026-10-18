
package Clase8.Ejercicio2.app;

import java.util.ArrayList;
import Clase8.Ejercicio2.modelo.*;

public class CentroCoworking {

    private ArrayList<Reservable> espacios;

    public CentroCoworking() {
        espacios = new ArrayList<>();
    }

    public void registrarEspacio(Reservable espacio) {
        if (espacio == null) {
            throw new IllegalArgumentException("El espacio no puede ser nulo.");
        }

        espacios.add(espacio);
    }

    public void mostrarReporte(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero.");
        }

        System.out.println("\nReporte de reservas:");

        for (Reservable espacio : espacios) {
            System.out.println("---");

            if (espacio instanceof Espacio) {
                System.out.println(espacio);
            }

            System.out.println(
                    "Disponible: "
                            + (espacio.estaDisponible() ? "Sí" : "No"));

            if (espacio.estaDisponible()) {
                System.out.printf(
                        "Costo estimado para %.2f horas: $%.2f%n",
                        horas,
                        espacio.calcularCosto(horas));
            } else {
                System.out.println(
                        "No se puede reservar este espacio.");
            }
        }

        System.out.println("---");
        System.out.printf(
                "Recaudación total estimada: $%.2f%n",
                calcularRecaudacionTotal(horas));
        System.out.println("===");
    }

    public double calcularRecaudacionTotal(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero.");
        }

        double total = 0;

        for (Reservable espacio : espacios) {
            if (espacio.estaDisponible()) {
                total += espacio.calcularCosto(horas);
            }
        }

        return total;
    }
}