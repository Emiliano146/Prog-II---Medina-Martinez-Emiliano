package Clase8.Ejercicio1.modelo;

public class PaqueteEstandar extends Paquete implements Enviable {
    private int diasEstimados;

    //Constructor

    public PaqueteEstandar(String codigoTrack, double pesoKg, String destino, int diasEstimados) {
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    // calcularCostoEnvio(): El costo base es $1000 * pesoKg.

    @Override
    public double calcularCostoEnvio() {
        return 1000 * getPesoKg();
    }

    // esAptoParaEnvioAereo(): Retorna true únicamente si pesoKg <= 15.0.

    @Override
    public boolean esAptoParaEnvioAereo() {
        if (getPesoKg() > 15) {
            return false;
        }

        return true;
    }

    // obtenerDetalle(): Retorna un resumen con el código, destino, peso y días estimados

    @Override
    String obtenerDetalle() {
        return "Resumen del paquete"
                + ": código: " + getCodigoTrack()
                + ", destino: " + getDestino()
                + ", peso: " + getPesoKg()
                + ", días estimados: " + diasEstimados
                + ".";
    }

}
