package Clase8.modelo;

abstract class Paquete {
    private String codigoTrack;
    private double pesoKg;
    private String destino;

    // Constructor

    public Paquete(String codigoTrack, double pesoKg, String destino) {

        if (codigoTrack == null || codigoTrack.isEmpty()) {
            throw new IllegalArgumentException("El código de tracking no puede estar vacío");
        } 

        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso no puede ser cero o negativo");
        } 

        this.pesoKg = pesoKg;
        this.codigoTrack = codigoTrack;
        this.destino = destino;
    }

    // Getters //

    public String getCodigoTrack() {
        return codigoTrack;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    // Setters

    public void setCodigoTrack(String codigoTrack) {
        if (codigoTrack == null || codigoTrack.isEmpty()) {
            throw new IllegalArgumentException("El código de tracking no puede estar vacío");
        }

        this.codigoTrack = codigoTrack;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso no puede ser cero o negativo");
        }

        this.pesoKg = pesoKg;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    ////////

    public void actualizarDestino(String nuevoDestino) {
        destino = nuevoDestino;

        System.out.println("Destino actualizado a " + destino);
    }

    public void actualizarDestino(String nuevoDestino, boolean express) {
        destino = nuevoDestino + " [PRIORITARIO]";

        System.out.println("Destino actualizado a " + destino);
    }

    abstract String obtenerDetalle();

}