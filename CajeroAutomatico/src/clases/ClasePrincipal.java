package clases;

/**
 * @author brian
 */
public class ClasePrincipal {

    public static void main(String args[]) {
        ClasePadre_Abstracta mensajero = new ClaseHijaConsulta();
        mensajero.setsaldo(5000);
        mensajero.Operaciones();
    }
}
