package org.cg.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import org.cg.model.Usuario;
import org.cg.system.Principal;
import org.cg.manager.SesionContext;

/**
 * Clase EmpleadoController
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class EmpleadoController del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class EmpleadoController implements Initializable {

    @FXML private Label lblBienvenida;
    @FXML private Label lblRol;
    @FXML private Button btnCerrarSesion;
    @FXML private Circle avatarCircle;

    @FXML private Button btnInventario;
    @FXML private Button btnLibro;
    @FXML private Button btnAutor;
    @FXML private Button btnCategoria;
    @FXML private Button btnEditorial;
    @FXML private Button btnClientes;

    @FXML private VBox cardVerInventario;
    @FXML private VBox cardNuevoLibro;
    @FXML private VBox cardNuevoAutor;
    @FXML private VBox cardNuevaCategoria;
    @FXML private VBox cardNuevaEditorial;
    @FXML private VBox cardNuevoCliente;

    private Usuario usuarioActual;

    @Override
    /**
     * Método initialize.
     * @param url parámetro de tipo URL
     * @param rb parámetro de tipo ResourceBundle
     */
    /**
     * Ejecuta la operacion initialize.
     * @param url valor de tipo URL
     * @param rb valor de tipo ResourceBundle
     */
    public void initialize(URL url, ResourceBundle rb) {
        usuarioActual = SesionContext.getInstancia().getUsuarioActual();
        if (usuarioActual != null) {
            lblBienvenida.setText(usuarioActual.getUsername());
            String iniciales = usuarioActual.getUsername()
                    .substring(0, Math.min(2, usuarioActual.getUsername().length()))
                    .toUpperCase();
            lblRol.setText(iniciales + " · " + capitalize(usuarioActual.getRol()));
        } else {
            lblBienvenida.setText("Invitado");
            lblRol.setText("?? · Sin sesión");
        }
    }

    private String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    @FXML
    /**
     * Método cerrarSesion.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion cerrarSesion.
     * @param evento valor de tipo ActionEvent
     */
    public void cerrarSesion(ActionEvent evento) {
        SesionContext.getInstancia().cerrarSesion();
        navegar("/org/ac/view/fxml/InicioSesionView.fxml");
    }

    @FXML
    /**
     * Método irAInventario.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAInventario.
     * @param evento valor de tipo ActionEvent
     */
    public void irAInventario(ActionEvent evento) {
        navegar("/org/ac/view/fxml/InventarioView.fxml");
    }

    @FXML
    /**
     * Método irALibro.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irALibro.
     * @param evento valor de tipo ActionEvent
     */
    public void irALibro(ActionEvent evento) {
        navegar("/org/ac/view/fxml/LibroView.fxml");
    }

    @FXML
    /**
     * Método irAAutor.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAAutor.
     * @param evento valor de tipo ActionEvent
     */
    public void irAAutor(ActionEvent evento) {
        navegar("/org/ac/view/fxml/AutorView.fxml");
    }

    @FXML
    /**
     * Método irACategoria.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irACategoria.
     * @param evento valor de tipo ActionEvent
     */
    public void irACategoria(ActionEvent evento) {
        navegar("/org/ac/view/fxml/CategoriaView.fxml");
    }

    @FXML
    /**
     * Método irAEditorial.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAEditorial.
     * @param evento valor de tipo ActionEvent
     */
    public void irAEditorial(ActionEvent evento) {
        navegar("/org/ac/view/fxml/EditorialView.fxml");
    }

    @FXML
    /**
     * Método irAClientes.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAClientes.
     * @param evento valor de tipo ActionEvent
     */
    public void irAClientes(ActionEvent evento) {
        navegar("/org/ac/view/fxml/ClienteView.fxml");
    }

    @FXML
    /**
     * Método verInventario.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion verInventario.
     * @param evento valor de tipo MouseEvent
     */
    public void verInventario(MouseEvent evento) {
        navegar("/org/ac/view/fxml/InventarioView.fxml");
    }

    @FXML
    /**
     * Método nuevoLibro.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion nuevoLibro.
     * @param evento valor de tipo MouseEvent
     */
    public void nuevoLibro(MouseEvent evento) {
        navegar("/org/ac/view/fxml/LibroView.fxml");
    }

    @FXML
    /**
     * Método nuevoAutor.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion nuevoAutor.
     * @param evento valor de tipo MouseEvent
     */
    public void nuevoAutor(MouseEvent evento) {
        navegar("/org/ac/view/fxml/AutorView.fxml");
    }

    @FXML
    /**
     * Método nuevaCategoria.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion nuevaCategoria.
     * @param evento valor de tipo MouseEvent
     */
    public void nuevaCategoria(MouseEvent evento) {
        navegar("/org/ac/view/fxml/CategoriaView.fxml");
    }

    @FXML
    /**
     * Método nuevaEditorial.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion nuevaEditorial.
     * @param evento valor de tipo MouseEvent
     */
    public void nuevaEditorial(MouseEvent evento) {
        navegar("/org/ac/view/fxml/EditorialView.fxml");
    }

    @FXML
    /**
     * Método nuevoCliente.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion nuevoCliente.
     * @param evento valor de tipo MouseEvent
     */
    public void nuevoCliente(MouseEvent evento) {
        navegar("/org/ac/view/fxml/ClienteView.fxml");
    }

    private void navegar(String ruta) {
        try {
            Principal.cambiarEscena(ruta);
        } catch (IOException | NullPointerException e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION,
                    "Esta sección estará disponible próximamente.", ButtonType.OK);
            alerta.setTitle("En construcción");
            alerta.setHeaderText(null);
            alerta.showAndWait();
        }
    }
}
