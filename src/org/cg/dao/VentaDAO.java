package org.cg.dao;

import java.util.List;
import org.cg.model.LineaVenta;
import org.cg.model.Venta;

/**
 * Clase VentaDAO
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Interface VentaDAO del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public interface VentaDAO extends Crud<Venta, Integer>{
    //crearVenta inserta el encabezado de la venta, sus líneas y descuenta el stock.
    //Devuelve el no_venta generado (o -1 si falla).
    int crearVenta(Venta venta, List<LineaVenta> lineas);
}
