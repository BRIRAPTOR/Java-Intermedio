package newpackage;

import java.util.Scanner;

/**
 * @author brian
 */
public class CuadradoAsteriscos {

    public static void cuadro() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = entrada.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
