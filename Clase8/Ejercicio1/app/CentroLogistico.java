package Clase8.Ejercicio1.app;

import java.util.ArrayList;

import Clase8.Ejercicio1.modelo.Enviable;

public class CentroLogistico {

    private ArrayList<Enviable> inventario = new ArrayList<>();

    public void registrarPaquete(Enviable e) {
        inventario.add(e);
    }

    public void mostrarReporteEnvios() {

        // Recorre el inventario de forma polimórfica imprimiendo el detalle del paquete y su costo total de envío
        for (Enviable e : inventario) {
            System.out.println(e.toString());
            System.out.println("Costo de envío: " + e.calcularCostoEnvio());
        }
    }

    public double calcularRecaudacionTotal() {
        double total = 0;
        for (Enviable e : inventario) {
            total += e.calcularCostoEnvio();
        }
        return total;
    }

}