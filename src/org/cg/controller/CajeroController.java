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
 * Clase CajeroController
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class CajeroController del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class CajeroController implements Initializable {

    @FXML private Label lblBienvenida;
    @FXML private Label lblRol;
    @FXML private Button btnCerrarSesion;
    @FXML private Circle avatarCircle;

    @FXML private Button btnVenta;
    @FXML private Button btnDetalleVenta;
    @FXML private Button btnListaVentas;
    @FXML private Button btnInventario;

    @FXML private VBox cardAgregarVenta;
    @FXML private VBox cardDetalleVenta;
    @FXML private VBox cardListaVentas;
    @FXML private VBox cardVerInventario;

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
     * Método irAVenta.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAVenta.
     * @param evento valor de tipo ActionEvent
     */
    public void irAVenta(ActionEvent evento) {
        navegar("/org/ac/view/fxml/VentaView.fxml");
    }

    @FXML
    /**
     * Método irADetalleVenta.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irADetalleVenta.
     * @param evento valor de tipo ActionEvent
     */
    public void irADetalleVenta(ActionEvent evento) {
        navegar("/org/ac/view/fxml/DetalleVentaView.fxml");
    }

    @FXML
    /**
     * Método irAListaVentas.
     * @param evento parámetro de tipo ActionEvent
     */
    /**
     * Ejecuta la operacion irAListaVentas.
     * @param evento valor de tipo ActionEvent
     */
    public void irAListaVentas(ActionEvent evento) {
        navegar("/org/ac/view/fxml/ListaVentasView.fxml");
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
     * Método agregarVenta.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion agregarVenta.
     * @param evento valor de tipo MouseEvent
     */
    public void agregarVenta(MouseEvent evento) {
        navegar("/org/ac/view/fxml/VentaView.fxml");
    }

    @FXML
    /**
     * Método detalleVenta.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion detalleVenta.
     * @param evento valor de tipo MouseEvent
     */
    public void detalleVenta(MouseEvent evento) {
        navegar("/org/ac/view/fxml/DetalleVentaView.fxml");
    }

    @FXML
    /**
     * Método listaVentas.
     * @param evento parámetro de tipo MouseEvent
     */
    /**
     * Ejecuta la operacion listaVentas.
     * @param evento valor de tipo MouseEvent
     */
    public void listaVentas(MouseEvent evento) {
        navegar("/org/ac/view/fxml/ListaVentasView.fxml");
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
