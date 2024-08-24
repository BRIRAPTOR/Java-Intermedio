/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraherencia;

/**
 *
 * @author Usuario
 */

public class Rombo extends Forma {
    double diagonalMayor;
    double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
}
