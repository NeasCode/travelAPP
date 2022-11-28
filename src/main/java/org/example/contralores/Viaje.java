package org.example.contralores;

public class Viaje extends Transporte {

    private int tipoViaje;
    private String origen, destino, fechaViajeIda, fechaViajeRegreso;

    public Viaje() {
    }

    public Viaje(String tipoTransporte, String medioTransporte, double valorPasaje, int tipoViaje, String origen, String destino, String fechaViajeIda, String fechaViajeRegreso) {
        super(tipoTransporte, medioTransporte, valorPasaje);
        this.tipoViaje = tipoViaje;
        this.origen = origen;
        this.destino = destino;
        this.fechaViajeIda = fechaViajeIda;
        this.fechaViajeRegreso = fechaViajeRegreso;
    }


    public int isTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
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
}
