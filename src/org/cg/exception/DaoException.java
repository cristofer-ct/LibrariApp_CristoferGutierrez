package org.cg.exception;

/**
 * Excepción de la capa de acceso a datos.
 *
 * Se lanza cuando una operación contra la base de datos (vía procedimiento
 * almacenado) falla por un error real: conexión caída, SQL inválido, etc.
 *
 * A diferencia del enfoque anterior —devolver false/null y solo imprimir en
 * consola—, propagar DaoException permite que el controlador muestre al
 * usuario un mensaje de error claro en lugar de fallar en silencio.
 */
/**
 * Clase DaoException
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class DaoException del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class DaoException extends RuntimeException {

    /**
     * Constructor para la clase DaoException.
     * @param mensaje parámetro de tipo String
     */
    /**
     * Constructor de DaoException.
     * @param mensaje valor de tipo String
     */
    public DaoException(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor para la clase DaoException.
     * @param mensaje parámetro de tipo String
     * @param causa parámetro de tipo Throwable
     */
    /**
     * Constructor de DaoException.
     * @param mensaje valor de tipo String
     * @param causa valor de tipo Throwable
     */
    public DaoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
