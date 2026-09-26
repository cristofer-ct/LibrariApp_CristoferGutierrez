# Cuestionario Diagnostico - LibraryApp

## Apartado 1: Java / POO

**Pregunta 1:** ?Que es la Programacion Orientada a Objetos?
- **Respuesta investigada:** Paradigma de programacion que organiza el software en objetos que combinan estado (atributos) y comportamiento (metodos).
- **Explicacion propia:** Programar pensando en objetos del mundo real con sus caracteristicas y acciones.
- **Ejemplo en LibraryApp:** La clase `Libro` tiene atributos como `isbn`, `titulo`, `precio` y metodos como `getIsbn()`.

**Pregunta 2:** ?Que es una clase en Java?
- **Respuesta investigada:** Una clase es una plantilla o molde que define los atributos y metodos que tendran los objetos creados a partir de ella.
- **Explicacion propia:** Es el esquema del cual se crean los objetos.
- **Ejemplo en LibraryApp:** `Autor.java` es la clase que define como sera un objeto Autor.

**Pregunta 3:** ?Que es el encapsulamiento?
- **Respuesta investigada:** Principio POO que oculta los detalles internos de un objeto y solo expone lo necesario mediante metodos publicos.
- **Explicacion propia:** Proteger los datos usando `private` y controlarlos con getters/setters.
- **Ejemplo en LibraryApp:** En `Libro.java` el atributo `precio` es `private` y se accede via `getPrecio()`.

**Pregunta 4:** ?Diferencia entre tipo primitivo y clase Wrapper?
- **Respuesta investigada:** Los tipos primitivos (int, double, boolean) almacenan valores directamente. Las clases Wrapper (Integer, Double, Boolean) los envuelven como objetos, permitiendo valores nulos y uso en colecciones genericas.
- **Explicacion propia:** Los primitivos son datos simples; los Wrapper los convierten en objetos con mas capacidades.
- **Ejemplo en LibraryApp:** `int stock` vs `Integer stock` (este ultimo puede ser null si aun no se define el stock).

## Apartado 2: Persistencia

**Pregunta 5:** ?Que es JDBC?
- **Respuesta investigada:** Java Database Connectivity es una API estandar de Java para conectar aplicaciones con bases de datos relacionales.
- **Explicacion propia:** El puente entre Java y la base de datos MySQL.
- **Ejemplo en LibraryApp:** `Conexion.java` usa JDBC para establecer la conexion con MySQL.

**Pregunta 6:** ?Que es el patron DAO?
- **Respuesta investigada:** Data Access Object es un patron de disenio que separa la logica de acceso a datos de la logica de negocio.
- **Explicacion propia:** Capa que aisle las consultas SQL del resto de la app.
- **Ejemplo en LibraryApp:** `LibroDAO.java` define las operaciones, `LibroDAOImpl.java` las implementa con SQL.

**Pregunta 7:** ?Que es el patron Singleton?
- **Respuesta investigada:** Patron que garantiza que una clase tenga solo una instancia durante toda la ejecucion del programa.
- **Explicacion propia:** Que solo exista un objeto de ese tipo en toda la aplicacion.
- **Ejemplo en LibraryApp:** `Conexion.java` usa Singleton para tener una sola conexion a la BD.

**Pregunta 8:** ?Que es PreparedStatement?
- **Respuesta investigada:** Interfaz de JDBC que permite ejecutar consultas SQL precompiladas con parametros, lo que previene la inyeccion SQL.
- **Explicacion propia:** Un SQL seguro que usa `?` para los valores en lugar de concatenar strings.
- **Ejemplo en LibraryApp:** En `LibroDAOImpl.java` se usa `PreparedStatement` para insertar libros de forma segura.

## Apartado 3: JavaFX / MVC

**Pregunta 9:** ?Que es FXML?
- **Respuesta investigada:** Lenguaje declarativo basado en XML utilizado en JavaFX para definir la estructura de las interfaces de usuario de forma separada del codigo Java.
- **Explicacion propia:** El equivalente al HTML pero para aplicaciones de escritorio JavaFX.
- **Ejemplo en LibraryApp:** `LibroView.fxml` define la pantalla de gestion de libros.

**Pregunta 10:** ?Por que JavaFX usa ObservableList en lugar de ArrayList?
- **Respuesta investigada:** ObservableList notifica automaticamente a sus listeners cuando su contenido cambia, lo que permite que los componentes UI como TableView se actualicen en tiempo real sin codigo adicional.
- **Explicacion propia:** Una lista inteligente que avisa a la tabla cuando sus datos cambian.
- **Ejemplo en LibraryApp:** En `LibroController.java` se usa ObservableList para poblar el TableView de libros.
