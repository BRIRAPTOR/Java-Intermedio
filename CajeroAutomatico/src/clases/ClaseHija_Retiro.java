package clases;
/**
 * @author brian
 */
public class ClaseHija_Retiro extends ClasePadre_Abstracta{
 @Override
    public void Transacciones() {
        
        System.out.print("¿Cuánto deseas reatirar? ");
        Retiro();
        if(retiro <= getsaldo()){
            transacciones = getsaldo();
            setsaldo(transacciones - retiro);
            System.out.println("----------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getsaldo());
            System.out.println("----------------------------------");
            
        }else{
            System.out.println("----------------------------------");           
            System.out.println("Saldo insuficiente.");
            System.out.println("----------------------------------");
        }
    }   
}
