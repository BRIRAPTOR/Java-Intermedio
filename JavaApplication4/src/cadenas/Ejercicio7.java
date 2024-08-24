package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class Ejercicio7 {

    public static void ejercicio7() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        String[] palabras = frase.split(" ");

        String palabraMayor = "";
        String palabraMenor = "";

        for (String palabra : palabras) {
            if (palabraMayor.isEmpty() || palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }

            if (palabraMenor.isEmpty() || palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
        }

        System.out.println("Palabra de mayor longitud: " + palabraMayor + " (" + palabraMayor.length() + " caracteres)");
        System.out.println("Palabra de menor longitud: " + palabraMenor + " (" + palabraMenor.length() + " caracteres)");

    }
}
