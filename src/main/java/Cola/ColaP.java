
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
    
    public boolean estaVacia(){
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        String cad="[";
        for (T e: elementos){
            cad+= " "+ e.toString();
        }
        return cad+"]";
    }
    
}
