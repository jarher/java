/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero"));
        int num_3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número entero"));
        
        int mayor = Math.max(num_1, num_2);
        mayor = Math.max(mayor, num_3);
        
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
    }
    
}
