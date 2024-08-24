package clase;

/**
 * @author brian
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        int Matriz_uno[][] = new int[2][3];
        int Matriz_dos[][] = new int[3][2];
        int Matriz_resultante[][] = new int[2][2];
        //Lenado de la matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }
        //multiplicacion de matrices
        for (int i = 0; i < 4; i++) {
            if (Matriz_resultante[0][0] == 0) {
                int temporal = (Matriz_uno[0][0] * Matriz_dos[0][0])
                        + (Matriz_uno[0][1] * Matriz_dos[1][0])
                        + (Matriz_uno[0][2] * Matriz_dos[2][0]);
                Matriz_resultante[0][0] = temporal;

            } else if (Matriz_resultante[1][0] == 0) {
                int temporal = (Matriz_uno[1][0] * Matriz_dos[0][0])
                        + (Matriz_uno[1][1] * Matriz_dos[1][0])
                        + (Matriz_uno[1][2] * Matriz_dos[2][0]);
                Matriz_resultante[1][0] = temporal;
            }
            
             else if (Matriz_resultante[0][1] == 0) {
                int temporal = (Matriz_uno[0][0] * Matriz_dos[0][1])
                        + (Matriz_uno[0][1] * Matriz_dos[1][1])
                        + (Matriz_uno[0][2] * Matriz_dos[2][1]);
                Matriz_resultante[0][1] = temporal;
            }
            
            else if (Matriz_resultante[1][1] == 0) {
                int temporal = (Matriz_uno[1][0] * Matriz_dos[0][1])
                        + (Matriz_uno[1][1] * Matriz_dos[1][1])
                        + (Matriz_uno[1][2] * Matriz_dos[2][1]);
                Matriz_resultante[1][1] = temporal;
            }

        }
        //imprimiendo matrices
        for (int i = 0; i < 3; i++) {
            if(i < 2){
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + Matriz_uno[i][j] + " ]");
                }
                if(i == 1){
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
               
               
            }else {
                System.out.print("                      ");
            }
            
            for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + Matriz_dos[i][j] + " ]");
                }
            if(i == 1){
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
            
            if (i < 2){
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + Matriz_resultante[i][j] + " ]");
                }
                
            }
            System.out.println("");
        }
    }
}
