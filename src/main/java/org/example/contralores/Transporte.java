package org.example.contralores;

public class Transporte {

    private String tipoTransporte, medioTransporte;
    private double valorPasaje;

    public Transporte() {
    }

    public Transporte(String tipoTransporte, String medioTransporte, double valorPasaje) {
        this.tipoTransporte = tipoTransporte;
        this.medioTransporte = medioTransporte;
        this.valorPasaje = valorPasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
