package newpackage;

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
            System.out.println("1. CuadradoAsteriscos");
            System.out.println("2. Perimetro");
            System.out.println("3. Patron");
            System.out.println("4. IncrementoDecremento");
            System.out.println("5. Diamante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    CuadradoAsteriscos.cuadro();
                    break;
                case 2:
                    Perimetro.perimetro();
                    break;
                case 3:
                    Patron.patron();
                    break;
                case 4:
                    IncrementoDecremento.incremento();
                    break;
                case 5:
                    Diamante.diamante();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

    }
}
