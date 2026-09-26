package org.cg.model;

/**
 * Clase Cliente
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class Cliente del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
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
    /**
     * Constructor de Cliente.
     * @param cui valor de tipo long
     * @param nombreCliente valor de tipo String
     * @param apellidoCliente valor de tipo String
     * @param correoElectronico valor de tipo String
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
    /**
     * Obtiene el valor de cui.
     * @return valor de tipo long
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
    /**
     * Establece el valor de cui.
     * @param cui valor de tipo long
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
    /**
     * Obtiene el valor de nombrecliente.
     * @return valor de tipo String
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
    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente valor de tipo String
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
    /**
     * Obtiene el valor de apellidocliente.
     * @return valor de tipo String
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
    /**
     * Establece el valor de apellidocliente.
     * @param apellidoCliente valor de tipo String
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
    /**
     * Obtiene el valor de correoelectronico.
     * @return valor de tipo String
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
    /**
     * Establece el valor de correoelectronico.
     * @param correoElectronico valor de tipo String
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
    /**
     * Retorna la representacion en cadena del objeto.
     * @return valor de tipo String
     */
    public String toString() {
        return nombreCliente + " " + apellidoCliente;
    }
}
