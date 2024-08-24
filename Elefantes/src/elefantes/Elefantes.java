/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */
public class Elefantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moeritherium moeri = new Moeritherium("gris", 2000);
        moeri.comer();
        System.out.println(moeri.color);
        System.out.println(moeri.peso);
        
        System.out.println("");
        
        Platibelodonte plati = new Platibelodonte("blue", 2100, 50);
        plati.comer();
        plati.usarColmillos();
        System.out.println(plati.color);
        System.out.println(plati.peso);
        System.out.println(plati.longitudColmillos);
        
              Mastodonte mastodonte = new Mastodonte("gris", 5000, 100, 20);

        // Imprimir las características del mastodonte
        System.out.println("Características del Mastodonte:");
        System.out.println("Color: " + mastodonte.getColor());
        System.out.println("Peso: " + mastodonte.getPeso() + " kg");
        System.out.println("Longitud de Colmillos: " + mastodonte.getLongitudColmillos() + " cm");
        System.out.println("Tamaño de Orejas: " + mastodonte.getTamañoOrejas() + " cm");

        // Usar el método moverOrejas()
        mastodonte.moverOrejas();

        // Cambiar el tamaño de las orejas
        mastodonte.setTamañoOrejas(25);
        System.out.println("Nuevo tamaño de orejas: " + mastodonte.getTamañoOrejas() + " cm");
        
         Mamut mamut = new Mamut("marrón", 8000, 120, 30, true);

        // Imprimir las características del mamut
        System.out.println("Características del Mamut:");
        System.out.println("Color: " + mamut.getColor());
        System.out.println("Peso: " + mamut.getPeso() + " kg");
        System.out.println("Longitud de Colmillos: " + mamut.getLongitudColmillos() + " cm");
        System.out.println("Tamaño de Orejas: " + mamut.getTamañoOrejas() + " cm");
        
        // Cambiar algunas características del mamut
        mamut.setPeso(8500);
        mamut.setTamañoOrejas(35);
        mamut.setLongitudColmillos(130);
        mamut.setColor("gris");
        mamut.mostrarLana();
        mamut.moverOrejas();
        

        // Imprimir las nuevas características del mamut
        System.out.println("\nNuevas características del Mamut:");
        System.out.println("Color: " + mamut.getColor());
        System.out.println("Peso: " + mamut.getPeso() + " kg");
        System.out.println("Longitud de Colmillos: " + mamut.getLongitudColmillos() + " cm");
        System.out.println("Tamaño de Orejas: " + mamut.getTamañoOrejas() + " cm");
        mamut.mostrarLana();
        
        
        ElefanteAsiatico elefanteAsiatico = new ElefanteAsiatico("gris", 4000, 80, 25, true);
         System.out.println("Características del Elefante Asiático:");
        System.out.println("Color: " + elefanteAsiatico.getColor());
        System.out.println("Peso: " + elefanteAsiatico.getPeso() + " kg");
        System.out.println("Longitud de Colmillos: " + elefanteAsiatico.getLongitudColmillos() + " cm");
        
        elefanteAsiatico.mostrarOrejas();

        // Cambiar algunas características del elefante asiático
        elefanteAsiatico.setPeso(4200);
       
        elefanteAsiatico.setLongitudColmillos(85);
        elefanteAsiatico.setColor("gris oscuro");
        elefanteAsiatico.setTieneOrejasPequeñas(false);

        // Imprimir las nuevas características del elefante asiático
        System.out.println("\nNuevas características del Elefante Asiático:");
        System.out.println("Color: " + elefanteAsiatico.getColor());
        System.out.println("Peso: " + elefanteAsiatico.getPeso() + " kg");
        System.out.println("Longitud de Colmillos: " + elefanteAsiatico.getLongitudColmillos() + " cm");
        
        elefanteAsiatico.mostrarOrejas();
    }
        
        

    

}
