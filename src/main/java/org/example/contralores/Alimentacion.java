package org.example.contralores;

public class Alimentacion {

    private int comidasExtras;
    private double valorAlimentacion;


    public Alimentacion() {
    }

    public Alimentacion(int comidasExtras, double valorAlimentacion) {
        this.comidasExtras = comidasExtras;
        this.valorAlimentacion = valorAlimentacion;
    }


    public int getComidasExtras() {
        return comidasExtras;
    }

    public void setComidasExtras(int comidasExtras) {
        this.comidasExtras = comidasExtras;
    }

    public double getValorAlimentacion() {
        return valorAlimentacion;
    }

    public void setValorAlimentacion(double valorAlimentacion) {
        this.valorAlimentacion = valorAlimentacion;
    }
}


