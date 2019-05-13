
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
public class Enemigos extends Vehiculos{
    //Atributos de enemigos
   int hp=40+(nivel*5),punteria=50+(nivel*5),ataque=8+(nivel*2), defensa=2+(nivel*2);
   /**
    * Constructor de enemigos
    * @param nivel 
    */
    public Enemigos(int nivel) {
      //  super(nivel);
        //this.hp=hp;

    }
/**
 * Retornar puntos de vida
 * @return 
 */
    public int getHp() {
        return hp;
    }
/**
 * Establece puntos de vida
 * @param hp 
 */
    public void setHp(int hp) {
        this.hp = hp;
    }
/**
 * Retornar Punteria
 * @return 
 */
    public int getPunteria() {
        return punteria;
    }
/**
 * Estabelce punteria
 * @param punteria 
 */
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
/**
 * Retorna ataque
 * @return 
 */
    public int getAtaque() {
        return ataque;
    }
/**
 * Estabelce ataque
 * @param ataque 
 */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
/**
 * Retorna defensa
 * @return 
 */
    public int getDefensa() {
        return defensa;
    }
/**
 * Establece defensa
 * @param defensa 
 */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

   /**
    * Retorna puntos de poder
    * @return 
    */
    public int getPp() {
        return pp;
    }
/**
 * Establece puntos de poder
 * @param pp 
 */
    public void setPp(int pp) {
        this.pp = pp;
    }
/**
 * Retorna nivel
 * @return 
 */
    public int getNivel() {
        return nivel;
    }
/**
 * Establce nivel
 * @param nivel 
 */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
/**
 * Retorna experiencia
 * @return 
 */
    public int getExperiencia() {
        return experiencia;
    }
/**
 * Establece experiencia
 * @param experiencia 
 */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

 
    
/**
 * Retorna nombre
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Estabelce nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
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
