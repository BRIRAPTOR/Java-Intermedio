package polimorfismo;
/**
 * @author brian
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Operaciones_ClasePadre mensajero_suma = new Suma_ClaseHija();
        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        Operaciones_ClasePadre mensajero_resta = new Resta_ClaseHija();
        mensajero_resta.PedirDatos();
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
    }
}
