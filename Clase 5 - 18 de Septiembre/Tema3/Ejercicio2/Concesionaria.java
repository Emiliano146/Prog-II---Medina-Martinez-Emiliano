package Tema3.Ejercicio2;

import java.util.ArrayList; // se usa este para ArrayList

// Array y ArrayList no son lo mismo: array tiene tamaño fijo, ArrayList puede cambiar su tamaño libremente.

public class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> vehiculo = new ArrayList<>();

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculo.add(vehiculo);
        System.out.println("Vehículo añadido: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - $" + vehiculo.getPrecio());
    }

    public String buscarPorMarca(String marca) {

        for (Vehiculo v : vehiculo) {
            if (v.getMarca().equals(marca)) {
                return "Primer vehículo encontrado es: " + v.getMarca() + " " + v.getModelo();
            }
        }
        return "Se buscó " + marca + ", pero no se encontró.";
    }

    public void valorTotalStock() {

        double totalStock = 0;
        for (Vehiculo v : vehiculo) {
            totalStock += v.getPrecio();
        }

        System.out.println("El valor total del stock es: $" + totalStock);
    }

}
