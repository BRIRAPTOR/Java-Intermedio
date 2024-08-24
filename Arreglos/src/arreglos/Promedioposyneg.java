package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class Promedioposyneg {
    public static void Promedio(){
        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }
        }

        if (contadorPositivos > 0) {
            double promedioPositivos = (double) sumaPositivos / contadorPositivos;
            JOptionPane.showMessageDialog(null, "Promedio de valores positivos: " + promedioPositivos);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron valores positivos.");
        }

        if (contadorNegativos > 0) {
            double promedioNegativos = (double) sumaNegativos / contadorNegativos;
            JOptionPane.showMessageDialog(null, "Promedio de valores negativos: " + promedioNegativos);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron valores negativos.");
        }
    }
    public static void jua(){
        System.out.println("hola juan");
    }
}
