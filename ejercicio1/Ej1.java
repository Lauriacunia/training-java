package ejercicio1;

import java.io.*;
import java.util.*;

public class Ej1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Crea un objeto Scanner para leer la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Imprime instrucciones para el usuario
        System.out.println("Ingrese un entero:");
        // Lee un entero de la entrada estándar
        int entero;
        if (scanner.hasNextInt()) {
            entero = scanner.nextInt();
        } else {
            // Si el usuario no ingresó un entero, muestra un mensaje de error y termina el programa
            System.err.println("Error: no se ingresó un entero");
            return;
        }

        // Imprime instrucciones para el usuario
        System.out.println("Ingrese un double:");
        // Lee un double de la entrada estándar
        double doble;
        if (scanner.hasNextDouble()) {
            doble = scanner.nextDouble();
        } else {
            // Si el usuario no ingresó un double, muestra un mensaje de error y termina el programa
            System.err.println("Error: no se ingresó un double");
            return;
        }
        scanner.nextLine(); // Leer la nueva línea después del double

        // Imprime instrucciones para el usuario
        System.out.println("Ingrese una cadena:");
        // Lee una cadena de la entrada estándar
        String cadena = scanner.nextLine();

        // Imprime el entero, el double y la cadena según las instrucciones
        System.out.println("String: " + cadena);
        System.out.println("Double: " + doble);
        System.out.println("Int: " + entero);

        // Cierra el objeto Scanner
        scanner.close();
    }
}
