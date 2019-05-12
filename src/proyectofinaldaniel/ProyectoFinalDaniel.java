/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinaldaniel;

import VistasInterfazD.Bienvenido;
import java.io.File;

/**
 *
 * @author danie
 */
public class ProyectoFinalDaniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Bienvenido entrada = new Bienvenido();
         entrada.show();
         entrada.setSize(1190, 860);
             File createCarpeta = new File("Persona");
        
        
        if (!createCarpeta.exists()) {
            createCarpeta.mkdir();
            
        }
        
    pathPersona = createCarpeta.getAbsolutePath()+File.separatorChar;
    }
    public static String pathPersona;
         
         
    }
    

