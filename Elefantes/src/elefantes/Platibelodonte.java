/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */

public class Platibelodonte extends Moeritherium {
    protected int longitudColmillos;

    public Platibelodonte(String color, int peso, int longitudColmillos) {
        super(color, peso);
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

    public void usarColmillos() {
        System.out.println("El elefante está usando sus colmillos...");
    }
    
    // Getter para la longitud de los colmillos
    public int getLongitudColmillos() {
        return longitudColmillos;
    }

    // Setter para la longitud de los colmillos
    public void setLongitudColmillos(int longitudColmillos) {
        this.longitudColmillos = longitudColmillos;
    }
}
