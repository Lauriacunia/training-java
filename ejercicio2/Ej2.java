package ejercicio2;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<AbstractMap.SimpleEntry<String, Integer>> pares = new ArrayList<>();

        // el usuario puede ingresar x pares de datos o hasta que ingrese "S"
        while (true) {
            System.out.println("Ingrese un par de datos (cadena, número) o 'S' para salir:");
            String cadena = scanner.next();
            if (cadena.equalsIgnoreCase("S")) {
                System.out.println("Saliendo...");
                break;
            }
            int numero = scanner.nextInt();
            pares.add(new AbstractMap.SimpleEntry<>(cadena, numero));
        }

        System.out.println("================================");
        // recorremos la lista de pares y mostramos los datos
        if(pares.size() > 0) {
            for (AbstractMap.SimpleEntry<String, Integer> par : pares) {
             /* Imprime la cadena justificada a la izquierda en 15 caracteres
            y el número formateado con padding de ceros
            %s: Se sustituye por la cadena.
            %-15s: Justifica la cadena a la izquierda en 15 caracteres. Si la cadena es menor de 15 caracteres, se rellena con espacios en blanco.
            %03d: Se sustituye por el número. Se formatea para que tenga al menos 3 dígitos, rellenando con ceros a la izquierda si es necesario.
            %n: Es una nueva línea.
             */
                System.out.printf("%-15s%03d%n", par.getKey(), par.getValue());
            }
        } else {
            System.out.println("No se ingresaron datos");
        }
        System.out.println("================================");

        scanner.close();
    }
}
