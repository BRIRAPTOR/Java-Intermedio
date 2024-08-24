package clases;
/**
 * @author brian
 */
public class Hilo_Proceso extends Thread{
    @Override
public void run(){
        
    for(int i = 0; i <= 5; i++){
        System.out.println(i +this.getName());
    }
        System.out.println("");
}
}
