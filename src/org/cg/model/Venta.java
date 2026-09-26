package org.cg.model;

/**
 * Clase Venta
 *
 * @author Cristofer
 * @version 1.0.0
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;

    /**
     * Constructor para la clase Venta.
     */
    /**
     * Constructor para la clase Venta.
     */
    public Venta() {
    }

    /**
     * Constructor para la clase Venta.
     * @param noVenta parámetro de tipo int
     * @param fechaVenta parámetro de tipo String
     * @param totalVenta parámetro de tipo double
     * @param cuiCliente parámetro de tipo long
     * @param idUsuario parámetro de tipo int
     */
    /**
     * Constructor para la clase Venta.
     * @param noVenta parámetro de tipo int
     * @param fechaVenta parámetro de tipo String
     * @param totalVenta parámetro de tipo double
     * @param cuiCliente parámetro de tipo long
     * @param idUsuario parámetro de tipo int
     */
    public Venta(int noVenta, String fechaVenta, double totalVenta, long cuiCliente, int idUsuario) {
        this.noVenta = noVenta;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.cuiCliente = cuiCliente;
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el valor de noventa.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de noventa.
     * @return un valor de tipo int
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     * Establece el valor de noventa.
     * @param noVenta parámetro de tipo int
     */
    /**
     * Establece el valor de noventa.
     * @param noVenta parámetro de tipo int
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     * Obtiene el valor de fechaventa.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de fechaventa.
     * @return un valor de tipo String
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Establece el valor de fechaventa.
     * @param fechaVenta parámetro de tipo String
     */
    /**
     * Establece el valor de fechaventa.
     * @param fechaVenta parámetro de tipo String
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * Obtiene el valor de totalventa.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de totalventa.
     * @return un valor de tipo double
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     * Establece el valor de totalventa.
     * @param totalVenta parámetro de tipo double
     */
    /**
     * Establece el valor de totalventa.
     * @param totalVenta parámetro de tipo double
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     * Obtiene el valor de cuicliente.
     * @return un valor de tipo long
     */
    /**
     * Obtiene el valor de cuicliente.
     * @return un valor de tipo long
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     * Establece el valor de cuicliente.
     * @param cuiCliente parámetro de tipo long
     */
    /**
     * Establece el valor de cuicliente.
     * @param cuiCliente parámetro de tipo long
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     * Obtiene el valor de idusuario.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de idusuario.
     * @return un valor de tipo int
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el valor de idusuario.
     * @param idUsuario parámetro de tipo int
     */
    /**
     * Establece el valor de idusuario.
     * @param idUsuario parámetro de tipo int
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
