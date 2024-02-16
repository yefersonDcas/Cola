package Vista;

import Cola.ColaP;
import Modelo.Personas;

/**
 *
 * @author yefri
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ColaP<Personas> cola = new ColaP<>();
        cola.encolar(new Personas("david", "david@uao.edu.co"));
        cola.encolar(new Personas("Cristian", "Cristian@uao.edu.co"));
        cola.encolar(new Personas("yeison", "yeison@uao.edu.co"));
        
        System.out.println("Elementos en cola" +cola.toString());
        
        for (int i = 0; i < 3; i++) {
            if (!cola.estaVacia()){
                cola.desencolar();
                System.out.println("Elementos en cola" +cola.toString());
            }else{
                System.out.println("Cola vacia");
            }
        }
    }

}
