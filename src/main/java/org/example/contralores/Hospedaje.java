package org.example.contralores;

public class Hospedaje extends Viaje {

    private int duracionEstadia, incluyeAlimentacion, hotel, tipoHabitacion;
    private double valorHotel;


    public Hospedaje() {
    }


    public Hospedaje(int duracionEstadia, int hotel, int tipoHabitacion, int incluyeAlimentacion, double valorHotel) {
        this.duracionEstadia = duracionEstadia;
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

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        if (hotel == 1){
            incluyeAlimentacion = 3;
            System.out.println("Este hotel incluye " + incluyeAlimentacion + " comidas");
            this.hotel = hotel;
        } else if (hotel == 2) {
            System.out.println("Este hotel incluye " + incluyeAlimentacion + " comidas");
            incluyeAlimentacion = 2;
            this.hotel = hotel;
        } else if (hotel == 3){
            System.out.println("Este hotel no incluye alimentacion!!!");
            incluyeAlimentacion = 0;
            this.hotel = hotel;
        }else {
            System.out.println("El tipo de hospedaje no existe... Ingrese una opcion valida!!!");
        }
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {

        if (hotel == 1 && tipoHabitacion == 1){
            valorHotel = 200000;
            this.tipoHabitacion = tipoHabitacion;
        } else if (hotel == 1 && tipoHabitacion == 2 || hotel == 2 && tipoHabitacion == 2) {
            valorHotel = 400000;
            this.tipoHabitacion = tipoHabitacion;
        } else if (hotel == 2 && tipoHabitacion == 1) {
            valorHotel = 150000;
            this.tipoHabitacion = tipoHabitacion;
        } else if (hotel == 3) {
            valorHotel = 80000;
            this.tipoHabitacion = tipoHabitacion;
        } else {
            System.out.println("Opcion incorrecta!!!");
        }
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

    public double valorTotalHotel(){
        double valorNetoHotel = duracionEstadia * valorHotel;
        return valorNetoHotel;
    }
}