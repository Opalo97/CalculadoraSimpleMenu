package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion, sum1, sum2, suma, resta, res1,res2;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENÚ");
            System.out.println("============================================");
            System.out.println("1.-Sumar.");
            System.out.println("2.-Restar.");
            System.out.println("0.-Salir.");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Dame un numero para la suma: ");
                    sum1 = entrada.nextInt();
                    System.out.print("Dame otro numero para la suma: ");
                    sum2 = entrada.nextInt();
                    suma = sum1+ sum2;
                    System.out.println("Resultado de la suma: " + suma);
                    break;

                case 2:
                    System.out.print("Dame un numero para la resta: ");
                    res1 = entrada.nextInt();
                    System.out.print("Dame otro numero para la resta: ");
                    res2 = entrada.nextInt();
                    resta = res1 - res2;
                    System.out.println("Resultado de la resta: " + resta);
                    break;

                case 0:
                    System.out.println("Programa terminado.");
                    break;
            }

            // Limpiamos el buffer antes de leer una línea.
            entrada.nextLine();

            // Esperamos el intro del usuario para continuar.
            System.out.println("Intro para continuar ...");
            entrada.nextLine();
        } while (opcion != 0);

        entrada.close();
    }
}
