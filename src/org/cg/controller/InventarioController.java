package org.cg.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.cg.dao.LibroDAO;
import org.cg.dao.impl.LibroDAOImpl;
import org.cg.exception.DaoException;
import org.cg.model.Libro;
import org.cg.system.Principal;

/**
 * Clase InventarioController
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class InventarioController del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class InventarioController implements Initializable {

    @FXML
    private TableView<Libro> tablaInventario;
    @FXML
    private TableColumn colIsbn;
    @FXML
    private TableColumn colTitulo;
    @FXML
    private TableColumn colPrecio;
    @FXML
    private TableColumn colStock;
    @FXML
    private TextField txtBuscar;

    private final LibroDAO libroDAO = new LibroDAOImpl();
    private final ObservableList<Libro> listaLibros = FXCollections.observableArrayList();
    private final FilteredList<Libro> librosFiltrados = new FilteredList<>(listaLibros, p -> true);

    @Override
    /**
     * Método initialize.
     * @param location parámetro de tipo URL
     * @param resources parámetro de tipo ResourceBundle
     */
    /**
     * Ejecuta la operacion initialize.
     * @param location valor de tipo URL
     * @param resources valor de tipo ResourceBundle
     */
    public void initialize(URL location, ResourceBundle resources) {
        cargarTabla();
        tablaInventario.setItems(librosFiltrados);
        configurarTabla();
        configurarBusqueda();
    }

    /**
     * Método configurarTabla.
     */
    public void configurarTabla() {
        colIsbn.setCellValueFactory(new PropertyValueFactory<Libro, String>("isbn"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<Libro, String>("titulo"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<Libro, Double>("precio"));
        colStock.setCellValueFactory(new PropertyValueFactory<Libro, Integer>("stock"));
    }

    private void cargarTabla() {
        try {
            listaLibros.setAll(libroDAO.listarTodos());
        } catch (DaoException e) {
            mostrarError(e.getMessage());
        }
    }

    private void configurarBusqueda() {
        txtBuscar.textProperty().addListener((obs, oldValue, newValue) -> filtrarLibros());
    }

    private void filtrarLibros() {
        String busqueda = txtBuscar.getText().trim().toLowerCase();
        if (busqueda.isEmpty()) {
            librosFiltrados.setPredicate(p -> true);
        } else {
            librosFiltrados.setPredicate(libro ->
                    libro.getIsbn().toLowerCase().contains(busqueda)
                    || libro.getTitulo().toLowerCase().contains(busqueda)
                    || String.valueOf(libro.getPrecio()).contains(busqueda)
                    || String.valueOf(libro.getStock()).contains(busqueda));
        }
    }

    @FXML
    private void handleVolver() {
        try {
            Principal.cambiarEscena(Principal.rutaDashboardSegunRol());
        } catch (Exception e) {
            mostrarError("Error al volver al menú: " + e.getMessage());
        }
    }

    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
