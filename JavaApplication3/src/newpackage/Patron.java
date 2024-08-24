package newpackage;

/**
 * @author brian
 */
public class Patron {

    public static void patron() {
        int filas = 8;

        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
