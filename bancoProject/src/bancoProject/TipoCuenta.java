/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoProject;

/**
 *
 * @author Sergio
 */
public class TipoCuenta {
    private long idTipocuenta;
    private String descripcion;
    
    TipoCuenta()
    {
    }
    public void setidTipocuenta(long id)
    {
      idTipocuenta = id;
    }
    public void setDescripcion(String desc)
    {
      descripcion =desc;
    }
    public long getidTipocuenta()
    {
      return idTipocuenta;
    }
    public String getDescripcion()
    {
       return descripcion;
    }
    
    public void addTipoCuenta()
    {
       
    }
}
