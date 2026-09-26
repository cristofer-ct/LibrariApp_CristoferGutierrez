package org.cg.manager;

import org.cg.model.Usuario;

/**
 * Clase SesionContext
 *
 * @author Cristofer
 * @version 1.0.0
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
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * Establece el valor de usuarioactual.
     * @param usuario parámetro de tipo Usuario
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
