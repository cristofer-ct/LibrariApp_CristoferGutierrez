package org.cg.dao;

import java.util.ArrayList;

/**
 * Clase Crud
 *
 * @author Cristofer
 * @version 1.0.0
 */
public interface Crud<T, K> {
    boolean crear(T entidad);
    boolean actualizar(T entidad);
    boolean eliminar(K id);
    T buscarPorId(K id);
    ArrayList<T> listarTodos();
}
