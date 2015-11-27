package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author mmoureperez
 */
public class Garaxe {
   private static int COCHES=0;
    String matricula;
    
    
    
    public void plazas(){
      
        if(COCHES<5){
            JOptionPane.showMessageDialog(null,"Hay plazas disponibles");
            matricula();
            COCHES++;}
        else JOptionPane.showMessageDialog(null,"Completo");
        
    }
         
        
    public String matricula(){
        return matricula=JOptionPane.showInputDialog("introduzca la matricula del coche");
    }
    
}
