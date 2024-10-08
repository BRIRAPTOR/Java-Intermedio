package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 * @author brian
 */
public class Pila {
private Nodo UltimoValorIngresado;
int tamaño = 0;
String Lista = "";


public boolean PilaVacia(){
    return UltimoValorIngresado == null;
} 

public void InsertarNodo(int nodo){
    Nodo nuevo_nodo = new Nodo(nodo);
    nuevo_nodo.siguiente = UltimoValorIngresado;
    UltimoValorIngresado = nuevo_nodo;
    tamaño++;
}
public int EliminarNodo(){
    int auxiliar = UltimoValorIngresado.informacion;
    UltimoValorIngresado = UltimoValorIngresado.siguiente;
    tamaño--;
    return auxiliar;
    
}
public int MostrarUltimoValorIngrasado(){
    return UltimoValorIngresado.informacion;
}

public int TamañoPila(){
    return tamaño;
}

public void VaciarPila(){
    while (!PilaVacia()){
        EliminarNodo();
       
    }
}

public void MostrarValores(){
    Nodo recorrido = UltimoValorIngresado;
    
    while(recorrido != null){
        Lista += recorrido.informacion + "\n";
        recorrido = recorrido.siguiente;
    }
    JOptionPane.showMessageDialog(null, Lista);
    Lista = "";
}
}