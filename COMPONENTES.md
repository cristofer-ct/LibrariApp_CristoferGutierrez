# Analisis de Componentes - LibraryApp

## Semana 1: Modelo de Dominio

### org.cg.model.Libro
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar la entidad Libro con sus datos (isbn, titulo, precio, stock, etc.)
- **Dependencias directas:** Ninguna (POJO puro)
- **Diagrama del dato:** Usuario -> LibroController -> LibroDAO -> [Libro] -> MySQL

### org.cg.model.Autor
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar un autor con su nombre y datos de identificacion
- **Dependencias directas:** Ninguna

### org.cg.model.AutorLibro
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar la relacion muchos-a-muchos entre Autor y Libro
- **Dependencias directas:** Implicitamente relacionada con Autor y Libro

### org.cg.model.Categoria
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Clasificar los libros por genero o categoria literaria
- **Dependencias directas:** Ninguna

### org.cg.model.Editorial
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar la editorial que publica los libros
- **Dependencias directas:** Ninguna

### org.cg.model.Cliente
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar al cliente que realiza compras
- **Dependencias directas:** Ninguna

### org.cg.model.Usuario
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar a los usuarios del sistema con su rol y credenciales
- **Dependencias directas:** Ninguna

### org.cg.model.Venta
- **Capa arquitectonica:** Modelo (MVC)
- **Responsabilidad unica:** Representar una transaccion de venta completa
- **Dependencias directas:** Cliente, DetalleVenta

### org.cg.util.Conexion
- **Capa arquitectonica:** Persistencia / Infraestructura
- **Responsabilidad unica:** Proveer una conexion Singleton a MySQL via JDBC
- **Dependencias directas:** java.sql.Connection, java.sql.DriverManager

## Semana 2: Persistencia

### org.cg.dao.LibroDAO
- **Capa arquitectonica:** DAO (Interfaz)
- **Responsabilidad unica:** Definir el contrato CRUD para la entidad Libro
- **Dependencias directas:** org.cg.model.Libro, org.cg.dao.Crud

### org.cg.dao.impl.LibroDAOImpl
- **Capa arquitectonica:** DAO (Implementacion)
- **Responsabilidad unica:** Implementar CRUD de Libro con SQL via JDBC y PreparedStatement
- **Dependencias directas:** LibroDAO, Conexion, java.sql.PreparedStatement

### org.cg.exception.ValidacionException
- **Capa arquitectonica:** Excepciones
- **Responsabilidad unica:** Representar errores de validacion de datos de entrada
- **Dependencias directas:** java.lang.Exception

### org.cg.manager.SesionContext
- **Capa arquitectonica:** Manager / Estado
- **Responsabilidad unica:** Mantener el contexto de la sesion activa del usuario (rol, datos)
- **Dependencias directas:** org.cg.model.Usuario

## Semana 3: Interfaz Grafica

### org.cg.view.fxml.LibroView.fxml
- **Capa arquitectonica:** Vista (MVC)
- **Responsabilidad unica:** Definir la estructura XML de la pantalla de gestion de libros
- **Dependencias directas:** LibroController (fx:controller)

### org.cg.controller.LibroController
- **Capa arquitectonica:** Controlador (MVC)
- **Responsabilidad unica:** Manejar eventos de LibroView y coordinar operaciones con LibroDAO
- **Dependencias directas:** Libro, LibroDAO, javafx.fxml.FXML, javafx.scene.control.*
