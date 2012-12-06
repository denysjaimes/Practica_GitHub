package bancoProject;

/**
 *
 * @author Alejandro Silva
 */
public class Cliente {

    private long _idCliente;

    /**
     * Obtiene el valor de _idCliente
     *
     * @return El valor que contiene _idCliente
     */
    public long getIdCliente() {
        return _idCliente;
    }

    /**
     * Establece el valor de _idCliente
     *
     * @param _idCliente nuevo valor para _idCliente
     */
    public void setIdCliente(long _idCliente) {
        this._idCliente = _idCliente;
    }
    
        private String _nombreCliente;

    /**
     * Obtiene el valor de _nombreCliente
     *
     * @return el valor de _nombreCliente
     */
    public String getNombreCliente() {
        return _nombreCliente;
    }

    /**
     * Establece el valor de _nombreCliente
     *
     * @param nombreCliente nuevo valor para _nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this._nombreCliente = nombreCliente;
    }

    public Cliente()
    {
        _idCliente = 0;
        _nombreCliente = "";
    }
    
}
