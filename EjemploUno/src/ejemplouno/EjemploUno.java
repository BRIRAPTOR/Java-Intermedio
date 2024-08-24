package ejemplouno;

import java.util.Scanner;

public class EjemploUno {
    
    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int longitudpalabra = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();
        
        longitudpalabra = palabra.length();
        while (longitudpalabra != 0) {
    
            palabraInvertida += palabra.substring(longitudpalabra -1, longitudpalabra );
                    longitudpalabra--;
        }
        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }
}
