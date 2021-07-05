/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class Hipotenusa {

    public static double hipotenusa (double lado_1, double lado_2) {
        double hipotenusa = Math.pow(lado_1,  2) + Math.pow(lado_2, 2);
        return Math.sqrt(hipotenusa);
    }
    public static void main(String[] args) {
        double valor_1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del primer cateto"));
        double valor_2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del segundo cateto"));
        while(valor_1 <  0 || valor_2 < 0){
            JOptionPane.showMessageDialog(null, "Error, ingrese valores positivos");
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del primer cateto"));
            valor_2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del segundo cateto"));
        }
        
        JOptionPane.showMessageDialog(null, "EL valor de la hipotenusa para los valores " + valor_1 + " y " + valor_2 + " es " + hipotenusa(valor_1, valor_2));
    }
    
}
