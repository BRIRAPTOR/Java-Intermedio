package clases;
/**
 * @author brian
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta {
@Override
    public void Transacciones(){
        System.out.print("'¿Cuánto deseas depositar?: ");
        Deposito();
        
        transacciones = getsaldo();
        setsaldo(transacciones + deposito);
        System.out.println("-------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tú saldo actual es: " + getsaldo());
        System.out.println("-------------------------------");
    }
}
