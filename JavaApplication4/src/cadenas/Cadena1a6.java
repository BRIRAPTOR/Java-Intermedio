package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class Cadena1a6 {

    public static void cadena1a6() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = entrada.nextLine();

       
        int longitud = cadena.length();
        System.out.println("1. Longitud de la cadena: " + longitud);

        
        int numeros = contarNumeros(cadena);
        System.out.println("2. Número de números en la cadena: " + numeros);

       
        int letras = contarLetras(cadena);
        System.out.println("3. Número de letras en la cadena: " + letras);

        
        int vocales = contarVocales(cadena);
        System.out.println("4. Número de vocales en la cadena: " + vocales);

       
        System.out.print("5. Ingrese un carácter a buscar: ");
        char caracter = entrada.next().charAt(0);
        int repeticiones = contarRepeticiones(cadena, caracter);
        System.out.print("   Número de repeticiones de '" + caracter + "': " + repeticiones + " ");
        for (int i = 0; i < repeticiones; i++) {
            System.out.print("*");
        }
        System.out.println();

        double porcentajeMenos5 = porcentajePalabrasMenosDe5(cadena);
        double porcentaje5oMas = 100.0 - porcentajeMenos5;
        System.out.println("6. Porcentaje de palabras con menos de 5 caracteres: " + porcentajeMenos5 + "%");
        System.out.println("   Porcentaje de palabras con 5 o más caracteres: " + porcentaje5oMas + "%");
    }

    public static int contarNumeros(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarLetras(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase(); // Convertir a minúsculas para contar vocales sin distinción de mayúsculas
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static int contarRepeticiones(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static double porcentajePalabrasMenosDe5(String cadena) {
        String[] palabras = cadena.split("\\s+"); // Dividir la cadena en palabras
        int totalPalabras = palabras.length;
        int palabrasMenos5 = 0;

        for (String palabra : palabras) {
            if (palabra.length() < 5) {
                palabrasMenos5++;
            }
        }

        return (double) palabrasMenos5 / totalPalabras * 100.0;
    }
}
