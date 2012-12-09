package bancoProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alejandro Silva
 */
public class Cliente {

    private long idCliente;
    private String nombreCliente;
    private static long CONTADOR=0;
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

    public Cliente() {
        idCliente = 0;
        nombreCliente = "";
        
    }

    static Cliente createCliente() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);
        Cliente c= new Cliente();
        CONTADOR++;
        c.setIdCliente(CONTADOR);
        System.out.println("Ingrese nombre");
        c.setNombreCliente(entrada.readLine());
        return c;
    }
}
