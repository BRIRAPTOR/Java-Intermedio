package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class ejercicio3 {

    public static void ejercici3(){
        int[] calificaciones = new int[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":");
            calificaciones[i] = Integer.parseInt(input);
        }

        StringBuilder calificacionesStr = new StringBuilder("Calificaciones ingresadas:\n");
        for (int calificacion : calificaciones) {
            calificacionesStr.append(calificacion).append(" ");
        }
        JOptionPane.showMessageDialog(null, calificacionesStr.toString());

        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = (double) suma / calificaciones.length;

        JOptionPane.showMessageDialog(null, "Promedio de las calificaciones: " + promedio);

        int maxCalificacion = calificaciones[0];
        int minCalificacion = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > maxCalificacion) {
                maxCalificacion = calificaciones[i];
            }
            if (calificaciones[i] < minCalificacion) {
                minCalificacion = calificaciones[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Calificación más alta: " + maxCalificacion);
        JOptionPane.showMessageDialog(null, "Calificación más baja: " + minCalificacion);

        int calificacionesSuperioresAlPromedio = 0;
        for (int calificacion : calificaciones) {
            if (calificacion > promedio) {
                calificacionesSuperioresAlPromedio++;
            }
        }

        JOptionPane.showMessageDialog(null, "Calificaciones superiores al promedio: " + calificacionesSuperioresAlPromedio);

        int aprobados = 0;
        int reprobados = 0;

        for (int calificacion : calificaciones) {
            if (calificacion >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de alumnos aprobados: " + aprobados);
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos reprobados: " + reprobados);
    }
}
