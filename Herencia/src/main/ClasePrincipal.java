package main;
/**
 * @author brian
 */
import operaciones.ClaseHija_resta;
import operaciones.ClaseHija_suma;
public class ClasePrincipal {
    public static void main(String args[]){
        ClaseHija_suma mensajeroSuma = new ClaseHija_suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        ClaseHija_resta mensajeroResta = new ClaseHija_resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.restar();
        System.out.print("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }
   
}
