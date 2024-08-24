package divición;

import java.util.Scanner;

/**
 * @author brian
 */
public class ClaseDivición {

    public static void main(String[] args) {
        try {
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Dame el primer valor: ");
            valor1 = entrada.nextInt();

            System.out.println("Dame el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Divión es igual a: " + resultado);
        } catch (Exception e) {
            System.out.println("Error!!! " + e
            );
        } finally {
            System.out.println("Operacion concluida!!");
        }

    }
}
