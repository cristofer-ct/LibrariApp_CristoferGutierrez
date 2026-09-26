package org.cg.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Clase Conexion
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class Conexion del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class Conexion {
    private static Conexion instancia;

    private static final String CONFIG_FILE = "/db.properties";

    private final String url;
    private final String user;
    private final String password;

    //Constructor privado para evitar que hagan "new Conexion()" fuera de esta clase
    private Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error Driver: " + e.getMessage());
        }

        Properties config = new Properties();
        try (InputStream in = getClass().getResourceAsStream(CONFIG_FILE)) {
            if (in == null) {
                throw new IllegalStateException(
                        "No se encontro " + CONFIG_FILE + " en el classpath. "
                        + "Copia db.properties.example como src/db.properties y ajusta los valores.");
            }
            config.load(in);
        } catch (IOException e) {
            throw new IllegalStateException("Error al leer " + CONFIG_FILE, e);
        }

        this.url = config.getProperty("db.url");
        this.user = config.getProperty("db.user");
        this.password = config.getProperty("db.password");
        if (url == null || user == null || password == null) {
            throw new IllegalStateException(
                    "Faltan propiedades (db.url, db.user, db.password) en " + CONFIG_FILE);
        }
    }

    //Método público estático para obtener la única instancia del Gestor
    public static synchronized Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    //Método para entregar una conexión fresca cada vez que se pida
    /**
     * Método conectar.
     * @return un valor de tipo Connection
     * @throws SQLException en caso de error
     */
    /**
     * Método conectar.
     * @return un valor de tipo Connection
     * @throws SQLException en caso de error
     */
    /**
     * Ejecuta la operacion conectar.
     * @return valor de tipo Connection
     * @throws SQLException si ocurre un error
     */
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


}
