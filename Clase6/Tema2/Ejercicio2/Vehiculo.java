package Clase6.Tema2.Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    
    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String toString() {
        return "Marca: " + marca + ", modelo: " + modelo + ", año: " + anio;
    }
}
