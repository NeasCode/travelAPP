package org.example.contralores;

public class Empleado {
    private String nombre, apellido, cedula,cargo, celular;
    private int edad;
    private double salario, visa;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String cargo, String celular, int edad, double salario, double visa) {
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVisa() {
        return visa;
    }

    public void setVisa(double visa) {
        this.visa = visa;
    }
}
