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
        valorAlimentacion = 20000;
        this.valorAlimentacion = valorAlimentacion;
    }

    public double valorComidasExtras (int hotel, int comidasExtras, double valorAlimentacion){
        double valorComidas = 0;
        if (hotel == 2){
            comidasExtras = 1;
            valorComidas = comidasExtras * valorAlimentacion;
        }
        return valorComidas;
    }

    public double valorNetoComidas (int netoAlimento, double valorComida){

        if (comidasExtras == 1){
            valorComida = netoAlimento;
        }

        return netoAlimento;
    }


}


