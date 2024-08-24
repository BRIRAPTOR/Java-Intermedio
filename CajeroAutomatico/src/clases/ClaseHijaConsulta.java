package clases;
/**
 * @author brian
 */
public class ClaseHijaConsulta extends ClasePadre_Abstracta{

    @Override
    public void Transacciones() {
        System.out.println("--------------------------------");
        System.out.println("Tú saldo actual es: " + getsaldo() );
        System.out.println("--------------------------------");

    }

}
