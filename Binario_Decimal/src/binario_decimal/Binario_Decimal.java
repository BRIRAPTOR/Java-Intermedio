/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binario_decimal;

/**
 *
 * @author Brian
 */
public class Binario_Decimal {

    /**
     * @param args the command line arguments
     */
    public static int binario_decimal(String cadena) {
        int count = 0;
        int exp = 0;
        for (int i = cadena.length(); 0 < i  ; i--) {
            String letra = cadena.substring(i -1, i);
            if(letra.equals("1")){
                count += Math.pow(2, exp);
            }
            exp++;
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(binario_decimal("110101000111110101"));
    }
    
    
}
