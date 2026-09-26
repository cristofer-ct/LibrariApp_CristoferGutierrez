package org.cg.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.cg.dao.DetalleVentaDAO;
import org.cg.exception.DaoException;
import org.cg.model.DetalleVenta;
import org.cg.util.Conexion;

/**
 * Clase DetalleVentaDAOImpl
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class DetalleVentaDAOImpl del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class DetalleVentaDAOImpl implements DetalleVentaDAO {

    @Override
    /**
     * Método listarTodos.
     * @return un valor de tipo ArrayList<DetalleVenta>
     */
    /**
     * Ejecuta la operacion listarTodos.
     * @return valor de tipo ArrayList<DetalleVenta>
     */
    public ArrayList<DetalleVenta> listarTodos() {
        ArrayList<DetalleVenta> lista = new ArrayList<>();
        String sql = "{call sp_listar_detalle_venta()}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql);
                ResultSet rs = consulta.executeQuery()) {
            while (rs.next()) {
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalleVenta(rs.getInt("id_detalle_venta"));
                dv.setNoVenta(rs.getInt("no_venta"));
                dv.setIsbn(rs.getString("isbn"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecio(rs.getDouble("precio"));
                lista.add(dv);
            }
        } catch (SQLException e) {
            throw new DaoException("Error al listar detalle_venta: " + e.getMessage(), e);
        }
        return lista;
    }

    @Override
    /**
     * Método buscarPorId.
     * @param idDetalleVenta parámetro de tipo Integer
     * @return un valor de tipo DetalleVenta
     */
    /**
     * Ejecuta la operacion buscarPorId.
     * @param idDetalleVenta valor de tipo Integer
     * @return valor de tipo DetalleVenta
     */
    public DetalleVenta buscarPorId(Integer idDetalleVenta) {
        DetalleVenta dv = null;
        String sql = "{call sp_buscar_detalle_venta(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idDetalleVenta);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    dv = new DetalleVenta();
                    dv.setIdDetalleVenta(rs.getInt("id_detalle_venta"));
                    dv.setNoVenta(rs.getInt("no_venta"));
                    dv.setIsbn(rs.getString("isbn"));
                    dv.setCantidad(rs.getInt("cantidad"));
                    dv.setPrecio(rs.getDouble("precio"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al buscar detalle_venta: " + e.getMessage(), e);
        }
        return dv;
    }

    @Override
    /**
     * Método crear.
     * @param detalleVenta parámetro de tipo DetalleVenta
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion crear.
     * @param detalleVenta valor de tipo DetalleVenta
     * @return valor de tipo boolean
     */
    public boolean crear(DetalleVenta detalleVenta) {
        String sql = "{call sp_insertar_detalle_venta(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, detalleVenta.getNoVenta());
            consulta.setString(2, detalleVenta.getIsbn());
            consulta.setInt(3, detalleVenta.getCantidad());
            consulta.setDouble(4, detalleVenta.getPrecio());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al insertar detalle_venta: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método actualizar.
     * @param detalleVenta parámetro de tipo DetalleVenta
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion actualizar.
     * @param detalleVenta valor de tipo DetalleVenta
     * @return valor de tipo boolean
     */
    public boolean actualizar(DetalleVenta detalleVenta) {
        String sql = "{call sp_actualizar_detalle_venta(?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, detalleVenta.getIdDetalleVenta());
            consulta.setInt(2, detalleVenta.getNoVenta());
            consulta.setString(3, detalleVenta.getIsbn());
            consulta.setInt(4, detalleVenta.getCantidad());
            consulta.setDouble(5, detalleVenta.getPrecio());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar detalle_venta: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método eliminar.
     * @param idDetalleVenta parámetro de tipo Integer
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion eliminar.
     * @param idDetalleVenta valor de tipo Integer
     * @return valor de tipo boolean
     */
    public boolean eliminar(Integer idDetalleVenta) {
        String sql = "{call sp_eliminar_detalle_venta(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idDetalleVenta);
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar detalle_venta: " + e.getMessage(), e);
        }
    }
}
