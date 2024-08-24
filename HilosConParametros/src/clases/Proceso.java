package clases;
/**
 * @author brian
 */
public class Proceso extends Thread{
    int num_uno;
    @Override
public void run(){
    for(int i = 0; i <= num_uno; i++){
        System.out.println(i +this.getName());
    }
        System.out.println("");
}
public void ValorDeLaCondicion(int valor){
    this.num_uno = valor;
}
}
