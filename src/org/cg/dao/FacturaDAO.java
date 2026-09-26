package org.cg.dao;

import java.util.ArrayList;
import org.cg.model.LineaFactura;

/**
 * Clase FacturaDAO
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Interface FacturaDAO del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public interface FacturaDAO {
    ArrayList<LineaFactura> buscarFactura(int noVenta);
}
