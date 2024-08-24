package newpackage;

/**
 * @author brian
 */
public class IncrementoDecremento {

    public static void incremento() {
        // Patrón A
        System.out.println("Patrón A:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Patrón B
        System.out.println("\nPatrón B:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
