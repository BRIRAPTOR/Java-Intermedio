package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * @author brian
 */
public class Menu {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int opcion;
Promedioposyneg pro = new Promedioposyneg();
        do {
            System.out.println("Selecciona un programa:");
            System.out.println("1. Promedio de Positivos y Negativos");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Buscaminas");
            System.out.println("0. Salir");
            System.out.print("Ingresa el número de programa: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    Promedioposyneg.Promedio();
                    
                    break;
                case 2:
                    ejercicio2.ejercici2();
                    break;
                case 3:
                    ejercicio3.ejercici3();
                    break;
                case 4:
                    ejercicio4.ejercicio4();
                    break;
                case 5:
                    ejercicio5.ejercici5();
                    break;
                case 6:
                    ejercicio6.ejercici6();
                    break;
                case 7:
                    Buscaminas.busca();
                    break;
                case 0:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa un número válido.");
                    break;
            }
        } while (opcion != 0);

        
    }
}
