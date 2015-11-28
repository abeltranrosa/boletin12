package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author mmoureperez
 */
public class Factura {

    String mat;
    float tiempo;
    float pre;
    float cartosRecibidos;
    float cartosDevoltos;

    public String pedirmatricula() {
        Garaxe obx = new Garaxe();
        mat = obx.matricula();
        return mat;
    }

    public float tiempo() {
        return tiempo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el tiempo: "));
    }

    public float precio() {
        float tiem = tiempo();
        if (tiem <= 3) {
            pre = 1.5f;
        } else {
            float tiem2 = (tiem - 3);
            pre = (float) (+1.5 + (0.2 * tiem2));
        }
        return pre;
    }

    public float dinrecibido() {
        return cartosRecibidos = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de dinero introducido"));
    }

    public float dindevolto() {
        float dinero = dinrecibido();
        cartosDevoltos = dinero - pre;
        return cartosDevoltos;
    }

    @Override
    public String toString() {
        return "Factura:" + "\nMatricula=" + mat + "\nTiempo=" + tiempo + "horas" + "\nPrecio=" + pre + "€" + "\nCartos recibidos=" + cartosRecibidos + "€" + "\nCartos devoltos=" + cartosDevoltos + "€";
    }

}
