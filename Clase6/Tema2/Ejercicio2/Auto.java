package Clase6.Tema2.Ejercicio2;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor
    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidad de puertas: " + cantidadPuertas;
    }
}
