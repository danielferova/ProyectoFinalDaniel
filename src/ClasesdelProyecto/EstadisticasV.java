/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdelProyecto;

import java.io.Serializable;

/**
 *
 * @author danie
 */
public class EstadisticasV implements Serializable  {
    //ATRIBUTOS
    //Clase serializable
    String tipoV;
    String nombreV;
    String PunteriaV;
    String AtaqueV;
    String DefensaV;
    String VelocidadV;
    String costoV;
/**
 * Constructor
 * @param tipoV
 * @param nombreV
 * @param PunteriaV
 * @param AtaqueV
 * @param DefensaV
 * @param VelocidadV
 * @param costoV 
 */
    public EstadisticasV(String tipoV, String nombreV, String PunteriaV, String AtaqueV, String DefensaV, String VelocidadV, String costoV) {
        this.tipoV = tipoV;
        this.nombreV = nombreV;
        this.PunteriaV = PunteriaV;
        this.AtaqueV = AtaqueV;
        this.DefensaV = DefensaV;
        this.VelocidadV = VelocidadV;
        this.costoV = costoV;
    }

    
    
    
    /**
     * Retorna tipov
     * @return 
     */
    public String getTipoV() {
        return tipoV;
    }
/**
 * Establece tipov
 * @param tipoV 
 */
    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }
/**
 * Retorna Nombre
 * @return 
 */
    public String getNombreV() {
        return nombreV;
    }
/**
 * Establece nombrev
 * @param nombreV 
 */
    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }
/**
 * Retorna Punteriav
 * @return 
 */
    public String getPunteriaV() {
        return PunteriaV;
    }
/**
 * Establece punteria
 * @param PunteriaV 
 */
    public void setPunteriaV(String PunteriaV) {
        this.PunteriaV = PunteriaV;
    }
/**
 * retorna Ataque v
 * @return 
 */
    public String getAtaqueV() {
        return AtaqueV;
    }
/**
 * Establece Ataquev
 * @param AtaqueV 
 */
    public void setAtaqueV(String AtaqueV) {
        this.AtaqueV = AtaqueV;
    }
/**
 * Retorna defensav
 * @return 
 */
    public String getDefensaV() {
        return DefensaV;
    }
/**
 * Establece defensav
 * @param DefensaV 
 */
    public void setDefensaV(String DefensaV) {
        this.DefensaV = DefensaV;
    }
/**
 * Retorna Velocidadv
 * @return 
 */
    public String getVelocidadV() {
        return VelocidadV;
    }
/**
 * Establece velocidadv
 * @param VelocidadV 
 */
    public void setVelocidadV(String VelocidadV) {
        this.VelocidadV = VelocidadV;
    }

   /**
    * Retorna costov
    * @return 
    */
    public String getCostoV() {
        return costoV;
    }
/**
 * establece costov
 * @param costoV 
 */
    public void setCostoV(String costoV) {
        this.costoV = costoV;
    }

  
    
    
    
   
    
}
