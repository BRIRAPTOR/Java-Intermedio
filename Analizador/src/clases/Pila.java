package clases;

/**
 * @author brian
 */
public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;

    }

    public void Insertar(char valor) {
        Nodo nuevonodo = new Nodo();
        nuevonodo.informacion = valor;

        if (UltimoValorIngresado == null) {
            nuevonodo.siguiente = null;
            UltimoValorIngresado = nuevonodo;
        } else {
            nuevonodo.siguiente = UltimoValorIngresado;
            UltimoValorIngresado = nuevonodo;
        }
    }

    public char extraer() {
        if (UltimoValorIngresado != null) {
            char informacion = UltimoValorIngresado.informacion;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }

    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }
}
