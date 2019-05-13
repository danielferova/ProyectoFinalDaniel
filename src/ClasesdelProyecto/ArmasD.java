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
public class ArmasD implements Serializable {
    //ATRIBUTOS DE ARMAS
     String nombreA;
    String ataqueA;
    String punteriaA;
    String costoA;
/**
 * Constructor de armas
 * @param nombreA
 * @param ataqueA
 * @param punteriaA
 * @param costoA 
 */
    public ArmasD(String nombreA, String ataqueA, String punteriaA, String costoA) {
        this.nombreA = nombreA;
        this.ataqueA = ataqueA;
        this.punteriaA = punteriaA;
        this.costoA = costoA;
    }

    
    
    /**
     * Retorna nombreA
     * @return 
     */
    public String getNombreA() {
        return nombreA;
    }
/**
 * Establece nombreA
 * @param nombreA 
 */
    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }
/**
 * Retorna AtaqueA
 * @return 
 */
    public String getAtaqueA() {
        return ataqueA;
    }
/**
 * Establece AtaqueA
 * @param ataqueA 
 */
    public void setAtaqueA(String ataqueA) {
        this.ataqueA = ataqueA;
    }
/**
 * Retorna PunteriaA
 * @return 
 */
    public String getPunteriaA() {
        return punteriaA;
    }
/**
 * Establece PunteriaA
 * @param punteriaA 
 */
    public void setPunteriaA(String punteriaA) {
        this.punteriaA = punteriaA;
    }
/**
 * Retorna costoA
 * @return 
 */
    public String getCostoA() {
        return costoA;
    }
/**
 * Establece costoA
 * @param costoA 
 */
    public void setCostoA(String costoA) {
        this.costoA = costoA;
    }

   
    

}
