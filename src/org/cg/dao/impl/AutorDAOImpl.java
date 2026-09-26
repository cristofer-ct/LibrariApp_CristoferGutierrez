package org.cg.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.cg.dao.AutorDAO;
import org.cg.exception.DaoException;
import org.cg.model.Autor;
import org.cg.util.Conexion;

/**
 * Clase AutorDAOImpl
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class AutorDAOImpl del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class AutorDAOImpl implements AutorDAO {

    @Override
    /**
     * Método listarTodos.
     * @return un valor de tipo ArrayList<Autor>
     */
    /**
     * Ejecuta la operacion listarTodos.
     * @return valor de tipo ArrayList<Autor>
     */
    public ArrayList<Autor> listarTodos() {
        ArrayList<Autor> lista = new ArrayList<>();
        String sql = "{call sp_listarautores()}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql);
                ResultSet rs = consulta.executeQuery()) {
            while (rs.next()) {
                Autor a = new Autor();
                a.setIdAutor(rs.getInt("id_autor"));
                a.setNombreAutor(rs.getString("nombre_autor"));
                a.setApellidoAutor(rs.getString("apellido_autor"));
                a.setNacionalidad(rs.getString("nacionalidad"));
                a.setBiografia(rs.getString("biografia"));
                lista.add(a);
            }
        } catch (SQLException e) {
            throw new DaoException("Error al listar autores: " + e.getMessage(), e);
        }
        return lista;
    }

    @Override
    /**
     * Método buscarPorId.
     * @param idAutor parámetro de tipo Integer
     * @return un valor de tipo Autor
     */
    /**
     * Ejecuta la operacion buscarPorId.
     * @param idAutor valor de tipo Integer
     * @return valor de tipo Autor
     */
    public Autor buscarPorId(Integer idAutor) {
        Autor a = null;
        String sql = "{call sp_buscarautor(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idAutor);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    a = new Autor();
                    a.setIdAutor(rs.getInt("id_autor"));
                    a.setNombreAutor(rs.getString("nombre_autor"));
                    a.setApellidoAutor(rs.getString("apellido_autor"));
                    a.setNacionalidad(rs.getString("nacionalidad"));
                    a.setBiografia(rs.getString("biografia"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al buscar autor: " + e.getMessage(), e);
        }
        return a;
    }

    @Override
    /**
     * Método crear.
     * @param autor parámetro de tipo Autor
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion crear.
     * @param autor valor de tipo Autor
     * @return valor de tipo boolean
     */
    public boolean crear(Autor autor) {
        String sql = "{call sp_insertarautor(?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setString(1, autor.getNombreAutor());
            consulta.setString(2, autor.getApellidoAutor());
            consulta.setString(3, autor.getNacionalidad());
            consulta.setString(4, autor.getBiografia());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al insertar autor: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método actualizar.
     * @param autor parámetro de tipo Autor
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion actualizar.
     * @param autor valor de tipo Autor
     * @return valor de tipo boolean
     */
    public boolean actualizar(Autor autor) {
        String sql = "{call sp_actualizarautor(?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, autor.getIdAutor());
            consulta.setString(2, autor.getNombreAutor());
            consulta.setString(3, autor.getApellidoAutor());
            consulta.setString(4, autor.getNacionalidad());
            consulta.setString(5, autor.getBiografia());
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar autor: " + e.getMessage(), e);
        }
    }

    @Override
    /**
     * Método eliminar.
     * @param idAutor parámetro de tipo Integer
     * @return un valor de tipo boolean
     */
    /**
     * Ejecuta la operacion eliminar.
     * @param idAutor valor de tipo Integer
     * @return valor de tipo boolean
     */
    public boolean eliminar(Integer idAutor) {
        String sql = "{call sp_eliminarautor(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idAutor);
            return consulta.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar autor: " + e.getMessage(), e);
        }
    }
}
