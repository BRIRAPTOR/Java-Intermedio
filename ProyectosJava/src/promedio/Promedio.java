/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Promedio {

    public static void PROM() {
        Scanner entrada = new Scanner(System.in);

        int cantAlumnos = 10;
        int aprobados = 0;
        int reprobados = 0;
        double sumaCalifi = 0;

        for (int i = 1; i <= cantAlumnos; i++) {
            System.out.print("Ingrese la calificación del alumno " + i + ": ");
            double calificacion = entrada.nextDouble();
            sumaCalifi += calificacion;

            if (calificacion >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = sumaCalifi / cantAlumnos;
        double porcenAprobados = (aprobados * 100) / cantAlumnos;
        double porcenReprobados = (reprobados * 100) / cantAlumnos;

        System.out.println("Porcentaje de aprobados: " + porcenAprobados + "%");
        System.out.println("Porcentaje de reprobados: " + porcenReprobados + "%");
        System.out.println("Promedio de calificaciones: " + promedio);

    }
}
