package bancoProject;

/**
 *
 * @author Alejandro Silva
 */
public class Cliente {

    private long idCliente;

    /**
     * Obtiene el valor de idCliente
     *
     * @return El valor que contiene idCliente
     */
    public long getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el valor de idCliente
     *
     * @param idCliente nuevo valor para idCliente
     */
    public void setIdCliente(long _idCliente) {
        this.idCliente = _idCliente;
    }
    
        private String nombreCliente;

    /**
     * Obtiene el valor de nombreCliente
     *
     * @return el valor de nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el valor de nombreCliente
     *
     * @param nombreCliente nuevo valor para nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Cliente()
    {
        idCliente = 0;
        nombreCliente = "";
    }
    
}
