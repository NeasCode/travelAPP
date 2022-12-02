package org.example.contralores;

public class Viaje {

    private int tipoViaje;
    private String origen, destino, fechaViajeIda, fechaViajeRegreso;

    public Viaje() {
    }

    public Viaje(int tipoViaje, String origen, String destino, String fechaViajeIda, String fechaViajeRegreso) {
        this.tipoViaje = tipoViaje;
        this.origen = origen;
        this.destino = destino;
        this.fechaViajeIda = fechaViajeIda;
        this.fechaViajeRegreso = fechaViajeRegreso;
    }


    public int getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(int tipoViaje) {
        if (tipoViaje != 1 && tipoViaje != 2){
            System.out.println("opcion invalida!!!");
        }else {
            this.tipoViaje = tipoViaje;
        }

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

    public double calcularAuxilioVuelo(int cargo, double salario){

        if (tipoViaje == 1 && cargo == 1){
            salario = salario * 0.2;
        } else if (tipoViaje == 1 && cargo == 2) {
            salario = salario * 0.3;
        } else if (tipoViaje == 2 && cargo == 1) {
            salario = salario * 0.4;
        }else {
            salario = salario * 0.5;
        }

        return salario;
    }


    public double calcularCostoVuelo(int tipoTransporte, double valorViaje){
        if(tipoViaje == 1 && tipoTransporte == 1){
            valorViaje = 280000;
        }else if (tipoViaje == 1 && tipoTransporte == 2){
            valorViaje = 140000;
        }else if (tipoViaje == 2 && tipoTransporte == 1) {
            valorViaje = 2000000;
        }else if (tipoViaje == 2 && tipoTransporte == 2) {
            valorViaje = 1300000;
        }

        return valorViaje;
    }

}
