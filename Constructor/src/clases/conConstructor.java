package clases;
/**
 * @author brian
 */
import java.util.Scanner;
public class conConstructor {
public conConstructor(){
    Scanner entrada = new Scanner(System.in);
String nombre = "";

    System.out.println("¿Cuál es tu nombre?: ");
    nombre = entrada.nextLine();
    
    System.out.println("Tu nombre es: " + nombre);
}
}
