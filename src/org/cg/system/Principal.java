package org.cg.system;

import java.io.IOException;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Logger;
import org.cg.manager.SesionContext;
import org.cg.model.Usuario;

/**
 * Clase Principal
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class Principal del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class Principal extends Application {

    private static Stage escenarioPrincipal;
    private static final Logger log = Logger.getLogger(Principal.class.getName());

    /**
     * Método cambiarEscena.
     * @param rutaFXML parámetro de tipo String
     * @throws IOException en caso de error
     */
    /**
     * Método cambiarEscena.
     * @param rutaFXML parámetro de tipo String
     * @throws IOException en caso de error
     */
    /**
     * Ejecuta la operacion cambiarEscena.
     * @param rutaFXML valor de tipo String
     * @throws IOException si ocurre un error
     */
    public static void cambiarEscena(String rutaFXML) throws IOException {
        log.log(Level.INFO, "Se cambio de escena a: {0}", rutaFXML);
        Parent raiz = FXMLLoader.load(
                Principal.class.getResource(rutaFXML));
        Scene escena = new Scene(raiz);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        escenarioPrincipal.centerOnScreen();
        escenarioPrincipal.show();
    }

    /**
     * Devuelve la ruta del dashboard correspondiente al rol del usuario con
     * sesion activa. Si no hay sesion o el rol es desconocido, devuelve la
     * ruta del login.
     */
    /**
     * Método rutaDashboardSegunRol.
     * @return un valor de tipo String
     */
    /**
     * Método rutaDashboardSegunRol.
     * @return un valor de tipo String
     */
    /**
     * Ejecuta la operacion rutaDashboardSegunRol.
     * @return valor de tipo String
     */
    public static String rutaDashboardSegunRol() {
        Usuario usuario = SesionContext.getInstancia().getUsuarioActual();
        if (usuario == null || usuario.getRol() == null) {
            return "/org/ac/view/fxml/InicioSesionView.fxml";
        }
        switch (usuario.getRol().toLowerCase()) {
            case "admin":
                return "/org/ac/view/fxml/AdminDashboradView.fxml";
            case "empleado":
                return "/org/ac/view/fxml/EmpleadoView.fxml";
            case "cajero":
                return "/org/ac/view/fxml/CajeroView.fxml";
            default:
                return "/org/ac/view/fxml/InicioSesionView.fxml";
        }
    }

    /**
     * Método main.
     * @param args parámetro de tipo String[]
     */
    /**
     * Método main.
     * @param args parámetro de tipo String[]
     */
    /**
     * Ejecuta la operacion main.
     * @param args valor de tipo String[]
     */
    public static void main(String[] args) {
        log.info("Se inicio el programa");
        launch(args);

    }

    @Override
    /**
     * Método start.
     * @param escenarioPrincipal parámetro de tipo Stage
     * @throws Exception en caso de error
     */
    /**
     * Método start.
     * @param escenarioPrincipal parámetro de tipo Stage
     * @throws Exception en caso de error
     */
    /**
     * Ejecuta la operacion start.
     * @param escenarioPrincipal valor de tipo Stage
     * @throws Exception si ocurre un error
     */
    public void start(Stage escenarioPrincipal) throws Exception {
        Principal.escenarioPrincipal = escenarioPrincipal;
        cambiarEscena("/org/ac/view/fxml/InicioSesionView.fxml");
    }
}
