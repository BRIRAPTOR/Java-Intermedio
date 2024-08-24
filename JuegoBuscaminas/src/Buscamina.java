
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alumno
 */
public class Buscamina {

    private int[][] tablero;
    private boolean[][] tableroVisible;
    private int filas;
    private int columnas;
    private int minas;
    private boolean juegoTerminado;
    private int casillasDescubiertas;

    public Buscamina(int filas, int columnas, int minas) {
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        this.tablero = new int[filas][columnas];
        this.tableroVisible = new boolean[filas][columnas];
        this.juegoTerminado = false;
        this.casillasDescubiertas = 0;
        try {
            inicializarTablero();
            colocarMinas();
            calcularNumeros();
        } catch (Exception e) {
            handleException(e);
        }
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = 0;
                tableroVisible[i][j] = false;
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;
        while (minasColocadas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (tablero[fila][columna] != -1) {
                tablero[fila][columna] = -1;
                minasColocadas++;
            }
        }
    }

    private void calcularNumeros() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != -1) {
                    int count = 0;
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int ni = i + x;
                            int nj = j + y;
                            if (ni >= 0 && ni < filas && nj >= 0 && nj < columnas && tablero[ni][nj] == -1) {
                                count++;
                            }
                        }
                    }
                    tablero[i][j] = count;
                }
            }
        }
    }

    public void imprimirTablero() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tableroVisible[i][j]) {
                    if (tablero[i][j] == -1) {
                        sb.append("* ");
                    } else {
                        sb.append(tablero[i][j]).append(" ");
                    }
                } else {
                    sb.append("X ");
                }
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void jugar(int fila, int columna) {
        try {
            if (juegoTerminado) {
                JOptionPane.showMessageDialog(null, "El juego ha terminado.");
            } else if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                JOptionPane.showMessageDialog(null, "Coordenadas fuera del tablero.");
            } else if (tableroVisible[fila][columna]) {
                JOptionPane.showMessageDialog(null, "Esta casilla ya ha sido descubierta.");
            } else {
                tableroVisible[fila][columna] = true;
                casillasDescubiertas++;

                if (tablero[fila][columna] == -1) {
                    juegoTerminado = true;
                    JOptionPane.showMessageDialog(null, "¡Has perdido! Ha explotado una mina.");
                } else if (casillasDescubiertas == filas * columnas - minas) {
                    juegoTerminado = true;
                    JOptionPane.showMessageDialog(null, "¡Has ganado! Has descubierto todas las casillas seguras.");
                }
            }
        } catch (HeadlessException e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }

    public static void main(String[] args) {
        try {
            int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas: "));
            int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de columnas: "));
            int minas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de minas: "));

            Buscamina juego = new Buscamina(filas, columnas, minas);

            while (!juego.juegoTerminado) {
                juego.imprimirTablero();
                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fila: "));
                int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la columna: "));
                juego.jugar(fila, columna);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
        }
    }
}
