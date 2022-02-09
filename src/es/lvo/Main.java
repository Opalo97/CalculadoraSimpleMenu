package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENÚ");
            System.out.println("============================================");
            System.out.println("1.-Sumar.");
            System.out.println("2.-Restar.");
            System.out.println("0.-Salir.");
            System.out.println("Elige una opción: ");
            opcion = entrada.nextInt();

            // switch
        }
        //System.out.println("Intro para continuar ...");

        while (opcion != 0); {
            System.out.println("Intro para continuar ...");
        }






    }
}
