/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio0;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Promedio0 {

    public static void prom0() {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        boolean valor = false;

        System.out.print("Ingrese el número total de calificaciones: ");
        int totalCalificaciones = entrada.nextInt();

        if (totalCalificaciones <= 0) {
            System.out.println("Número de calificaciones inválido.");
            return;
        }

        System.out.println("Ingrese las calificaciones:");

        for (int i = 0; i < totalCalificaciones; i++) {
            int calificacion = entrada.nextInt();
            suma += calificacion;
        }

        double promedio = (double) suma / totalCalificaciones;
        System.out.println("El promedio de las calificaciones es: " + promedio);

    }
}
