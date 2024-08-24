/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayor_menor;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Mayor_Menor {

    public static void mayor() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor A: ");
        int a = entrada.nextInt();

        System.out.println("Ingrese el segundo valor B: ");
        int b = entrada.nextInt();

        System.out.println("Ingrese el tercer valor C: ");
        int c = entrada.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Los valores ingresados no son distintos.");
        } else {
            int mayor = obtenerMayor(a, b, c);
            int menor = obtenerMenor(a, b, c);

            System.out.println("El mayor valor es: " + mayor);
            System.out.println("El menor valor es: " + menor);
        }
    }

    public static int obtenerMayor(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        return max;
    }

    public static int obtenerMenor(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        return min;
    }
}
