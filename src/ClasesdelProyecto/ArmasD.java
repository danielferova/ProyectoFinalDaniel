/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdelProyecto;

/**
 *
 * @author danie
 */
public class ArmasD {
     String nombreA;
    String ataqueA;
    String punteriaA;
    String costoA;

    public ArmasD(String nombreA, String ataqueA, String punteriaA, String costoA) {
        this.nombreA = nombreA;
        this.ataqueA = ataqueA;
        this.punteriaA = punteriaA;
        this.costoA = costoA;
    }

    
    
    
    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getAtaqueA() {
        return ataqueA;
    }

    public void setAtaqueA(String ataqueA) {
        this.ataqueA = ataqueA;
    }

    public String getPunteriaA() {
        return punteriaA;
    }

    public void setPunteriaA(String punteriaA) {
        this.punteriaA = punteriaA;
    }

    public String getCostoA() {
        return costoA;
    }

    public void setCostoA(String costoA) {
        this.costoA = costoA;
    }
    

}
