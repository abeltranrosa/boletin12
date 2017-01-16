package boletin12;

import static boletin12.Garaxe.COCHES;

import javax.swing.JOptionPane;


public class Boletin12 {
    public static void main(String[] args) {
        
        //modificacion 1

        Garaxe obx = new Garaxe(); 

        Factura fac = new Factura();
        int res;
        do {
            res = Integer.parseInt(JOptionPane.showInputDialog("�Sale o entra en el garaje?\nMarque 1 si quiere entrar\nMarque 2 si quiere salir.\nSi quiere cerrar el programa marque 3."));

            if (res == 1) {

                obx.plazas();
            } else if (res == 2) {
                fac.pedirmatricula();
                JOptionPane.showMessageDialog(null, "El precio es de: " + fac.precio());
                fac.dindevolto();
                JOptionPane.showMessageDialog(null, "" + fac.toString());
                COCHES--;
            }
        } while (res != 3);
        //Comentario Adri 
    }
}
