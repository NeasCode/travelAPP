package org.example.contralores;

public class Transporte {

    private String tipoTransporte;
    private double valorPasaje;


    public Transporte() {
    }

    public Transporte(String tipoTransporte, double valorPasaje) {
        this.tipoTransporte = tipoTransporte;
        this.valorPasaje = valorPasaje;
    }


    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
