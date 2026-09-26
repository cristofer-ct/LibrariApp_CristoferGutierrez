/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cg.dao;

import java.util.ArrayList;
import org.cg.model.Usuario;

/**
 *
 * @author aruba
 */
/**
 * Interface UsuarioDAO del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public interface UsuarioDAO {
    public Usuario iniciarSesion(String usernarme, String passwordHash);
    public boolean crearUsuario(Usuario usuario);
    public boolean actualizarUsuario(Usuario usuario);
    public boolean cambiarPassword(int idUsuario, String passwordHash);
    public boolean desactivarUsuario(int idUsuario);
    public boolean eliminarUsuario(int idUsuario);
    public ArrayList<Usuario> listarTodosUsuarios();
    public Usuario obtenerUsuarioPorId(int idUsuario);
}
