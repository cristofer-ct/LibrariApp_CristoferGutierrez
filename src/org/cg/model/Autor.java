package org.cg.model;

/**
 * Clase Autor
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Autor {
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String nacionalidad;
    private String biografia;

    /**
     * Constructor para la clase Autor.
     */
    /**
     * Constructor para la clase Autor.
     */
    public Autor() {
    }

    /**
     * Constructor para la clase Autor.
     * @param idAutor parámetro de tipo int
     * @param nombreAutor parámetro de tipo String
     * @param apellidoAutor parámetro de tipo String
     * @param nacionalidad parámetro de tipo String
     * @param biografia parámetro de tipo String
     */
    /**
     * Constructor para la clase Autor.
     * @param idAutor parámetro de tipo int
     * @param nombreAutor parámetro de tipo String
     * @param apellidoAutor parámetro de tipo String
     * @param nacionalidad parámetro de tipo String
     * @param biografia parámetro de tipo String
     */
    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidad, String biografia) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    /**
     * Obtiene el valor de idautor.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idautor.
     * @return un valor de tipo int
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
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     * Obtiene el valor de nombreautor.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombreautor.
     * @return un valor de tipo String
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Establece el valor de nombreautor.
     * @param nombreAutor parámetro de tipo String
     */
    /**
     * Establece el valor de nombreautor.
     * @param nombreAutor parámetro de tipo String
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Obtiene el valor de apellidoautor.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de apellidoautor.
     * @return un valor de tipo String
     */
    public String getApellidoAutor() {
        return apellidoAutor;
    }

    /**
     * Establece el valor de apellidoautor.
     * @param apellidoAutor parámetro de tipo String
     */
    /**
     * Establece el valor de apellidoautor.
     * @param apellidoAutor parámetro de tipo String
     */
    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    /**
     * Obtiene el valor de nacionalidad.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nacionalidad.
     * @return un valor de tipo String
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece el valor de nacionalidad.
     * @param nacionalidad parámetro de tipo String
     */
    /**
     * Establece el valor de nacionalidad.
     * @param nacionalidad parámetro de tipo String
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene el valor de biografia.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de biografia.
     * @return un valor de tipo String
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Establece el valor de biografia.
     * @param biografia parámetro de tipo String
     */
    /**
     * Establece el valor de biografia.
     * @param biografia parámetro de tipo String
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
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
        return nombreAutor + " " + apellidoAutor;
    }
}
