package clase;

/**
 * @author brian
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        int matriz_uno[][] = new int[3][3];
        int matriz_Dos[][] = new int[3][3];
        int matriz_Resultante[][] = new int[3][3];

        //Llenado de la primer Matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }
        
        //Llenado de la primer Matriz
        for (int i = 0; i < matriz_Dos.length; i++) {
            for (int j = 0; j < matriz_Dos.length; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);
            }
        }
        
        //Suma o resta de Matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_Resultante[i][j] = matriz_uno[i][j] + matriz_Dos[i][j];
            }
        }
        //imprimiendo las matrices
        for(int i = 0; i < matriz_uno.length; i++) {
            
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }
            if(i == 1){
                System.out.print("  +  ");
            }else{
                System.out.print("     ");
            }
            
            for (int j = 0; j < matriz_Dos.length; j++) {
                System.out.print("[ " + matriz_Dos[i][j] + " ]");
            }
                
        
        
         if(i == 1){
                System.out.print("  =  ");
            }else{
                System.out.print("     ");
            }
         
          for (int j = 0; j < matriz_Resultante.length; j++) {
                System.out.print("[ " + matriz_Resultante[i][j] + " ]");
            }
          System.out.println("");
        }
    }
}
