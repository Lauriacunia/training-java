package ejercicio2;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<AbstractMap.SimpleEntry<String, Integer>> pares = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            String cadena = scanner.next();
            int numero = scanner.nextInt();
            pares.add(new AbstractMap.SimpleEntry<>(cadena, numero));
        }

        System.out.println("================================");
        for (AbstractMap.SimpleEntry<String, Integer> par : pares) {
            System.out.printf("%-15s%03d%n", par.getKey(), par.getValue());
        }
        System.out.println("================================");

        scanner.close();

    }
}
