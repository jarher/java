/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodiez;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class MultiploDiez {

    public static String multiplo(int numero){
        String respuesta;
        if(numero % 10 == 0){
            respuesta = "El número " + numero + " es múltiplo de diez";
        }else{
            respuesta = "El número " + numero + " no es múltiplo de diez";
        }
        return respuesta;
    }
    public static void main(String[] args) {
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));
        while(entero < 0){
            JOptionPane.showMessageDialog(null, "Error, ingrese un número positivo");
            entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));
        }
        JOptionPane.showMessageDialog(null, multiplo(entero));
        
    }
    
}
