package Paquete;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSnake extends JPanel {
    Color colorsnake = Color.blue;
    Color colorcomida = Color.red;
    int tammax,tam,can,res;
    List<int[]> snake = new ArrayList<>();
    int[] comida = new int[2];
    String direccion = "de";
    
    Thread hilo;
    Caminante camino;
    
    public PanelSnake(int tammax,int can){
        this.tammax = tammax;
        this.can = can;
        this.tam = tammax/can;
        this.res = tammax%can;
        int[] a = {can/2-1, can/2-1};
        int[] b = {can/2, can/2-1};
        snake.add(a);
        snake.add(b);
        generarcomida();
        camino = new Caminante(this);
        hilo = new Thread(camino);
        hilo.start();
    }
    
    public void inicializar(){
        camino.estado = true;
        int[] a = {can/2-1, can/2-1};
        int[] b = {can/2, can/2-1};
        snake.clear();
        snake.add(a);
        snake.add(b);
        generarcomida();
    }
    
    @Override
    public void paint(Graphics pintor){
     super.paint(pintor);
     pintor.setColor(colorsnake);
    //Pintando serpiente
        for (int i = 0; i < snake.size(); i++) {
                pintor.fillRect(res/2 + snake.get(i)[0]*tam,res/2 + snake.get(i)[1]*tam, tam-1, tam-1);
            }
    //Pintando comida
    pintor.setColor(colorcomida);
    pintor.fillRect(res/2 + comida[0]*tam,res/2 + comida[1]*tam, tam-1, tam-1);
    }
    
    public void avanzar(){
    int[] ultimo = snake.getLast();
    int agregarx = 0;
    int agregary = 0;
        switch (direccion) {
            case "de":
                agregarx = 1;
                break;
            case "iz":
                agregarx = -1;
                break;
            case "ar":
                agregary = -1;
                break;
            case "ab":
                agregary = 1;
            break;
            default:
                throw new AssertionError();
        }
        boolean existe = false;
        int[] nuevo = {Math.floorMod(ultimo[0] + agregarx,can),
            Math.floorMod(ultimo[1] + agregary,can)};
        for (int i = 0; i < snake.size(); i++) {
            if(nuevo[0] == snake.get(i)[0] && nuevo[1] == snake.get(i)[1]){
                existe = true;
                break;
            }
        }
        //Choco contra si misma la serpiente
        if(existe){
            JOptionPane.showMessageDialog(null, "Has perdido.");
            camino.parar();
        }else if(nuevo[0] == comida[0]&& nuevo[1] == comida[1]){
            snake.add(nuevo);
            if(snake.size() == can * can){
                JOptionPane.showMessageDialog(null, "¡Ganaste!");
                camino.parar();
            }else {
                generarcomida();
            }
        } else{        
            snake.add(nuevo);
            snake.remove(0);
        }
    }
    
    public void generarcomida(){
       // Si la serpiente ocupa todo el tablero, no hay lugar para comida
    if (snake.size() == can * can) {
        comida = null; // Sin espacio disponible
        return;
    }

    int a, b;
    boolean existe;

    do {
        a = (int)(Math.random() * can);
        b = (int)(Math.random() * can);
        existe = false;
        for (int[] par : snake) {
            if (par[0] == a && par[1] == b) {
                existe = true;
                break;
            }
        }
    } while (existe);
    comida = new int[]{a, b};
    }
    
    public void cambiardireccion(String dir){
        if((this.direccion.equals("iz")||this.direccion.equals("de"))&&(dir.equals("ar")||dir.equals("ab"))){
            this.direccion = dir;
        }
        if((this.direccion.equals("ar")||this.direccion.equals("ab"))&&(dir.equals("iz")||dir.equals("de"))){
            this.direccion = dir;
        }
    }
}
