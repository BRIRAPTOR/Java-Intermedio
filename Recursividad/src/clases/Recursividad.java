package clases;

/**
 * @author brian
 */
public class Recursividad {

    public void Imprimir(int x) {
        if (x <= 5) {
            System.out.print(x + " ");
            Imprimir(x + 1);
        }
    }
}
