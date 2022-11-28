package org.example.contralores;

public class Hospedaje {

    private int duracionEstadia, cantidadComidas, incluyeAlimentacion;
    private String hotel, tipoHabitacion;
    private double valorHotel;


    public Hospedaje() {
    }


    public Hospedaje(int duracionEstadia, int cantidadComidas, String hotel, String tipoHabitacion, int incluyeAlimentacion, double valorHotel) {
        this.duracionEstadia = duracionEstadia;
        this.cantidadComidas = cantidadComidas;
        this.hotel = hotel;
        this.tipoHabitacion = tipoHabitacion;
        this.incluyeAlimentacion = incluyeAlimentacion;
        this.valorHotel = valorHotel;
    }


    public int getDuracionEstadia() {
        return duracionEstadia;
    }

    public void setDuracionEstadia(int duracionEstadia) {
        this.duracionEstadia = duracionEstadia;
    }

    public int getCantidadComidas() {
        return cantidadComidas;
    }

    public void setCantidadComidas(int cantidadComidas) {
        this.cantidadComidas = cantidadComidas;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIncluyeAlimentacion() {
        return incluyeAlimentacion;
    }

    public void setIncluyeAlimentacion(int incluyeAlimentacion) {
        this.incluyeAlimentacion = incluyeAlimentacion;
    }

    public double getValorHotel() {
        return valorHotel;
    }

    public void setValorHotel(double valorHotel) {
        this.valorHotel = valorHotel;
    }
}
