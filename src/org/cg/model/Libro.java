package org.cg.model;

/**
 * Clase Libro
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String fechaPublicacion;
    private double precio;
    private int idCategoria;
    private String nitEditorial;
    private int stock;

    /**
     * Constructor para la clase Libro.
     */
    /**
     * Constructor para la clase Libro.
     */
    public Libro() {
    }

    /**
     * Constructor para la clase Libro.
     * @param isbn parámetro de tipo String
     * @param titulo parámetro de tipo String
     * @param fechaPublicacion parámetro de tipo String
     * @param precio parámetro de tipo double
     * @param idCategoria parámetro de tipo int
     * @param nitEditorial parámetro de tipo String
     * @param stock parámetro de tipo int
     */
    /**
     * Constructor para la clase Libro.
     * @param isbn parámetro de tipo String
     * @param titulo parámetro de tipo String
     * @param fechaPublicacion parámetro de tipo String
     * @param precio parámetro de tipo double
     * @param idCategoria parámetro de tipo int
     * @param nitEditorial parámetro de tipo String
     * @param stock parámetro de tipo int
     */
    public Libro(String isbn, String titulo, String fechaPublicacion, double precio, int idCategoria, String nitEditorial, int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.nitEditorial = nitEditorial;
        this.stock = stock;
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
    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        return titulo;
    }

    /**
     * Establece el valor de titulo.
     * @param titulo parámetro de tipo String
     */
    /**
     * Establece el valor de titulo.
     * @param titulo parámetro de tipo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el valor de fechapublicacion.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de fechapublicacion.
     * @return un valor de tipo String
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Establece el valor de fechapublicacion.
     * @param fechaPublicacion parámetro de tipo String
     */
    /**
     * Establece el valor de fechapublicacion.
     * @param fechaPublicacion parámetro de tipo String
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
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
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el valor de idcategoria.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idcategoria.
     * @return un valor de tipo int
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Establece el valor de idcategoria.
     * @param idCategoria parámetro de tipo int
     */
    /**
     * Establece el valor de idcategoria.
     * @param idCategoria parámetro de tipo int
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Obtiene el valor de niteditorial.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de niteditorial.
     * @return un valor de tipo String
     */
    public String getNitEditorial() {
        return nitEditorial;
    }

    /**
     * Establece el valor de niteditorial.
     * @param nitEditorial parámetro de tipo String
     */
    /**
     * Establece el valor de niteditorial.
     * @param nitEditorial parámetro de tipo String
     */
    public void setNitEditorial(String nitEditorial) {
        this.nitEditorial = nitEditorial;
    }

    /**
     * Obtiene el valor de stock.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de stock.
     * @return un valor de tipo int
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el valor de stock.
     * @param stock parámetro de tipo int
     */
    /**
     * Establece el valor de stock.
     * @param stock parámetro de tipo int
     */
    public void setStock(int stock) {
        this.stock = stock;
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
        return titulo;
    }
}
