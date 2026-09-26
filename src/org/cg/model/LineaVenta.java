package org.cg.model;

//Línea de venta: un libro con su cantidad, usada como fila temporal en la pantalla de venta
//antes de guardar los DetalleVenta en la base de datos.
/**
 * Clase LineaVenta
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;

    /**
     * Constructor para la clase LineaVenta.
     */
    /**
     * Constructor para la clase LineaVenta.
     */
    public LineaVenta() {
    }

    /**
     * Constructor para la clase LineaVenta.
     * @param libro parámetro de tipo Libro
     * @param cantidad parámetro de tipo int
     */
    /**
     * Constructor para la clase LineaVenta.
     * @param libro parámetro de tipo Libro
     * @param cantidad parámetro de tipo int
     */
    public LineaVenta(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor de libro.
     * @return un valor de tipo Libro
     */
    /**
     * Obtiene el valor de libro.
     * @return un valor de tipo Libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece el valor de libro.
     * @param libro parámetro de tipo Libro
     */
    /**
     * Establece el valor de libro.
     * @param libro parámetro de tipo Libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
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
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor de isbn.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de isbn.
     * @return un valor de tipo String
     */
    public String getIsbn() {
        return libro.getIsbn();
    }

    /**
     * Obtiene el valor de titulo.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de titulo.
     * @return un valor de tipo String
     */
    public String getTitulo() {
        return libro.getTitulo();
    }

    /**
     * Obtiene el valor de precio.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de precio.
     * @return un valor de tipo double
     */
    public double getPrecio() {
        return libro.getPrecio();
    }

    /**
     * Obtiene el valor de subtotal.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de subtotal.
     * @return un valor de tipo double
     */
    public double getSubtotal() {
        return libro.getPrecio() * cantidad;
    }
}
