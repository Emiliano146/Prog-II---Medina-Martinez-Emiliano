package Clase8.modelo;

public class PaqueteFragil extends Paquete implements Enviable {
    private String nivelProteccion;

    // Constructor
    public PaqueteFragil(String codigoTrack, double pesoKg, String destino, String nivelProteccion) {
        super(codigoTrack, pesoKg, destino);

        if (nivelProteccion != "Baja" && nivelProteccion != "Media" && nivelProteccion != "Alta") {
            throw new IllegalArgumentException("El nivel de protección debe ser 'Baja', 'Media' o 'Alta'");
        }

        this.nivelProteccion = nivelProteccion;
    }

    @Override 
    public double calcularCostoEnvio() {

        if (nivelProteccion == "Alta") {
            return (1000 * getPesoKg()) * 1.3;
        }

        if (nivelProteccion == "Media") {
            return (1000 * getPesoKg()) * 1.15;
        }

        return 1000 * getPesoKg();
        
    }

    @Override
    public boolean esAptoParaEnvioAereo() {
        return false;
    }

    @Override
    String obtenerDetalle() {
        return "Resumen del paquete"
                + ": código: " + getCodigoTrack()
                + ", destino: " + getDestino()
                + ", peso: " + getPesoKg()
                + ", nivel de protección: " + nivelProteccion
                + ".";
    }
}
