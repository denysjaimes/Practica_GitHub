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
public class CuentaBancaria {
    
    private Date fechaApertura;
    private long idCuentaBancaria;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;

    /**
     * Get the value of tipoCuenta
     *
     * @return the value of tipoCuenta
     */
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Set the value of tipoCuenta
     *
     * @param tipoCuenta new value of tipoCuenta
     */
    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * Get the value of numeroCuenta
     *
     * @return the value of numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Set the value of numeroCuenta
     *
     * @param numeroCuenta new value of numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Get the value of idCuentaBancaria
     *
     * @return the value of idCuentaBancaria
     */
    public long getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    /**
     * Set the value of idCuentaBancaria
     *
     * @param idCuentaBancaria new value of idCuentaBancaria
     */
    public void setIdCuentaBancaria(long idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    /**
     * Get the value of fechaApertura
     *
     * @return the value of fechaApertura
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Set the value of fechaApertura
     *
     * @param fechaApertura new value of fechaApertura
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    
}
