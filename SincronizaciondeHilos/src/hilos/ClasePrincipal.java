package hilos;

/**
 * @author brian
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        hilo1.start();
        try {
            Hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        }
        hilo2.start();
         try {
            Hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
        hilo3.start();
         try {
            Hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3 " + e);
        }
        hilo4.start();
         try {
            Hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4 " + e);
        }
    }

}
