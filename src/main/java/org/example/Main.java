package org.example;
import org.example.contralores.Empleado;
import org.example.contralores.Hospedaje;
import org.example.contralores.Viaje;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Hospedaje hospedaje = new Hospedaje();
        Viaje viaje = new Viaje();

        int opcionMenu;


        do {
            System.out.println("1. Registro empleado \n2. Registrar viaje \n3. Ver empleados \n4. Ver viajes de un empleado \n0. Salir");
            opcionMenu = entradaDato.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    empleado.setNombre(entradaDato.next());
                    System.out.print("Ingrese el apellido: ");
                    empleado.setApellido(entradaDato.next());
                    System.out.print("Ingrese la cedula: ");
                    empleado.setCedula(entradaDato.next());
                    System.out.print("Cargo: \n1. Analista Jr. \n2. Analista Sr. \nElige una opcion: ");
                    empleado.setCargo(entradaDato.next());
                    System.out.print("Ingrese el numero de celular: ");
                    empleado.setCelular(entradaDato.next());
                    System.out.print("Ingrese la edad: ");
                    empleado.setEdad(entradaDato.nextInt());
                    System.out.print("Ingrese salario: ");
                    empleado.setSalario(entradaDato.nextDouble());
                    System.out.print("¿Tiene Visa o Pasaporte? \n1. Si \n2. No \n3. Ambas \n4. Ninguna de las anteriores \nElige una opcion: ");
                    empleado.setVisa(entradaDato.next());
                    break;
                case 2:
                    System.out.println("****** Datos del hospedaje ******");
                    System.out.println("****** Ingrese la fecha del viaje ******");
                    System.out.print("Fecha de ida (dd/mm/aaaa): ");
                    viaje.setFechaViajeIda(entradaDato.next());
                    System.out.print("Fecha de regreso (dd/mm/aaaa): ");
                    viaje.setFechaViajeRegreso(entradaDato.next());
                    System.out.println("¿Cuantos dias se va a hospedar: ");
                    hospedaje.setDuracionEstadia(entradaDato.nextInt());
                    System.out.println("¿Incluye alimentacion? \n1. Si \n2. No \nElige una opcion: ");
                    hospedaje.setIncluyeAlimentacion(entradaDato.nextInt());




                    System.out.println("****** Datos del viaje ******");
                    System.out.print("¿Que tipo de viaje va a realizar? \n1. Nacional \n2. Internacional \nElige una opcion: ");
                    viaje.setTipoViaje(entradaDato.nextInt());
                    System.out.println("¿Desde donde viaja?");
                    viaje.setOrigen(entradaDato.next());
                    System.out.println("¿Hacia donde Viaja (destino)?");
                    viaje.setDestino(entradaDato.next());
                    System.out.print("¿Por que tipo de transporte va a viajar? \n1. Aereo \n2. Terrestre \n3. Maritimo \nElige una opcion: ");
                    viaje.setTipoTransporte(entradaDato.next());



                    System.out.println("****** Transporte desde el destino hasta el hotel ******");
                    System.out.print("¿Que medio de transporte va a utilizar? \n1. Bus \n2. Taxi \n3. Plataformar ilegales \n4.Mototaxi \nElige una opcion: ");
                    viaje.setMedioTransporte(entradaDato.next());


                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;

            }

        }while (opcionMenu!=0);
    }
}