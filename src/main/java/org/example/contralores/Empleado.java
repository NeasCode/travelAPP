package org.example.contralores;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Empleado {
    private String nombre, apellido, celular;
    private int edad, cargo, cedula, visa;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int cedula, int cargo, String celular, int edad, double salario, int visa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.celular = celular;
        this.edad = edad;
        this.salario = salario;
        this.visa = visa;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public int getCedula() {

        return cedula;
    }

    public void setCedula(int cedula) {

        this.cedula = cedula;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        if (cargo == 1){
            salario = 2200000;
            this.cargo = cargo;
        } else if (cargo == 2) {
            salario= 5000000;
            this.cargo = cargo;
        }else {
            System.out.println("Ingrese una opcion valida");
        }
    }

    public String getCelular() {

        return celular;
    }

    public void setCelular(String celular) {

        this.celular = celular;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18 ){
            System.out.println("Ingrese una edad correcta");

        }else if(edad > 80) {
            System.out.println("No cumples con los parametros para viajar");
        }else {
            this.edad = edad;
        }
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getVisa() {

        return visa;
    }

    public void setVisa(int visa) {
        if (visa == 2 ){
            System.out.println("Si no cuenta con visa ni pasaporte no puede realizar viajes internacionales!!!");
        }

        this.visa = visa;
    }
}
