package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class Telefono {

    public static void telefono() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número telefónico en formato de cadena: ");
        String numeroTelefono = entrada.nextLine();

        if (numeroTelefono.length() < 10) {
            System.out.println("El número telefónico ingresado es demasiado corto.");
        } else {

            String codigoPais = numeroTelefono.substring(0, 2);
            String primerDigito = numeroTelefono.substring(2, 3);
            String restoDelNumero = numeroTelefono.substring(3);

            String nuevaCadena = "(" + codigoPais + ")-" + primerDigito + "-" + restoDelNumero;

            System.out.println("Número Telefónico: " + numeroTelefono);
            System.out.println("Nueva Cadena: " + nuevaCadena);
        }

    }
}
