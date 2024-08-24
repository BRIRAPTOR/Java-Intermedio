package camiones;

import java.util.Scanner;

/**
 * @author brian
 */
public class Camiones {

    public static void CAM() {
        Scanner entrada = new Scanner(System.in);

        // Precios por kilómetro por persona para cada tipo de autobús
        double precioA = 2.0;
        double precioB = 2.5;
        double precioC = 3.0;

        System.out.print("Ingrese el número de personas en el viaje: ");
        int numPersonas = entrada.nextInt();

        if (numPersonas >= 20) {
            System.out.print("Ingrese la distancia en kilómetros recorrida en el viaje: ");
            double distancia = entrada.nextDouble();
            // Calcular el costo total y por persona según el tipo de autobús
            double costoTotalA = numPersonas * precioA * distancia;
            double costoTotalB = numPersonas * precioB * distancia;
            double costoTotalC = numPersonas * precioC * distancia;

            System.out.println("Costo total en autobús A: $" + costoTotalA);
            System.out.println("Costo total en autobús B: $" + costoTotalB);
            System.out.println("Costo total en autobús C: $" + costoTotalC);

            double costoPorPersonaA = costoTotalA / numPersonas;
            double costoPorPersonaB = costoTotalB / numPersonas;
            double costoPorPersonaC = costoTotalC / numPersonas;

            System.out.println("Costo por persona en autobús A: $" + costoPorPersonaA);
            System.out.println("Costo por persona en autobús B: $" + costoPorPersonaB);
            System.out.println("Costo por persona en autobús C: $" + costoPorPersonaC);
        } else {
            System.out.println("El número mínimo de personas para presupuestar es 20.");
        }

        
    }
}
