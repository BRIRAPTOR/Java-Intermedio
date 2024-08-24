/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraherencia;

/**
 *
 * @author Usuario
 */
public abstract class Forma {
    abstract double calcularArea();
    
    public static void main(String[] args) {
    Cuadrado cuadrado = new Cuadrado(5);
    System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());

    Rombo rombo = new Rombo(6, 4);
    System.out.println("El área del rombo es: " + rombo.calcularArea());

    Triangulo triangulo = new Triangulo(3, 7);
    System.out.println("El área del triángulo es: " + triangulo.calcularArea());
}

}
