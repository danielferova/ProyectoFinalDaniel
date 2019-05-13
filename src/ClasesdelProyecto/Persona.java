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
public class Persona implements Serializable {
    public String nombre;
    public String v1, v2, v3, tipo1, tipo2, tipo3;
/**
 * Retorna tipo1
 * @return 
 */
    public String getTipo1() {
        return tipo1;
    }
/**1
 * Establece tipo1
 * @param tipo1 
 */
    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }
/**
 * Retorna tipo2
 * @return 
 */
    public String getTipo2() {
        return tipo2;
    }
/**
 * Establece tipo2
 * @param tipo2 
 */
    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
/**
 * Retorna tipo3
 * @return 
 */
    public String getTipo3() {
        return tipo3;
    }
/**
 * Establece tipo3
 * @param tipo3 
 */
    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }
/**
 * Retorna v1
 * @return 
 */
    public String getV1() {
        return v1;
    }
/**
 * Establece v1
 * @param v1 
 */
    public void setV1(String v1) {
        this.v1 = v1;
    }
/**v2
 * Retorna v2
 * @return 
 */
    public String getV2() {
        return v2;
    }
/**
 * Establecc 2
 * @param v2 
 */
    public void setV2(String v2) {
        this.v2 = v2;
    }
/**
 * Retorna v3
 * @return 
 */
    public String getV3() {
        return v3;
    }
/**
 * establece v3
 * @param v3 
 */
    public void setV3(String v3) {
        this.v3 = v3;
    }
/**
 * Constructor de persona para reportes de usuairo y para emepzar
 * @param nombre
 * @param v1
 * @param v2
 * @param v3
 * @param tipo1
 * @param tipo2
 * @param tipo3 
 */
    public Persona(String nombre, String v1, String v2, String v3, String tipo1, String tipo2, String tipo3) {
        this.nombre = nombre;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.tipo3 = tipo3;
    }

  
/**
 * Retorna nombre usuairo
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Establece nombre usuairo
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
