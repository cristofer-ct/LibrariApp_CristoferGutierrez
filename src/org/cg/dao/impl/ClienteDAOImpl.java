package org.cg.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.cg.dao.ClienteDAO;
import org.cg.exception.DaoException;
import org.cg.model.Cliente;
import org.cg.util.Conexion;

/**
 * Clase ClienteDAOImpl
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class ClienteDAOImpl implements ClienteDAO {

    @Override
    /**
     * Método listarTodos.
     * @return un valor de tipo ArrayList<Cliente>
     */
    public ArrayList<Cliente> listarTodos() {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "{call sp_listarclientes()}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql); ResultSet rs = consulta.executeQuery()) {
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCui(rs.getLong("cui"));
                c.setNombreCliente(rs.getString("nombre_cliente"));
                c.setApellidoCliente(rs.getString("apellido_cliente"));
                c.setCorreoElectronico(rs.getString("correo_electronico"));
                lista.add(c);
            }
        } catch (SQLException e) {
            throw new DaoException("Error al listar clientes: " + e.getMessage(), e);
        }
        return lista;
    }

    @Override
    /**
     * Método buscarPorId.
     * @param cui parámetro de tipo Long
     * @return un valor de tipo Cliente
     */
    public Cliente buscarPorId(Long cui) {
        Cliente c = null;
        String sql = "{call sp_buscarcliente(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cui);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    c = new Cliente();
                    c.setCui(rs.getLong("cui"));
                    c.setNombreCliente(rs.getString("nombre_cliente"));
                    c.setApellidoCliente(rs.getString("apellido_cliente"));
                    c.setCorreoElectronico(rs.getString("correo_electronico"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al buscar cliente: " + e.getMessage(), e);
        }
        return c;
    }

    @Override
    /**
     * Método crear.
     * @param cliente parámetro de tipo Cliente
     * @return un valor de tipo boolean
     */
    public boolean crear(Cliente cliente) {
        String sql = "{call sp_insertarcliente(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cliente.getCui());
            consulta.setString(2, cliente.getNombreCliente());
            consulta.setString(3, cliente.getApellidoCliente());
            consulta.setString(4, cliente.getCorreoElectronico());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al insertar cliente: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método actualizar.
     * @param cliente parámetro de tipo Cliente
     * @return un valor de tipo boolean
     */
    public boolean actualizar(Cliente cliente) {
        String sql = "{call sp_actualizarcliente(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cliente.getCui());
            consulta.setString(2, cliente.getNombreCliente());
            consulta.setString(3, cliente.getApellidoCliente());
            consulta.setString(4, cliente.getCorreoElectronico());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar cliente: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método eliminar.
     * @param cui parámetro de tipo Long
     * @return un valor de tipo boolean
     */
    public boolean eliminar(Long cui) {
        String sql = "{call sp_eliminarcliente(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar(); CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setLong(1, cui);
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar cliente: " + e.getMessage(), e);
        }
    }
}
