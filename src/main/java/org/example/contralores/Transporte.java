package org.example.contralores;

public class Transporte extends Viaje {

    private int tipoTransporte, medioTransporte;
    private double valorPasaje;

    public Transporte() {
    }

    public Transporte(int tipoViaje, String origen, String destino, String fechaViajeIda, String fechaViajeRegreso, int tipoTransporte, int medioTransporte, double valorPasaje) {
        super(tipoViaje, origen, destino, fechaViajeIda, fechaViajeRegreso);
        this.tipoTransporte = tipoTransporte;
        this.medioTransporte = medioTransporte;
        this.valorPasaje = valorPasaje;
    }

    public int getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(int tipoTransporte) {
        if(tipoTransporte == 1 || tipoTransporte == 2){
            this.tipoTransporte = tipoTransporte;
        }else{
            System.out.println("opcion incorrecta!!!");
        }
    }

    public int getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(int medioTransporte) {
        if(medioTransporte == 1 ){
            valorPasaje = 5000;
            this.medioTransporte = medioTransporte;
        } else if (medioTransporte == 2 || medioTransporte == 3) {
            valorPasaje = 20000;
            this.medioTransporte = medioTransporte;
        } else {
            System.out.println("Opcion invalida!!!");
        }
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
