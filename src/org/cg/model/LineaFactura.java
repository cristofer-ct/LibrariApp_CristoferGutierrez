package org.cg.model;

//Proyeccion de solo lectura para la factura: una fila del resultado del SP
//sp_buscar_factura (venta + cliente + libro + usuario). No es una entidad.
/**
 * Clase LineaFactura
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class LineaFactura del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class LineaFactura {
    private int numeroFactura;
    private String fechaEmision;
    private long cuiCliente;
    private String nombreCliente;
    private String correoCliente;
    private String isbnLibro;
    private String tituloLibro;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String usuarioAtendio;
    private double granTotal;

    /**
     * Constructor para la clase LineaFactura.
     */
    /**
     * Constructor para la clase LineaFactura.
     */
    public LineaFactura() {
    }

    /**
     * Obtiene el valor de numerofactura.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de numerofactura.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de numerofactura.
     * @return valor de tipo int
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Establece el valor de numerofactura.
     * @param numeroFactura parámetro de tipo int
     */
    /**
     * Establece el valor de numerofactura.
     * @param numeroFactura parámetro de tipo int
     */
    /**
     * Establece el valor de numerofactura.
     * @param numeroFactura valor de tipo int
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Obtiene el valor de fechaemision.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de fechaemision.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de fechaemision.
     * @return valor de tipo String
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece el valor de fechaemision.
     * @param fechaEmision parámetro de tipo String
     */
    /**
     * Establece el valor de fechaemision.
     * @param fechaEmision parámetro de tipo String
     */
    /**
     * Establece el valor de fechaemision.
     * @param fechaEmision valor de tipo String
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Obtiene el valor de cuicliente.
     * @return un valor de tipo long
     */
    /**
     * Obtiene el valor de cuicliente.
     * @return un valor de tipo long
     */
    /**
     * Obtiene el valor de cuicliente.
     * @return valor de tipo long
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
    /**
     * Establece el valor de cuicliente.
     * @param cuiCliente valor de tipo long
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     * Obtiene el valor de nombrecliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombrecliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de nombrecliente.
     * @return valor de tipo String
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente parámetro de tipo String
     */
    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente parámetro de tipo String
     */
    /**
     * Establece el valor de nombrecliente.
     * @param nombreCliente valor de tipo String
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el valor de correocliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de correocliente.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de correocliente.
     * @return valor de tipo String
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     * Establece el valor de correocliente.
     * @param correoCliente parámetro de tipo String
     */
    /**
     * Establece el valor de correocliente.
     * @param correoCliente parámetro de tipo String
     */
    /**
     * Establece el valor de correocliente.
     * @param correoCliente valor de tipo String
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    /**
     * Obtiene el valor de isbnlibro.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de isbnlibro.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de isbnlibro.
     * @return valor de tipo String
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     * Establece el valor de isbnlibro.
     * @param isbnLibro parámetro de tipo String
     */
    /**
     * Establece el valor de isbnlibro.
     * @param isbnLibro parámetro de tipo String
     */
    /**
     * Establece el valor de isbnlibro.
     * @param isbnLibro valor de tipo String
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    /**
     * Obtiene el valor de titulolibro.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de titulolibro.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de titulolibro.
     * @return valor de tipo String
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Establece el valor de titulolibro.
     * @param tituloLibro parámetro de tipo String
     */
    /**
     * Establece el valor de titulolibro.
     * @param tituloLibro parámetro de tipo String
     */
    /**
     * Establece el valor de titulolibro.
     * @param tituloLibro valor de tipo String
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de cantidad.
     * @return un valor de tipo int
     */
    /**
     * Obtiene el valor de cantidad.
     * @return valor de tipo int
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece el valor de cantidad.
     * @param cantidad parámetro de tipo int
     */
    /**
     * Establece el valor de cantidad.
     * @param cantidad parámetro de tipo int
     */
    /**
     * Establece el valor de cantidad.
     * @param cantidad valor de tipo int
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor de preciounitario.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de preciounitario.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de preciounitario.
     * @return valor de tipo double
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Establece el valor de preciounitario.
     * @param precioUnitario parámetro de tipo double
     */
    /**
     * Establece el valor de preciounitario.
     * @param precioUnitario parámetro de tipo double
     */
    /**
     * Establece el valor de preciounitario.
     * @param precioUnitario valor de tipo double
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Obtiene el valor de subtotal.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de subtotal.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de subtotal.
     * @return valor de tipo double
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Establece el valor de subtotal.
     * @param subtotal parámetro de tipo double
     */
    /**
     * Establece el valor de subtotal.
     * @param subtotal parámetro de tipo double
     */
    /**
     * Establece el valor de subtotal.
     * @param subtotal valor de tipo double
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Obtiene el valor de usuarioatendio.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de usuarioatendio.
     * @return un valor de tipo String
     */
    /**
     * Obtiene el valor de usuarioatendio.
     * @return valor de tipo String
     */
    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    /**
     * Establece el valor de usuarioatendio.
     * @param usuarioAtendio parámetro de tipo String
     */
    /**
     * Establece el valor de usuarioatendio.
     * @param usuarioAtendio parámetro de tipo String
     */
    /**
     * Establece el valor de usuarioatendio.
     * @param usuarioAtendio valor de tipo String
     */
    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    /**
     * Obtiene el valor de grantotal.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de grantotal.
     * @return un valor de tipo double
     */
    /**
     * Obtiene el valor de grantotal.
     * @return valor de tipo double
     */
    public double getGranTotal() {
        return granTotal;
    }

    /**
     * Establece el valor de grantotal.
     * @param granTotal parámetro de tipo double
     */
    /**
     * Establece el valor de grantotal.
     * @param granTotal parámetro de tipo double
     */
    /**
     * Establece el valor de grantotal.
     * @param granTotal valor de tipo double
     */
    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }
}
