package modelo;

import pila.Base;

/**
 *
 * @author yefri
 */
public class Productos extends Base {

    private String nomProducto;
    private double valor;
    private int cantidad;

    public Productos() {
    }

    public Productos(String nomProducto, double valor, int cantidad) {
        this.nomProducto = nomProducto;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Get the value of nomProducto
     *
     * @return the value of nomProducto
     */
    public String getNomProducto() {
        return nomProducto;
    }

    /**
     * Set the value of nomProducto
     *
     * @param nomProducto new value of nomProducto
     */
    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    @Override
    public String toString() {
        return "Productos{" + "Producto= " + nomProducto + ", Valor= " + valor + ", Cantidad= " + cantidad + '}';
    }

    @Override
    public Base copy() {
        return new Productos(nomProducto, valor, cantidad);
    }

}
