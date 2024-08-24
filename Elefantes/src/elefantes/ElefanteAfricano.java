/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elefantes;

/**
 *
 * @author Usuario
 */
public class ElefanteAfricano extends Platibelodonte {
    private boolean tieneColmillosGrandes;

    public ElefanteAfricano(String color, int peso, int longitudColmillos, boolean tieneColmillosGrandes) {
        super(color, peso, longitudColmillos);
        this.tieneColmillosGrandes = tieneColmillosGrandes;
    }

    public boolean isTieneColmillosGrandes() {
        return tieneColmillosGrandes;
    }

    public void setTieneColmillosGrandes(boolean tieneColmillosGrandes) {
        this.tieneColmillosGrandes = tieneColmillosGrandes;
    }

    public void mostrarColmillos() {
        if (tieneColmillosGrandes) {
            System.out.println("El elefante africano tiene colmillos grandes...");
        } else {
            System.out.println("Este elefante africano no tiene colmillos grandes...");
        }
    }
}
