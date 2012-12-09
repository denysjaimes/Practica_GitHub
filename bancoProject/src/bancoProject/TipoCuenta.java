/*
 * Esta clase sirve para instanciar objetos tipocuenta asociados a una cuentabancaria
 * 
 */
package bancoProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sergio
 */
public class TipoCuenta {

    private long idTipocuenta;
    private String descripcion;
    private static int cuantos = 0;

    TipoCuenta(String _descripcion) {
        descripcion = _descripcion;
        cuantos = cuantos + 1;
        idTipocuenta = cuantos;
    }

    public void setidTipocuenta(long id) {
        idTipocuenta = id;
    }

    public void setDescripcion(String desc) {
        descripcion = desc;
    }

    public long getidTipocuenta() {
        return idTipocuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    static TipoCuenta addTipoCuenta() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);
        
        System.out.println("Ingrese tipo");
        TipoCuenta t = new TipoCuenta(entrada.readLine());
    
        return t;
    }
}
