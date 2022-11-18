package org.example.contralores;

public class Viaje {

    private boolean tipoViaje;
    private String medioTransporte, origen, destino, fechaViajeIda, fechaViajeRegreso;
    private double valorPasaje;

    public Viaje() {
    }

    public Viaje(boolean tipoViaje, String medioTransporte, String origen, String destino, String fechaViajeIda, String fechaViajeRegreso, double valorPasaje) {
        this.tipoViaje = tipoViaje;
        this.medioTransporte = medioTransporte;
        this.origen = origen;
        this.destino = destino;
        this.fechaViajeIda = fechaViajeIda;
        this.fechaViajeRegreso = fechaViajeRegreso;
        this.valorPasaje = valorPasaje;
    }


    public boolean isTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(boolean tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaViajeIda() {
        return fechaViajeIda;
    }

    public void setFechaViajeIda(String fechaViajeIda) {
        this.fechaViajeIda = fechaViajeIda;
    }

    public String getFechaViajeRegreso() {
        return fechaViajeRegreso;
    }

    public void setFechaViajeRegreso(String fechaViajeRegreso) {
        this.fechaViajeRegreso = fechaViajeRegreso;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
