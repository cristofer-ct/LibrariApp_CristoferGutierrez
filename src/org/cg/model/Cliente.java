package org.cg.model;

/**
 * Clase Cliente
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Cliente {
    private long cui;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoElectronico;

    /**
     * Constructor para la clase Cliente.
     */
    /**
     * Constructor para la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor para la clase Cliente.
     * @param cui parámetro de tipo long
     * @param nombreCliente parámetro de tipo String
     * @param apellidoCliente parámetro de tipo String
     * @param correoElectronico parámetro de tipo String
     */
    /**
     * Constructor para la clase Cliente.
     * @param cui parámetro de tipo long
     * @param nombreCliente parámetro de tipo String
     * @param apellidoCliente parámetro de tipo String
     * @param correoElectronico parámetro de tipo String
     */
    public Cliente(long cui, String nombreCliente, String apellidoCliente, String correoElectronico) {
        this.cui = cui;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el valor de cui.
     * @return un valor de tipo long
     */
    /**
     * Obtiene el valor de cui.
     * @return un valor de tipo long
     */
    public long getCui() {
        return cui;
    }

    /**
     * Establece el valor de cui.
     * @param cui parámetro de tipo long
     */
    /**
     * Establece el valor de cui.
     * @param cui parámetro de tipo long
     */
    public void setCui(long cui) {
        this.cui = cui;
    }

    /**
     * Obtiene el valor de nombrecliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombrecliente.
     * @return un valor de tipo String
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente parámetro de tipo String
     */
    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente parámetro de tipo String
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el valor de apellidocliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de apellidocliente.
     * @return un valor de tipo String
     */
    public String getApellidoCliente() {
        return apellidoCliente;
    }

    /**
     * Establece el valor de apellidocliente.
     * @param apellidoCliente parámetro de tipo String
     */
    /**
     * Establece el valor de apellidocliente.
     * @param apellidoCliente parámetro de tipo String
     */
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    /**
     * Obtiene el valor de correoelectronico.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de correoelectronico.
     * @return un valor de tipo String
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece el valor de correoelectronico.
     * @param correoElectronico parámetro de tipo String
     */
    /**
     * Establece el valor de correoelectronico.
     * @param correoElectronico parámetro de tipo String
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    /**
     * Método toString.
     * @return un valor de tipo String
     */
    /**
     * Método toString.
     * @return un valor de tipo String
     */
    public String toString() {
        return nombreCliente + " " + apellidoCliente;
    }
}
