/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package añobisiesto;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class AñoBisiesto {

    public static void año() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = entrada.nextInt();

        boolean esBisiesto = false;
        // % se utiliza para calcular el resto de la división de un número por otro
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            esBisiesto = true;
        }

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

       
    }
}
