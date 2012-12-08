/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoProject;

import java.util.Date;

/**
 *
 * @author joel
 */
public class OperacionBancaria {
    
    private String claveOperacion;
    private Date fechaOperacion;
    private long idOperacion;
    private CuentaBancaria cuenta;
    private TipoOperacion tipoOperacion;

    /**
     * Get the value of tipoOperacion
     *
     * @return the value of tipoOperacion
     */
    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Set the value of tipoOperacion
     *
     * @param tipoOperacion new value of tipoOperacion
     */
    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    /**
     * Get the value of cuenta
     *
     * @return the value of cuenta
     */
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    /**
     * Set the value of cuenta
     *
     * @param cuenta new value of cuenta
     */
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Get the value of idOperacion
     *
     * @return the value of idOperacion
     */
    public long getIdOperacion() {
        return idOperacion;
    }

    /**
     * Set the value of idOperacion
     *
     * @param idOperacion new value of idOperacion
     */
    public void setIdOperacion(long idOperacion) {
        this.idOperacion = idOperacion;
    }

    /**
     * Get the value of fechaOperacion
     *
     * @return the value of fechaOperacion
     */
    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Set the value of fechaOperacion
     *
     * @param fechaOperacion new value of fechaOperacion
     */
    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    /**
     * Get the value of claveOperacion
     *
     * @return the value of claveOperacion
     */
    public String getClaveOperacion() {
        return claveOperacion;
    }

    /**
     * Set the value of claveOperacion
     *
     * @param claveOperacion new value of claveOperacion
     */
    public void setClaveOperacion(String claveOperacion) {
        this.claveOperacion = claveOperacion;
    }

}
