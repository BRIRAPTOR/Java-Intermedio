package decimales;
/**
 * @author brian
 */
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class ClasePrincipal {
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);        
                //Utilizando Decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
        
        //Utilizando String format
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.2f", raiz)); 
        
         System.out.println("La raiz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 100)/ 100);
         
         BigDecimal bd = new BigDecimal(raiz);
         bd = bd.setScale(2, RoundingMode.HALF_UP);
         System.out.println("La raiz cuadrada de " + numero + " es: " + bd.doubleValue()); 
         
    }
}


