package arreglos;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class ejercicio5 {

    public static void ejercici5(){
        String[][] tablero = new String[8][8];

      
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "   ";
            }
        }

        
        for (int i = 0; i <= 7; i++) {
            tablero[1][i] = "P";
            tablero[6][i] = "P";
        }

        // Torres
        tablero[0][0] = "T";
        tablero[0][7] = "T";
        tablero[7][0] = "T";
        tablero[7][7] = "T";

        // Caballos
        tablero[0][1] = "C";
        tablero[0][6] = "C";
        tablero[7][1] = "C";
        tablero[7][6] = "C";

        // Alfiles
        tablero[0][2] = "A";
        tablero[0][5] = "A";
        tablero[7][2] = "A";
        tablero[7][5] = "A";

        // Reyes
        tablero[0][3] = "R";
        tablero[7][3] = "R";

        // Reinas
        tablero[0][4] = "M";
        tablero[7][4] = "M";

      
        String tableroStr = "Tablero de Ajedrez:\n";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tableroStr += "[" + tablero[i][j] + "]";
            }
            tableroStr += "\n";
        }

        
        JOptionPane.showMessageDialog(null, tableroStr);
    }
}
