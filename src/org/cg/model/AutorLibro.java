package org.cg.model;

/**
 * Clase AutorLibro
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class AutorLibro del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;

    /**
     * Constructor para la clase AutorLibro.
     */
    /**
     * Constructor para la clase AutorLibro.
     */
    public AutorLibro() {
    }

    /**
     * Constructor para la clase AutorLibro.
     * @param idAutorLibro parámetro de tipo int
     * @param idAutor parámetro de tipo int
     * @param isbn parámetro de tipo String
     */
    /**
     * Constructor para la clase AutorLibro.
     * @param idAutorLibro parámetro de tipo int
     * @param idAutor parámetro de tipo int
     * @param isbn parámetro de tipo String
     */
    /**
     * Constructor de AutorLibro.
     * @param idAutorLibro valor de tipo int
     * @param idAutor valor de tipo int
     * @param isbn valor de tipo String
     */
    public AutorLibro(int idAutorLibro, int idAutor, String isbn) {
        this.idAutorLibro = idAutorLibro;
        this.idAutor = idAutor;
        this.isbn = isbn;
    }

    /**
     * Obtiene el valor de idautorlibro.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idautorlibro.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idautorlibro.
     * @return valor de tipo int
     */
    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    /**
     * Establece el valor de idautorlibro.
     * @param idAutorLibro parámetro de tipo int
     */
    /**
     * Establece el valor de idautorlibro.
     * @param idAutorLibro parámetro de tipo int
     */
    /**
     * Establece el valor de idautorlibro.
     * @param idAutorLibro valor de tipo int
     */
    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    /**
     * Obtiene el valor de idautor.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idautor.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idautor.
     * @return valor de tipo int
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Establece el valor de idautor.
     * @param idAutor parámetro de tipo int
     */
    /**
     * Establece el valor de idautor.
     * @param idAutor parámetro de tipo int
     */
    /**
     * Establece el valor de idautor.
     * @param idAutor valor de tipo int
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
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
}
