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
public class html implements Serializable{
    
    int No;
    String usuarios;
    String tanques;
    String salida;
    String filatxt;
    String cola;
    
    public  html(){
    }
    public void generarEncabezado(String Titulo){
        salida = "<html>\n";
        salida += "\n<tr>\n";
        salida +="<td>+p1+<td\n>";
        salida+="<tr>\n";
    }
    
    public void ventana(String p1,String p2, String p3){
        salida+="<td><strong>"+p1+"</strong></td>\n";
        salida+="<td><strong>"+p2+"</strong></td>\n";
        salida+="<td><strong>"+p3+"</strong></td>\n";
        salida+="<tr>";
    }
    
    public void generarFilaHTML(String p1, String p2, String p3){
        filatxt="";
        filatxt="\n<tr>\n";
        filatxt+="<td><strong>"+p1+"</strong></td>\n";
        filatxt+="<td><strong>"+p2+"</strong></td>\n";
        filatxt+="<td><strong>"+p3+"</strong></td>\n";
        filatxt+="</tr>\n";
    }
    public void generarCola(){
        cola+="\n</table>\n";
        cola+="</body>\n";
        cola+="</html>\n";
    }
    
    
}
