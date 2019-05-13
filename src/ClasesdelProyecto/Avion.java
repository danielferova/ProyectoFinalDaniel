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
public class Avion extends Vehiculos{
    //prueba commit 11 tratando de hacer avance 10 porque el master no daaaa
    //ATRIBUTOS
    int ataque=7, defensa=3, punteria=70;
    int tipoV=5;
    String tipoarma="Arma Basica Avion";
    /**
     * Constructor 1
     */
    public Avion(){
        hp=50+((nivel-1)*50);
        pp = 5;
        nivel = 1;
        experiencia = 0;
        ataque=7+((nivel-1)*2);
        defensa=3+((nivel-1)*1);
        punteria=70+((nivel-1)*(1));
        tipoV=5;
        arma=tipoarma;
    }
    /**
     * Constructor de avion
     * @param hp
     * @param pp
     * @param nivel
     * @param experiencia
     * @param nombre
     * @param arma 
     */
    public Avion(int hp, int pp, int nivel, int experiencia, String nombre, String arma){
        super(hp,pp,nivel,experiencia,nombre,arma);
        ataque=7;
        defensa=3;
        punteria=70;
    }
    
    

    @Override
    String getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getTipoV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getAtaque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getDefensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getPunteria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setAtaque(int ataque, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setDefensa(int defensa, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setPunteria(int punteria, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
