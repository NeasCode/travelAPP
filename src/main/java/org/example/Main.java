package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entradaDeDato = new Scanner(System.in);

        int opcionMenu;

        System.out.println("1. Registro empleado \n2. Registrar viaje \n3. Ver empleados \n4. Ver viajes de un empleado \n0. Salir");
        opcionMenu = entradaDeDato.nextInt();

        do {
            switch (opcionMenu){
                case 1:
                    break;
                case 2:
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