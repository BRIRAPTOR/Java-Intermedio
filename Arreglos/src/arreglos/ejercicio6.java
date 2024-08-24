package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class ejercicio6 {

    public static void ejercici6() {

        String tamanoStr = JOptionPane.showInputDialog("Ingrese el tamaño de los arrays:");
        int tamano = Integer.parseInt(tamanoStr);

        String[] nombres = new String[tamano];
        int[] longitudes = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
            nombres[i] = nombre;
        }

        for (int i = 0; i < tamano; i++) {
            longitudes[i] = nombres[i].length();
        }

        String mensaje = "Nombres y sus longitudes:\n";
        for (int i = 0; i < tamano; i++) {
            mensaje += "Nombre: " + nombres[i] + ", Longitud: " + longitudes[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
