package org.cg.model;

import java.sql.Timestamp;

//POJO: Nombre, atributos de clase, constructores, metodos(get y set) otros...
//encapssulación, herencia, polimorfismo, abstractión
/**
 * Clase Usuario
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Usuario {
    //id, username, email, first_name, last_name, password_hash, rol, activo, fecha_creacion
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String rol;
    private boolean activo;
    private Timestamp fechaCreacion;

    /**
     * Constructor para la clase Usuario.
     */
    /**
     * Constructor para la clase Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor para la clase Usuario.
     * @param id parámetro de tipo int
     * @param username parámetro de tipo String
     * @param rol parámetro de tipo String
     */
    /**
     * Constructor para la clase Usuario.
     * @param id parámetro de tipo int
     * @param username parámetro de tipo String
     * @param rol parámetro de tipo String
     */
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    public Usuario(String username, String email, String firstName, String lastName,
            String passwordHash, String rol) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    /**
     * Obtiene el valor de rol.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de rol.
     * @return un valor de tipo String
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el valor de rol.
     * @param rol parámetro de tipo String
     */
    /**
     * Establece el valor de rol.
     * @param rol parámetro de tipo String
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene el valor de id.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de id.
     * @return un valor de tipo int
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el valor de id.
     * @param id parámetro de tipo int
     */
    /**
     * Establece el valor de id.
     * @param id parámetro de tipo int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el valor de username.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de username.
     * @return un valor de tipo String
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el valor de username.
     * @param username parámetro de tipo String
     */
    /**
     * Establece el valor de username.
     * @param username parámetro de tipo String
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el valor de email.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de email.
     * @return un valor de tipo String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el valor de email.
     * @param email parámetro de tipo String
     */
    /**
     * Establece el valor de email.
     * @param email parámetro de tipo String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el valor de firstname.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de firstname.
     * @return un valor de tipo String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el valor de firstname.
     * @param firstName parámetro de tipo String
     */
    /**
     * Establece el valor de firstname.
     * @param firstName parámetro de tipo String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el valor de lastname.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de lastname.
     * @return un valor de tipo String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el valor de lastname.
     * @param lastName parámetro de tipo String
     */
    /**
     * Establece el valor de lastname.
     * @param lastName parámetro de tipo String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el valor de passwordhash.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de passwordhash.
     * @return un valor de tipo String
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Establece el valor de passwordhash.
     * @param passwordHash parámetro de tipo String
     */
    /**
     * Establece el valor de passwordhash.
     * @param passwordHash parámetro de tipo String
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Método isActivo.
     * @return un valor de tipo boolean
     */
    /**
     * Método isActivo.
     * @return un valor de tipo boolean
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Establece el valor de activo.
     * @param activo parámetro de tipo boolean
     */
    /**
     * Establece el valor de activo.
     * @param activo parámetro de tipo boolean
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Obtiene el valor de fechacreacion.
     * @return un valor de tipo Timestamp
     */
    /**
     * Obtiene el valor de fechacreacion.
     * @return un valor de tipo Timestamp
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece el valor de fechacreacion.
     * @param fechaCreacion parámetro de tipo Timestamp
     */
    /**
     * Establece el valor de fechacreacion.
     * @param fechaCreacion parámetro de tipo Timestamp
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    /**
     * Método toString.
     * @return un valor de tipo String
     */
    /**
     * Método toString.
     * @return un valor de tipo String
     */
    public String toString() {
        return username;
    }
}
