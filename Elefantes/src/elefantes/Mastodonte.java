/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */
public class Mastodonte extends Platibelodonte {
int tamañoOrejas = 0;
    public Mastodonte(String color, int peso, int longitudColmillos, int tamañoOrejas) {
        super(color, peso, longitudColmillos);
        this.tamañoOrejas = tamañoOrejas;
    }

    public int getLongitudColmillos() {
        return longitudColmillos;
    }

    public void setLongitudColmillos(int longitudColmillos) {
        this.longitudColmillos = longitudColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void moverOrejas() {
        System.out.println("El elefante está moviendo sus orejas...");
    }
    
      // Getter para el tamaño de las orejas
    public int getTamañoOrejas() {
        return tamañoOrejas;
    }

    // Setter para el tamaño de las orejas
    public void setTamañoOrejas(int tamañoOrejas) {
        this.tamañoOrejas = tamañoOrejas;
    }
}
