package org.example;
import org.example.contralores.Empleado;
import org.example.contralores.Hospedaje;
import org.example.contralores.Transporte;
import org.example.contralores.Viaje;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado = new Empleado();
        Hospedaje hospedaje = new Hospedaje();
        Viaje viaje = new Viaje();
        Transporte transporte = new Transporte();

        int opcionMenu;

        System.out.println("****** Bienvenido al sistema de registro de viaticos TRAVELAPP ****** \n ¿Que operacion desea realizar?");
        do {
            System.out.print("1. Registrar empleado \n2. Registrar viaje \n3. Ver empleados \n4. Ver viajes de un empleado \n0. Salir \nElige una opcion: ");
            opcionMenu = entradaDato.nextInt();
            System.out.println("");
            switch (opcionMenu){
                case 1:

                    Empleado objetoeEmpleado = new Empleado();
                    System.out.println("****** Datos del empleado ******");

                    System.out.print("Ingrese el nombre: ");
                    objetoeEmpleado.setNombre(entradaDato.next());
                    System.out.print("Ingrese el apellido: ");
                    objetoeEmpleado.setApellido(entradaDato.next());
                    System.out.print("Ingrese la cedula: ");
                    objetoeEmpleado.setCedula(entradaDato.next());
                    System.out.print("Ingrese el numero de celular: ");
                    objetoeEmpleado.setCelular(entradaDato.next());

                    do {
                        System.out.print("Ingrese la edad: ");
                        objetoeEmpleado.setEdad(entradaDato.nextInt());
                    }while (objetoeEmpleado.getEdad() < 18 || objetoeEmpleado.getEdad() > 80);

                    do {
                        System.out.print("Cargo: \n1. Analista Jr. \n2. Analista Sr. \nElige una opcion: ");
                        objetoeEmpleado.setCargo(entradaDato.nextInt());
                    }while (objetoeEmpleado.getCargo() != 1 && objetoeEmpleado.getCargo() != 2);


                    System.out.print("¿Tiene Visa o Pasaporte? \n1. Si \n2. No \n3. Ambas \nElige una opcion: ");
                    objetoeEmpleado.setVisa(entradaDato.nextInt());
                    System.out.println("");

                    empleados.add(objetoeEmpleado);

                    break;
                case 2:
                    System.out.println("****** Datos del hospedaje ******");
                    System.out.println("");
                    System.out.println("****** Ingrese la fecha del viaje ******");
                    System.out.print("Fecha de ida (dd/mm/aaaa): ");
                    viaje.setFechaViajeIda(entradaDato.next());
                    System.out.print("Fecha de regreso (dd/mm/aaaa): ");
                    viaje.setFechaViajeRegreso(entradaDato.next());
                    System.out.print("¿Cuantos dias se va a hospedar?: ");
                    hospedaje.setDuracionEstadia(entradaDato.nextInt());
                    do {
                        System.out.print("¿En que hotel desea hospedarse? \n1. Decameron \n2. Dann Carlton \n3. Hostal \nElige una opcion: ");
                        hospedaje.setHotel(entradaDato.nextInt());
                        if (hospedaje.getHotel() == 1 || hospedaje.getHotel()==2){
                            System.out.print("¿En que tipo de habitación desea hospedarse? \n1. Sencilla \n2. Suite \nElige una opcion: ");
                            hospedaje.setTipoHabitacion(entradaDato.nextInt());
                        }else if (hospedaje.getHotel()== 3){
                            System.out.println("El hostal solo cuenta con un tipo de habitacion estandar");
                        }else {
                            System.out.println("Seleccione una opcion correcta!!!");
                        }
                    }while (hospedaje.getHotel() != 1 && hospedaje.getHotel() != 2 && hospedaje.getHotel() != 3);

                    System.out.println("");
                    System.out.println("****** el costo del hotel es: " + hospedaje.valorTotalHotel() + " ******");
                    System.out.println("");


                    System.out.println("****** Datos del viaje ******");
                    System.out.println("");
                    System.out.print("¿Desde donde viaja?");
                    viaje.setOrigen(entradaDato.next());
                    System.out.print("¿Hacia donde Viaja (destino)?");
                    viaje.setDestino(entradaDato.next());

                    do {
                        System.out.print("¿Que tipo de viaje va a realizar? \n1. Nacional \n2. Internacional \nElige una opcion: ");
                        viaje.setTipoViaje(entradaDato.nextInt());

                        System.out.println("");
                        System.out.println("Hola " + empleado.getNombre() + "\ncuentas con un auxilio en el viaje de:  $" + viaje.calcularAuxilioVuelo(empleado.getCargo(), empleado.getSalario()));
                        System.out.println("");

                        if (viaje.getTipoViaje() == 1){
                            do {
                                System.out.print("¿Por que tipo de transporte va a viajar? \n1. Aereo \n2. Terrestre \nElige una opcion: ");
                                transporte.setTipoTransporte(entradaDato.nextInt());

                            }while (transporte.getTipoTransporte() != 1 && transporte.getTipoTransporte() != 2);

                        }else if (viaje.getTipoViaje() == 2 && empleado.getVisa() != 2){
                            do {
                                System.out.print("¿Por que tipo de transporte va a viajar? \n1. Aereo \n2. Maritimo \nElige una opcion: ");
                                transporte.setTipoTransporte(entradaDato.nextInt());

                            }while (transporte.getTipoTransporte() != 1 && transporte.getTipoTransporte() != 2);
                        }

                        while (viaje.getTipoViaje() == 2 && empleado.getVisa() == 2){
                            System.out.println("No cuenta con los documentos necesarios para realizar este viaje!!!");
                            break;
                        }

                    }while (viaje.getTipoViaje() != 1 && viaje.getTipoViaje() != 2);

                    System.out.println("");
                    System.out.println("****** El valor total del viaje es: " + viaje.calcularCostoVuelo(transporte.getTipoTransporte()) + " ******");
                    System.out.println("");


                    System.out.println("****** Transporte desde el destino hasta el hotel ******");

                    do {
                        System.out.print("¿Que medio de transporte va a utilizar? \n1. Bus \n2. Taxi \n3. Plataformas \nElige una opcion: ");
                        transporte.setMedioTransporte(entradaDato.nextInt());

                    }while (transporte.getMedioTransporte() != 1 && transporte.getMedioTransporte() != 2 && transporte.getMedioTransporte() != 3);

                    System.out.println("");
                    System.out.println("El valor del pasaje hasta el hotel es: $" + transporte.getValorPasaje());
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("***** MOSTRANDO DATOS DEL EMPLEADO *****");
                    System.out.println();
                    System.out.println("-Cargo: 1 -> Analista Jr / 2 -> Analista Sr");
                    System.out.println("-¿Posee visa o pasaporte? 1 -> Si / 2 -> No / 3 -> Ambas");

                        for (Empleado verEmpleado: empleados){
                            System.out.println("Nombre: "+ verEmpleado.getNombre()+" "+verEmpleado.getApellido());
                            System.out.println("Cedula: "+verEmpleado.getCedula() );
                            System.out.println("Edad: "+ verEmpleado.getEdad() + " años");
                            System.out.println("Celular: "+ verEmpleado.getCelular() );
                            System.out.println("Cargo: "+ verEmpleado.getCargo() );
                            System.out.println("Salario: "+ verEmpleado.getSalario() );
                            System.out.println("Cuenta con visa o pasaporte: "+ verEmpleado.getVisa());
                        }

                    break;
                case 4:
                    System.out.println("***** MOSTRANDO VIAJES REALIZADOS *****");
                    System.out.println();
                    System.out.println("Habitación: 1 -> Sencilla / 2 -> Suite");
                    System.out.println("Hotel: 1 -> Decameron / 2 -> Dann Carlton / 3 -> Hostal");
                    System.out.println("Tipo de Viaje: 1 -> Nacional \nTipo de Transporte: 1 -> Aereo / 2 -> Terrestre");
                    System.out.println("Tipo de Viaje: 2 -> Internacional \nTipo de Transporte: 1 -> Aereo / 2 -> Maritimo");

                    break;
                default:
                    break;

            }

        }while (opcionMenu!=0);
    }
}