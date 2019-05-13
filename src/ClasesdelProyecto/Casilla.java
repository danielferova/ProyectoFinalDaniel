/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdelProyecto;

import javax.swing.JButton;

/**
 *
 * @author danie
 */
public class Casilla extends JButton {
    
    private Usuario usuario;
    private Vehiculos vehiculos;
/**
 * Retorna vehiculos
 * @return 
 */
    public Vehiculos getVehiculos() {
        return vehiculos;
    }
/**
 * Establece vehiculos
 * @param vehiculos 
 */
    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    
/**
 * Llamo a Usuario
 * @return 
 */
    public Usuario getUsuario() {
        return usuario;
    }
/**
 * Establece usuario
 * @param usuario 
 */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

 

}
