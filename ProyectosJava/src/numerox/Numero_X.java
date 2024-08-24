/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerox;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Numero_X {

    public static void Numx() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número X: ");
        int x = entrada.nextInt();

        System.out.println("Números naturales menores o iguales a " + x + " que no son múltiplos de 3 ni de 7: ");

        for (int i = 1; i <= x; i++) {
            // % se utiliza para calcular el resto de la división de un número por otro
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }

        
    }
}
