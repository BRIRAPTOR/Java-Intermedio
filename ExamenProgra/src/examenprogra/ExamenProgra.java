/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogra;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class ExamenProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int fil = 0;
        int colum = 0;
        int fil2 = 1;
        int colum2 = 0;
        int fil3 = 2;
        int colum3 = 0;
        int fil4 = 3;
        int colum4 = 0;
        int fil5 = 4;
        int colum5 = 0;
        int fil6 = 5;
        int colum6 = 0;
        int fil7 = 6;
        int colum7 = 0;
        int fil8 = 7;
        int colum8 = 0;
        int fil9 = 8;
        int colum9 = 0;
        int fil10 = 9;
        int colum10 = 0;
        int fil11 = 10;
        int colum11 = 0;
        //parte2 variables
        int fila = 0;
        int columna = 1;
        int fila1 = 0;
        int columna1 = 2;
        int fila2 = 0;
        int columna2 = 3;
        int fila3 = 0;
        int columna3 = 4;
        int fila4 = 0;
        int columna4 = 5;
        int fila5 = 0;
        int columna5 = 6;
        int fila6 = 0;
        int columna6 = 7;
        int fila7 = 0;
        int columna7 = 8;
        int fila8 = 0;
        int columna8 = 9;
        int fila9 = 0;
        int columna9 = 10;

        String[][] horoscopo = new String[12][12];
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 11; j++) {
                horoscopo[i][j] = "X";
            }
        }
        for (int i = 0; i <= 11; i++) {

            horoscopo[fil][colum] = "*";
            fil++;
            colum++;
        }

        for (int i = 0; i <= 10; i++) {
            horoscopo[fil2][colum2] = "?";
            fil2++;
            colum2++;
        }

        for (int i = 0; i <= 9; i++) {
            horoscopo[fil3][colum3] = "&";
            fil3++;
            colum3++;
        }
        //aqui va bien
        for (int i = 0; i <= 8; i++) {
            horoscopo[fil4][colum4] = "%";
            fil4++;
            colum4++;
        }
        for (int i = 0; i <= 7; i++) {
            horoscopo[fil5][colum5] = "$";
            fil5++;
            colum5++;
        }
        for (int i = 0; i <= 6; i++) {
            horoscopo[fil6][colum6] = "#";
            fil6++;
            colum6++;
        }
        for (int i = 0; i <= 5; i++) {
            horoscopo[fil7][colum7] = "!";
            fil7++;
            colum7++;
        }
        for (int i = 0; i <= 4; i++) {
            horoscopo[fil8][colum8] = "=";
            fil8++;
            colum8++;
        }
        for (int i = 0; i <= 3; i++) {
            horoscopo[fil9][colum9] = "a";
            fil9++;
            colum9++;
        }
        for (int i = 0; i <= 2; i++) {
            horoscopo[fil10][colum10] = "z";
            fil10++;
            colum10++;
        }
        for (int i = 0; i <= 1; i++) {
            horoscopo[fil11][colum11] = "b";
            fil11++;
            colum11++;
        }
        //parte2
        for (int i = 0; i <= 10; i++) {

            horoscopo[fila][columna] = "?";
            fila++;
            columna++;
        }

        for (int i = 0; i <= 9; i++) {
            horoscopo[fila1][columna1] = "&";
            fila1++;
            columna1++;
        }
        //bien
        for (int i = 0; i <= 8; i++) {
            horoscopo[fila2][columna2] = "%";
            fila2++;
            columna2++;
        }
        for (int i = 0; i <= 7; i++) {
            horoscopo[fila3][columna3] = "$";
            fila3++;
            columna3++;
        }
        for (int i = 0; i <= 6; i++) {
            horoscopo[fila4][columna4] = "#";
            fila4++;
            columna4++;
        }
        for (int i = 0; i <= 5; i++) {
            horoscopo[fila5][columna5] = "!";
            fila5++;
            columna5++;
        }
        for (int i = 0; i <= 4; i++) {
            horoscopo[fila6][columna6] = "=";
            fila6++;
            columna6++;
        }
        for (int i = 0; i <= 3; i++) {
            horoscopo[fila7][columna7] = "a";
            fila7++;
            columna7++;
        }
        for (int i = 0; i <= 2; i++) {
            horoscopo[fila8][columna8] = "z";
            fila8++;
            columna8++;
        }
        for (int i = 0; i <= 1; i++) {
            horoscopo[fila9][columna9] = "b";
            fila9++;
            columna9++;
        }
        System.out.println("0.Aries\n"
                + "1.Tauro\n"
                + "2.Géminis\n"
                + "3.Cáncer\n"
                + "4.Leo\n"
                + "5.Virgo\n"
                + "6.Libra\n"
                + "7.Escorpio\n"
                + "8.Sagitario\n"
                + "9.Capricornio\n"
                + "10.Acuario\n"
                + "11.Piscis");
        System.out.print("Ingresa la el numero del signo: ");
        int filaUsuario = entrada.nextInt();
        System.out.print("Ingresa la el numero del signo: ");
        int columnaUsuario = entrada.nextInt();

        if (horoscopo[filaUsuario][columnaUsuario].equals("*")) {
            System.out.println("Almas gemelas");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("?")) {
            System.out.println("Se complementan");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("&")) {
            System.out.println("Tienen armonia");
        }

        if (horoscopo[filaUsuario][columnaUsuario].equals("%")) {
            System.out.println("olvidalo");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("$")) {
            System.out.println("Pareja Perfecta");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("#")) {
            System.out.println("Dificil de entender");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("!")) {
            System.out.println("Polos Opuestos");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("=")) {
            System.out.println("Dificil de entender");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("a")) {
            System.out.println("Pareja Perfecta");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("z")) {
            System.out.println("Olvidalo");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("b")) {
            System.out.println("Tienen armonia");
        }
        if (horoscopo[filaUsuario][columnaUsuario].equals("X")) {
            System.out.println("Se complementan");
        }

        //imprime
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 11; j++) {
                System.out.print(horoscopo[i][j]);
            }
            System.out.println("");
        }

    }

}
