package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class ejercicio2 {
 public static void ejercici2() {
        int[] numeros = new int[10];
        int sumaPosicionesPares = 0;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);

            if (i % 2 == 0) {
                sumaPosicionesPares += numeros[i];
            }
        }

        int cantidadPosicionesPares = 10 / 2;

        if (cantidadPosicionesPares > 0) {
            double promedioPosicionesPares = (double) sumaPosicionesPares / cantidadPosicionesPares;
            JOptionPane.showMessageDialog(null, "Promedio de los números en posiciones pares: " + promedioPosicionesPares);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números en posiciones pares.");
        }
    }
}
