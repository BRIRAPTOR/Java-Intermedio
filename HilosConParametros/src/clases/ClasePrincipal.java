package clases;
/**
 * @author brian
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso();
        Proceso hilo2 = new Proceso();
        
        hilo1.ValorDeLaCondicion(5);
        
        hilo1.start();
        hilo2.ValorDeLaCondicion(10);
        hilo2.start();
    }
}
