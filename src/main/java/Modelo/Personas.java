package Modelo;

import Cola.Base;

/**
 *
 * @author yefri
 */
public class Personas extends Base {

    private String nombrePersona;
    private String correoPersona;

    public Personas() {
    }

    public Personas(String nombrePersona, String correoPersona) {
        this.nombrePersona = nombrePersona;
        this.correoPersona = correoPersona;

    }

    /**
     * Get the value of nombrePersona
     *
     * @return the value of nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Set the value of nombrePersona
     *
     * @param nombrePersona new value of nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * Get the value of correoPersona
     *
     * @return the value of correoPersona
     */
    public String getCorreoPersona() {
        return correoPersona;
    }

    /**
     * Set the value of correoPersona
     *
     * @param correoPersona new value of correoPersona
     */
    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombrePersona=" + nombrePersona + ", correoPersona=" + correoPersona + '}';
    }

    @Override
    public Base copy() {
        return new Personas(nombrePersona, correoPersona);
    }

}
