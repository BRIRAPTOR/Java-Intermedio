package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class ejercicio4 {

    public static void ejercicio4() {
        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        // Llenado de la primera matriz
        JOptionPane.showMessageDialog(null, "Llenado de la primera matriz (3x3):");
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno[i].length; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de matriz_uno[" + i + "][" + j + "]:");
                matriz_uno[i][j] = Integer.parseInt(input);
            }
        }

        // Llenado de la segunda matriz
        JOptionPane.showMessageDialog(null, "Llenado de la segunda matriz (3x3):");
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos[i].length; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de matriz_dos[" + i + "][" + j + "]:");
                matriz_dos[i][j] = Integer.parseInt(input);
            }
        }

        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }

        // Construir las representaciones de las matrices en cadenas de tipo String
        String matrizUnoStr = "Matriz Uno:\n";
        String matrizDosStr = "Matriz Dos:\n";
        String matrizResultadoStr = "Matriz Resultante (Suma):\n";

        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno[i].length; j++) {
                matrizUnoStr += "[" + matriz_uno[i][j] + "] ";
                matrizDosStr += "[" + matriz_dos[i][j] + "] ";
                matrizResultadoStr += "[" + matriz_resultante[i][j] + "] ";
            }
            matrizUnoStr += "\n";
            matrizDosStr += "\n";
            matrizResultadoStr += "\n";
        }

        // Mostrar las matrices y el resultado en JOptionPane
        JOptionPane.showMessageDialog(null, matrizUnoStr);
        JOptionPane.showMessageDialog(null, matrizDosStr);
        JOptionPane.showMessageDialog(null, matrizResultadoStr);
    }
}
