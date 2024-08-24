/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */
public class ElefanteAsiatico extends Platibelodonte {
    private boolean tieneOrejasPequeñas;

    public ElefanteAsiatico(String color, int peso, int longitudColmillos, int tamañoOrejas, boolean tieneOrejasPequeñas) {
        super(color, peso, longitudColmillos);
        this.tieneOrejasPequeñas = tieneOrejasPequeñas;
    }

    public boolean isTieneOrejasPequeñas() {
        return tieneOrejasPequeñas;
    }

    public void setTieneOrejasPequeñas(boolean tieneOrejasPequeñas) {
        this.tieneOrejasPequeñas = tieneOrejasPequeñas;
    }

    public void mostrarOrejas() {
        if (tieneOrejasPequeñas) {
            System.out.println("El elefante asiático tiene orejas pequeñas...");
        } else {
            System.out.println("Este elefante asiático no tiene orejas pequeñas...");
        }
    }
}
