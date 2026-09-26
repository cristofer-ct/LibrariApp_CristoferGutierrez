package org.cg.model;

/**
 * Clase Editorial
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Editorial {
    private String nit;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditoria;

    /**
     * Constructor para la clase Editorial.
     */
    /**
     * Constructor para la clase Editorial.
     */
    public Editorial() {
    }

    /**
     * Constructor para la clase Editorial.
     * @param nit parámetro de tipo String
     * @param nombreEditorial parámetro de tipo String
     * @param telefonoEditorial parámetro de tipo String
     * @param direccionEditoria parámetro de tipo String
     */
    /**
     * Constructor para la clase Editorial.
     * @param nit parámetro de tipo String
     * @param nombreEditorial parámetro de tipo String
     * @param telefonoEditorial parámetro de tipo String
     * @param direccionEditoria parámetro de tipo String
     */
    public Editorial(String nit, String nombreEditorial, String telefonoEditorial, String direccionEditoria) {
        this.nit = nit;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditoria = direccionEditoria;
    }

    /**
     * Obtiene el valor de nit.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nit.
     * @return un valor de tipo String
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece el valor de nit.
     * @param nit parámetro de tipo String
     */
    /**
     * Establece el valor de nit.
     * @param nit parámetro de tipo String
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Obtiene el valor de nombreeditorial.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombreeditorial.
     * @return un valor de tipo String
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    /**
     * Establece el valor de nombreeditorial.
     * @param nombreEditorial parámetro de tipo String
     */
    /**
     * Establece el valor de nombreeditorial.
     * @param nombreEditorial parámetro de tipo String
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    /**
     * Obtiene el valor de telefonoeditorial.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de telefonoeditorial.
     * @return un valor de tipo String
     */
    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    /**
     * Establece el valor de telefonoeditorial.
     * @param telefonoEditorial parámetro de tipo String
     */
    /**
     * Establece el valor de telefonoeditorial.
     * @param telefonoEditorial parámetro de tipo String
     */
    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    /**
     * Obtiene el valor de direccioneditoria.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de direccioneditoria.
     * @return un valor de tipo String
     */
    public String getDireccionEditoria() {
        return direccionEditoria;
    }

    /**
     * Establece el valor de direccioneditoria.
     * @param direccionEditoria parámetro de tipo String
     */
    /**
     * Establece el valor de direccioneditoria.
     * @param direccionEditoria parámetro de tipo String
     */
    public void setDireccionEditoria(String direccionEditoria) {
        this.direccionEditoria = direccionEditoria;
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
        return nombreEditorial;
    }
}
