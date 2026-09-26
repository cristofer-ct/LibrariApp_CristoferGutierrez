package org.cg.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import org.cg.dao.UsuarioDAO;
import org.cg.exception.DaoException;
import org.cg.model.Usuario;
import org.cg.util.Conexion;

//Data Acces Object, Objeto de acceso a los datos --> MYSQl usando Conexion
/**
 * Clase UsuarioDAOImpl
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    //inicioSesion
    @Override
    /**
     * Método iniciarSesion.
     * @param usernarme parámetro de tipo String
     * @param passwordHash parámetro de tipo String
     * @return un valor de tipo Usuario
     */
    public Usuario iniciarSesion(String usernarme, String passwordHash) {
        Usuario usuario = null;
        String sql = "{call sp_iniciar_sesion(?,?)}";

        //try-with-resources -- al final el try, los recursos se cierran auto
        //recursos: Connection, ResulSet
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {

            consulta.setString(1, usernarme);
            consulta.setString(2, passwordHash);

            try (ResultSet tablaResultado = consulta.executeQuery()) {
                //comprobar que haya algo en el resultado
                if (tablaResultado.next()) {
                    //verdadero hay algo(datos) Mapear
                    usuario = new Usuario();
                    usuario.setId(tablaResultado.getInt(1));
                    usuario.setUsername(tablaResultado.getString(2));
                    usuario.setRol(tablaResultado.getString(3));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al iniciar sesion: " + e.getMessage(), e);
        }

        return usuario;
    }

    //crearUsuario
    @Override
    /**
     * Método crearUsuario.
     * @param usuario parámetro de tipo Usuario
     * @return un valor de tipo boolean
     */
    public boolean crearUsuario(Usuario usuario) {
        String sql = "{call sp_crear_usuario(?,?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setString(1, usuario.getUsername());
            consulta.setString(2, usuario.getEmail());
            consulta.setString(3, usuario.getFirstName());
            consulta.setString(4, usuario.getLastName());
            consulta.setString(5, usuario.getPasswordHash());
            consulta.setString(6, usuario.getRol());
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al crear usuario: " + e.getMessage(), e);
        }
    }

    //actualizarUsuario
    @Override
    /**
     * Método actualizarUsuario.
     * @param usuario parámetro de tipo Usuario
     * @return un valor de tipo boolean
     */
    public boolean actualizarUsuario(Usuario usuario) {
        String sql = "{call sp_actualizar_usuario(?,?,?,?,?,?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, usuario.getId());
            consulta.setString(2, usuario.getUsername());
            consulta.setString(3, usuario.getEmail());
            consulta.setString(4, usuario.getFirstName());
            consulta.setString(5, usuario.getLastName());
            consulta.setString(6, usuario.getRol());
            consulta.setBoolean(7, usuario.isActivo());
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al actualizar usuario: " + e.getMessage(), e);
        }
    }

    //cambiarPassword
    @Override
    /**
     * Método cambiarPassword.
     * @param idUsuario parámetro de tipo int
     * @param passwordHash parámetro de tipo String
     * @return un valor de tipo boolean
     */
    public boolean cambiarPassword(int idUsuario, String passwordHash) {
        String sql = "{call sp_cambiar_password(?,?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            consulta.setString(2, passwordHash);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al cambiar password: " + e.getMessage(), e);
        }
    }

    //desactivarUsuario
    @Override
    /**
     * Método desactivarUsuario.
     * @param idUsuario parámetro de tipo int
     * @return un valor de tipo boolean
     */
    public boolean desactivarUsuario(int idUsuario) {
        String sql = "{call sp_desactivar_usuario(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al desactivar usuario: " + e.getMessage(), e);
        }
    }

    //eliminarUsuario
    @Override
    /**
     * Método eliminarUsuario.
     * @param idUsuario parámetro de tipo int
     * @return un valor de tipo boolean
     */
    public boolean eliminarUsuario(int idUsuario) {
        String sql = "{call sp_eliminar_usuario(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            int filasAfectadas = consulta.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            throw new DaoException("Error al eliminar usuario: " + e.getMessage(), e);
        }
    }

    //listarTodosUsuarios
    @Override
    /**
     * Método listarTodosUsuarios.
     * @return un valor de tipo ArrayList<Usuario>
     */
    public ArrayList<Usuario> listarTodosUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "{call sp_listar_todos_usuarios()}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql);
                ResultSet tablaResultado = consulta.executeQuery()) {
            while (tablaResultado.next()) {
                Usuario u = new Usuario();
                u.setId(tablaResultado.getInt("id_usuario"));
                u.setUsername(tablaResultado.getString("username"));
                u.setEmail(tablaResultado.getString("email"));
                u.setFirstName(tablaResultado.getString("first_name"));
                u.setLastName(tablaResultado.getString("last_name"));
                u.setRol(tablaResultado.getString("rol"));
                u.setActivo(tablaResultado.getBoolean("activo"));
                u.setFechaCreacion(tablaResultado.getTimestamp("fecha_creacion"));
                lista.add(u);
            }
        } catch (SQLException e) {
            throw new DaoException("Error al listar todos los usuarios: " + e.getMessage(), e);
        }
        return lista;
    }

    //obtenerUsuarioPorId
    @Override
    /**
     * Método obtenerUsuarioPorId.
     * @param idUsuario parámetro de tipo int
     * @return un valor de tipo Usuario
     */
    public Usuario obtenerUsuarioPorId(int idUsuario) {
        Usuario usuario = null;
        String sql = "{call sp_obtener_usuario_por_id(?)}";
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consulta = conexion.prepareCall(sql)) {
            consulta.setInt(1, idUsuario);
            try (ResultSet tablaResultado = consulta.executeQuery()) {
                if (tablaResultado.next()) {
                    usuario = new Usuario();
                    usuario.setId(tablaResultado.getInt("id_usuario"));
                    usuario.setUsername(tablaResultado.getString("username"));
                    usuario.setEmail(tablaResultado.getString("email"));
                    usuario.setFirstName(tablaResultado.getString("first_name"));
                    usuario.setLastName(tablaResultado.getString("last_name"));
                    usuario.setRol(tablaResultado.getString("rol"));
                    usuario.setActivo(tablaResultado.getBoolean("activo"));
                    usuario.setFechaCreacion(tablaResultado.getTimestamp("fecha_creacion"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("Error al obtener usuario por id: " + e.getMessage(), e);
        }
        return usuario;
    }

}
