/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumaentrenumeros;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class SumaEntreNumeros {

    public static void SUMA() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = entrada.nextInt();

        int suma = 0;

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        for (int i = numero1 + 1; i < numero2; i++) {
            suma += i;
        }

        System.out.println("La suma de los números entre " + numero1 + " y " + numero2 + " es: " + suma);

        
    }
}
