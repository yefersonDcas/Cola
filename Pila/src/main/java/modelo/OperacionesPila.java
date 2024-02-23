
package modelo;

import pila.Base;
import pila.Pila;

/**
 *
 * @author yefri
 */
public class OperacionesPila {
    
    public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaO){
        
        Pila<T> pilaDuplicada= new Pila<>();
        Pila<T> pilaAux= new Pila<>();
        
        while (!pilaO.estaVacia()){
            T elemento= pilaO.desapilar();
            pilaAux.apilar(elemento);
            
        }
        while (!pilaAux.estaVacia()){
            T elemento= pilaAux.desapilar();
            T elementoCopiado= (T)elemento.copy();
            
            pilaO.apilar(elemento);
            pilaDuplicada.apilar(elementoCopiado);
            
        }
        return pilaDuplicada;
    }
    public static<T extends Base> Pila<T> pilaInvertida(Pila<T>PilaO){
        Pila<T> pilaDuplicada= duplicarPila(PilaO);
        Pila<T> pilaInvertida= new Pila<>();
        
        while(!pilaDuplicada.estaVacia()){
            pilaInvertida.apilar(pilaDuplicada.desapilar());
        }
        return pilaDuplicada;
    }
}
