package org.cg.dao;

import java.util.ArrayList;

/**
 * Clase Crud
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Interface Crud del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public interface Crud<T, K> {
    boolean crear(T entidad);
    boolean actualizar(T entidad);
    boolean eliminar(K id);
    T buscarPorId(K id);
    ArrayList<T> listarTodos();
}
