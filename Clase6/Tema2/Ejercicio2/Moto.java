package Clase6.Tema2.Ejercicio2;

public class Moto extends Vehiculo{
    private int cilindrada;

    // Constructor
    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", cilindrada: " + cilindrada;
    }
}
