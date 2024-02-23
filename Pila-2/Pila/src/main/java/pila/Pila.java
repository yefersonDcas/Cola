
package pila;

import java.util.LinkedList;

/**
 *
 * @author yefri
 */
public class Pila <T extends Base>{
    private LinkedList<T> tope;
    
public Pila(){
        tope= new LinkedList<>();
}  
public void apilar(T elemento){
    tope.addFirst(elemento);
}
public T desapilar(){
    return tope.removeFirst();
   
}
public boolean estaVacia(){
return tope.isEmpty();
}

    @Override
    public String toString() {
             String cad="[";
        for (T e: tope){
            cad+= " "+ e.toString();
        }
        return cad+"]";
    }

        }

