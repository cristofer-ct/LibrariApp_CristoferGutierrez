package org.cg.model;

/**
 * Representa una categoría dentro del sistema.
 * Contiene la información básica que define a una categoría, 
 * como su identificador único y su nombre.
 *
 * @author aruba
 * @version 1.0
 */
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;

    /**
     * Constructor por defecto para la clase Categoria.
     * Crea una instancia vacía sin inicializar sus atributos.
     */
    /**
     * Constructor para la clase Categoria.
     */
    /**
     * Constructor para la clase Categoria.
     */
    public Categoria() {
    }

    /**
     * Constructor que inicializa una nueva categoría con los valores proporcionados.
     *
     * @param idCategoria El identificador único de la categoría.
     * @param nombreCategoria El nombre descriptivo de la categoría.
     */
    /**
     * Constructor para la clase Categoria.
     * @param idCategoria parámetro de tipo int
     * @param nombreCategoria parámetro de tipo String
     */
    /**
     * Constructor para la clase Categoria.
     * @param idCategoria parámetro de tipo int
     * @param nombreCategoria parámetro de tipo String
     */
    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * Obtiene el identificador único de la categoría.
     *
     * @return Un número entero que representa el ID de la categoría.
     */
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
     * Establece o modifica el identificador único de la categoría.
     *
     * @param idCategoria El nuevo identificador a asignar a la categoría.
     */
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
     * Obtiene el nombre descriptivo de la categoría.
     *
     * @return Una cadena de texto con el nombre de la categoría.
     */
    /**
     * Obtiene el valor de nombrecategoria.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombrecategoria.
     * @return un valor de tipo String
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Establece o modifica el nombre descriptivo de la categoría.
     *
     * @param nombreCategoria El nuevo nombre a asignar a la categoría.
     */
    /**
     * Establece el valor de nombrecategoria.
     * @param nombreCategoria parámetro de tipo String
     */
    /**
     * Establece el valor de nombrecategoria.
     * @param nombreCategoria parámetro de tipo String
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * Devuelve una representación en texto del objeto Categoria.
     * En este caso, retorna únicamente el nombre de la categoría, lo cual es
     * útil para mostrar el objeto directamente en componentes de interfaz gráfica (UI).
     *
     * @return El nombre de la categoría.
     */
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
        return nombreCategoria;
    }
}