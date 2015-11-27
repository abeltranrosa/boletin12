package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author mmoureperez
 */
public class Boletin12 {
    public static void main(String[] args) {
        String nuevo;
      Garaxe obx=new Garaxe();
      
      
      do{
      obx.plazas();
      nuevo=JOptionPane.showInputDialog("¿Nuevo coche? si/no");
    }while(nuevo.equals("si"));
    
}}
