package org.cg.dao;

import java.util.ArrayList;
import org.cg.model.LineaFactura;

/**
 * Clase FacturaDAO
 *
 * @author Cristofer
 * @version 1.0.0
 */
public interface FacturaDAO {
    ArrayList<LineaFactura> buscarFactura(int noVenta);
}
