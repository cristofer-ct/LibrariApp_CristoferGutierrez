package org.cg.model;

/**
 * Clase DetalleVenta
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class DetalleVenta del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int noVenta;
    private String isbn;
    private int cantidad;
    private double precio;

    /**
     * Constructor para la clase DetalleVenta.
     */
    /**
     * Constructor para la clase DetalleVenta.
     */
    public DetalleVenta() {
    }

    /**
     * Constructor para la clase DetalleVenta.
     * @param idDetalleVenta parámetro de tipo int
     * @param noVenta parámetro de tipo int
     * @param isbn parámetro de tipo String
     * @param cantidad parámetro de tipo int
     * @param precio parámetro de tipo double
     */
    /**
     * Constructor para la clase DetalleVenta.
     * @param idDetalleVenta parámetro de tipo int
     * @param noVenta parámetro de tipo int
     * @param isbn parámetro de tipo String
     * @param cantidad parámetro de tipo int
     * @param precio parámetro de tipo double
     */
    /**
     * Constructor de DetalleVenta.
     * @param idDetalleVenta valor de tipo int
     * @param noVenta valor de tipo int
     * @param isbn valor de tipo String
     * @param cantidad valor de tipo int
     * @param precio valor de tipo double
     */
    public DetalleVenta(int idDetalleVenta, int noVenta, String isbn, int cantidad, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.noVenta = noVenta;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Obtiene el valor de iddetalleventa.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de iddetalleventa.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de iddetalleventa.
     * @return valor de tipo int
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     * Establece el valor de iddetalleventa.
     * @param idDetalleVenta parámetro de tipo int
     */
    /**
     * Establece el valor de iddetalleventa.
     * @param idDetalleVenta parámetro de tipo int
     */
    /**
     * Establece el valor de iddetalleventa.
     * @param idDetalleVenta valor de tipo int
     */
    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     * Obtiene el valor de noventa.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de noventa.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de noventa.
     * @return valor de tipo int
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     * Establece el valor de noventa.
     * @param noVenta parámetro de tipo int
     */
    /**
     * Establece el valor de noventa.
     * @param noVenta parámetro de tipo int
     */
    /**
     * Establece el valor de noventa.
     * @param noVenta valor de tipo int
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     * Obtiene el valor de isbn.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de isbn.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de isbn.
     * @return valor de tipo String
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el valor de isbn.
     * @param isbn parámetro de tipo String
     */
    /**
     * Establece el valor de isbn.
     * @param isbn parámetro de tipo String
     */
    /**
     * Establece el valor de isbn.
     * @param isbn valor de tipo String
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de cantidad.
     * @return valor de tipo int
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece el valor de cantidad.
     * @param cantidad parámetro de tipo int
     */
    /**
     * Establece el valor de cantidad.
     * @param cantidad parámetro de tipo int
     */
    /**
     * Establece el valor de cantidad.
     * @param cantidad valor de tipo int
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor de precio.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de precio.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de precio.
     * @return valor de tipo double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el valor de precio.
     * @param precio parámetro de tipo double
     */
    /**
     * Establece el valor de precio.
     * @param precio parámetro de tipo double
     */
    /**
     * Establece el valor de precio.
     * @param precio valor de tipo double
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
