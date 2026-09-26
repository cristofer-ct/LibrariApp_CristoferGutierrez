package org.cg.manager;

import org.cg.model.Usuario;

/**
 * Clase SesionContext
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class SesionContext del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class SesionContext {

    private static SesionContext instancia;
    private Usuario usuarioActual;

    private SesionContext() {
    }

    public static synchronized SesionContext getInstancia() {
        if (instancia == null) {
            instancia = new SesionContext();
        }
        return instancia;
    }

    /**
     * Obtiene el valor de usuarioactual.
     * @return un valor de tipo Usuario
     */
    /**
     * Obtiene el valor de usuarioactual.
     * @return valor de tipo Usuario
     */
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * Establece el valor de usuarioactual.
     * @param usuario parámetro de tipo Usuario
     */
    /**
     * Establece el valor de usuarioactual.
     * @param usuario valor de tipo Usuario
     */
    public void setUsuarioActual(Usuario usuario) {
        this.usuarioActual = usuario;
    }

    /**
     * Método cerrarSesion.
     */
    public void cerrarSesion() {
        this.usuarioActual = null;
    }
}
