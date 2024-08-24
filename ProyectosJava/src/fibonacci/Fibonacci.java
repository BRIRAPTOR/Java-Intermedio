package fibonacci;

/**
 * @author brian
 */
public class Fibonacci {

    public static void FIBO() {
        int limite = 1000;
        int num1 = 0;
        int num2 = 1;

        System.out.println("Números de la serie de Fibonacci menores a 1000:");

        while (num1 < limite) {
            System.out.print(num1 + " ");
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
