/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */

// Clase que representa un mamut, que es una evolucion del elefante
public class Mamut extends Mastodonte {
    protected boolean tieneLana;

    public Mamut(String color, int peso, int longitudColmillos, int tamañoOrejas, boolean tieneLana) {
        super(color, peso, longitudColmillos, tamañoOrejas);
        this.tieneLana = tieneLana;
    }

    public void mostrarLana() {
        if (tieneLana) {
            System.out.println("El mamut tiene lana...");
        } else {
            System.out.println("Este mamut no tiene lana...");
        }
    }
}


