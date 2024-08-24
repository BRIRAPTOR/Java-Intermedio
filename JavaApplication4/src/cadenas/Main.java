package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Cadena1a6");
            System.out.println("2. Ejercicio7");
            System.out.println("3. GenerarCURP");
            System.out.println("4. CodificarMensaje");
            System.out.println("5. Telefono");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Cadena1a6.cadena1a6();
                    break;
                case 2:
                    Ejercicio7.ejercicio7();
                    break;
                case 3:
                    GenerarCURP.generarCURP();
                    break;
                case 4:
                    CodificarMens.codificar();
                    break;
                case 5:
                    Telefono.telefono();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

    }
}
