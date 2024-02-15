/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import java.util.LinkedList;

/**
 *
 * @author yefri
 */
public class ColaP<T extends Base> {

    private LinkedList<T> elementos;

    public ColaP() {
        elementos = new LinkedList<>();
    }
    
    public void encolar(T elemento){
        elementos.addLast(elemento);    
    }
    
    public T desencolar(){
        return elementos.removeFirst();
    }
    
    public  boolean estaVacia(){
        return elementos.isEmpty();
    }
}
