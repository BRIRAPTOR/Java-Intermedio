package arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * @author brian
 */
public class Buscaminas {
private int[][] tablero;
    private boolean[][] tableroVisible;
    private int filas;
    private int columnas;
    private int minas;
    private boolean juegoTerminado;
    private int casillasDescubiertas;

    public Buscaminas(int filas, int columnas, int minas) {
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        this.tablero = new int[filas][columnas];
        this.tableroVisible = new boolean[filas][columnas];
        this.juegoTerminado = false;
        this.casillasDescubiertas = 0;
        inicializarTablero();
        colocarMinas();
        calcularNumeros();
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tableroVisible[i][j]) {
                    if (tablero[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(tablero[i][j] + " ");
                    }
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void jugar(int fila, int columna) {
        if (juegoTerminado) {
            System.out.println("El juego ha terminado.");
            return;
        }
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            System.out.println("Coordenadas fuera del tablero.");
            return;
        }
        if (tableroVisible[fila][columna]) {
            System.out.println("Esta casilla ya ha sido descubierta.");
            return;
        }

        tableroVisible[fila][columna] = true;
        casillasDescubiertas++;

        if (tablero[fila][columna] == -1) {
            juegoTerminado = true;
            System.out.println("¡Has perdido! Ha explotado una mina.");
        } else {
            if (casillasDescubiertas == filas * columnas - minas) {
                juegoTerminado = true;
                System.out.println("¡Has ganado! Has descubierto todas las casillas seguras.");
            }
        }
    }

    public static void busca() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        int columnas = scanner.nextInt();
        System.out.print("Ingresa el número de minas: ");
        int minas = scanner.nextInt();

        Buscaminas juego = new Buscaminas(filas, columnas, minas);

        while (!juego.juegoTerminado) {
            juego.imprimirTablero();
            System.out.print("Ingresa la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa la columna: ");
            int columna = scanner.nextInt();
            juego.jugar(fila, columna);
        }
    }
}
