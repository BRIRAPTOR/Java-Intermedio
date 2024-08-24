package clases;
/**
 * @author brian
 */
import java.util.Scanner;
public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intoduce el numero para calcular su factorial: ");
        int numero = entrada.nextInt();
        
        Recursividad recusividad = new Recursividad();
        
        int factorial = recusividad.Factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
                    
    }
}
