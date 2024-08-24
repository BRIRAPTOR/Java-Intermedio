/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;
import mayor_menor.Mayor_Menor;
import signo_zodiacal.Zodiacal;
import promedio.Promedio;
import sumaentrenumeros.SumaEntreNumeros;
import promedio0.Promedio0;
import añobisiesto.AñoBisiesto;
import numerox.Numero_X;
import camiones.Camiones;
import fibonacci.Fibonacci;
import java.util.NoSuchElementException;
import random.Random1;

/**
 *
 * @author brian
 */
public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Mayor y Menor de Tres Valores");
            System.out.println("2. Signo Zodiacal");
            System.out.println("3. Porcentaje de Aprobados y Reprobados");
            System.out.println("4. Suma de Números entre Dos Enteros");
            System.out.println("5. Promedio de Calificaciones");
            System.out.println("6. Año Bisiesto");
            System.out.println("7. Números Naturales no Múltiplos de 3 ni 7");
            System.out.println("8. Costo de Viaje en Autobús");
            System.out.println("9. Serie de Fibonacci Menor a 1000");
            System.out.println("10. Juego de Adivinar un Número");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de ejercicio que desea ejecutar: ");
            try {
                opcion = entrada.nextInt();

                if (opcion == 1) {
                    Mayor_Menor.mayor();
                } else if (opcion == 2) {
                    Zodiacal.zodi();
                } else if (opcion == 3) {
                    Promedio.PROM();
                } else if (opcion == 4) {
                    SumaEntreNumeros.SUMA();
                } else if (opcion == 5) {
                    Promedio0.prom0();
                } else if (opcion == 6) {
                    AñoBisiesto.año();
                } else if (opcion == 7) {
                    Numero_X.Numx();
                } else if (opcion == 8) {
                    Camiones.CAM();
                } else if (opcion == 9) {
                    Fibonacci.FIBO();
                } else if (opcion == 10) {
                    Random1.Ran();
                } else if (opcion == 0) {
                    System.out.println("Saliendo del programa.");
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (NoSuchElementException e) {
                System.out.println("Error: No hay más datos disponibles en la entrada.");
                opcion = 0; // Forzar la salida del bucle
            }
        } while (opcion != 0);

    }
}
