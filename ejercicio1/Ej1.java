package ejercicio1;

import java.io.*;
import java.util.*;

public class Ej1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entero = 0;
        double doble = 0.0;
        String cadena = "";

        entero = getEntero(scanner);
        doble = getDoble(scanner, doble);
        cadena = getString(scanner);

        printAll(cadena, doble, entero);

        scanner.close();
    }

    private static void printAll(String cadena, double doble, int entero) {
        System.out.println("Valores ingresados:");
        System.out.println("String: " + cadena);
        System.out.println("Double: " + doble);
        System.out.println("Int: " + entero);
    }

    private static String getString(Scanner scanner) {
        String cadena;
        while (true) {
            // Imprime instrucciones para el usuario
            System.out.println("Ingrese una cadena ('S' o 's' para salir):");
            // Lee una línea de la entrada estándar
            cadena = scanner.nextLine();
            if (cadena.equalsIgnoreCase("s")) {
                // Si el usuario ingresa 'exit', termina el programa
                break;
            }
            // Si la cadena no está vacía, sale del bucle
            if (!cadena.isEmpty()) {
                break;
            }
            // Si la cadena está vacía, muestra un mensaje de error y vuelve a pedir al usuario que ingrese una cadena
            System.err.println("Error: no se ingresó una cadena válida");
        }
        return cadena;
    }

    private static double getDoble(Scanner scanner, double doble) {
        while (true) {
            System.out.println("Ingrese un double ('S' o 's' para salir):");
            // Lee una línea de la entrada estándar
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")) {
                // Si el usuario ingresa 'exit', termina el programa
                break;
            }
            // Intenta convertir la entrada en un double
            try {
                doble = Double.parseDouble(input);
                // Si tiene éxito, sale del bucle
                break;
            } catch (NumberFormatException e) {
                // Si falla, muestra un mensaje de error y vuelve a pedir al usuario que ingrese un double
                System.err.println("Error: no se ingresó un double válido");
            }
        }
        return doble;
    }

    private static int getEntero(Scanner scanner) {
        int entero;
        while (true) {
            System.out.println("Ingrese un entero ('S' o 's' para salir):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("S")) {
                // Si el usuario ingresa 'S', termina el programa
                System.exit(0);
            }
            try {
                entero = Integer.parseInt(input);
                // Si tiene éxito, sale del bucle
                break;
            } catch (NumberFormatException e) {
                // Si falla, muestra un mensaje de error y vuelve a pedir al usuario que ingrese un entero
                System.err.println("Error: no se ingresó un entero válido");
            }
        }
        return entero;
    }
}
