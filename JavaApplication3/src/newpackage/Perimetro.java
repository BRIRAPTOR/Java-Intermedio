package newpackage;

import java.util.Scanner;

/**
 * @author brian
 */
public class Perimetro {

    public static void perimetro() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = entrada.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
