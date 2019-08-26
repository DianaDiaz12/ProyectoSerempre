
import core.AsignarTareas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AsignarTareas  a = new AsignarTareas();
        a.objTarea.setTiempo_estimado(10);
        a.objTarea.setTiempo_trabajo(4);
        a.crearTareas();
        
    }
    
}
