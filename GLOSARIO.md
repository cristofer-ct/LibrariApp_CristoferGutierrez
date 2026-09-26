# Glosario de Conceptos - LibraryApp

## Terminos Semana 1: Modelo de Dominio

| N | Termino | Definicion formal | En mis palabras | Ubicacion en el codigo | Ejemplo / Problema que resuelve |
|---|---------|-------------------|-----------------|------------------------|----------------------------------|
| 1 | Clase | Plantilla que define atributos y metodos de los objetos | El molde para crear objetos | `org.cg.model.Libro` | Permite definir que propiedades tiene un Libro |
| 2 | Objeto | Instancia concreta de una clase | Una cosa real creada del molde | `Principal.java` | Un libro especifico con isbn y titulo reales |
| 3 | Encapsulamiento | Ocultamiento del estado interno con acceso controlado | Usar private + getters/setters | `Libro.java` | Evita que el precio sea negativo accidentalmente |
| 4 | Tipo Primitivo | Tipos de datos basicos: int, double, boolean, char | Datos simples sin metodos | `Libro.java` | `int stock` - guarda el numero de copias |
| 5 | Clase Wrapper | Clases que envuelven primitivos: Integer, Double | Primitivos con superpoderes | Colecciones genericas | `Integer id` puede ser null; `int id` no puede |

## Terminos Semana 2: Persistencia

| N | Termino | Definicion formal | En mis palabras | Ubicacion en el codigo | Ejemplo / Problema que resuelve |
|---|---------|-------------------|-----------------|------------------------|----------------------------------|
| 6 | DAO | Data Access Object - patron de acceso a datos | Capa que habla con la BD | `org.cg.dao.LibroDAO` | Separa SQL de la logica de negocio |
| 7 | JDBC | Java Database Connectivity - API de conexion a BD | El puente Java <-> MySQL | `org.cg.util.Conexion` | Permite ejecutar SQL desde Java |
| 8 | Singleton | Patron que garantiza una sola instancia de clase | Solo existe uno en toda la app | `Conexion.java` | Una sola conexion compartida a la BD |
| 9 | PreparedStatement | Consulta SQL precompilada con parametros | SQL seguro con marcadores ? | `LibroDAOImpl.java` | Previene inyeccion SQL al guardar datos |
| 10 | Inyeccion SQL | Ataque que introduce codigo SQL malicioso via input | Hackear la BD con texto trampa | `LibroDAOImpl.java` | PreparedStatement lo previene |

## Terminos Semana 3: JavaFX / MVC

| N | Termino | Definicion formal | En mis palabras | Ubicacion en el codigo | Ejemplo / Problema que resuelve |
|---|---------|-------------------|-----------------|------------------------|----------------------------------|
| 11 | FXML | Lenguaje XML para definir UI en JavaFX | El HTML de JavaFX | `LibroView.fxml` | Separa diseno visual del codigo logico |
| 12 | SceneBuilder | Herramienta visual para editar FXML | Editor drag and drop de pantallas | `LibroView.fxml` | Disenar pantallas sin escribir XML manual |
| 13 | Controller | Clase Java que maneja eventos de una vista FXML | El cerebro de la pantalla | `LibroController.java` | Reacciona a los clicks de botones |
| 14 | ObservableList | Lista con notificacion automatica de cambios | Lista que avisa cuando cambia | `LibroController.java` | La tabla se actualiza sola al agregar datos |
| 15 | TableView | Componente JavaFX para mostrar datos en tabla | Una tabla visual interactiva | `LibroView.fxml` | Muestra la lista de libros al usuario |
