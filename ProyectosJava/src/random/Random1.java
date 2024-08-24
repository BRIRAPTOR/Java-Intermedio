package random;
import java.util.Scanner;
import java.util.Random;
/**
 * @author brian
 */
public class Random1 {
  public static void Ran() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100); // Genera un número aleatorio entre 1 y 100    
        boolean adivinado = false;
     
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");
        
        while (!adivinado) {
            System.out.print("Ingresa tu suposición: ");
            int suposicion = entrada.nextInt();
            
            if (suposicion < numeroSecreto) {
                System.out.println("Demasiado pequeño, Inténtalo de nuevo.");
            } else if (suposicion > numeroSecreto) {
                System.out.println("Demasiado grande, Inténtalo de nuevo.");
            } else {
                System.out.println("Correcto, Has adivinado el número" );
                adivinado = true;
            }
        }

        
    }
}
