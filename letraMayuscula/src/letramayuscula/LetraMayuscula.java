/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letramayuscula;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class LetraMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caracter = JOptionPane.showInputDialog("ingrese un caracter");
        while (caracter.length() > 1 || caracter == ""){
            JOptionPane.showMessageDialog(null, "error, ingrese el dato que se le pide");
            caracter = JOptionPane.showInputDialog("ingrese un único caracter");
        }
        if(caracter.toUpperCase().equals(caracter)){
            JOptionPane.showMessageDialog(null, "El caracter es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "El caracter es una letra minuscula");
        }
    }
    
}
