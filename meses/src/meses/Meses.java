/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número de mes: "));
        while(mes <= 0 || mes > 12){
            JOptionPane.showMessageDialog(null, "ingrese el número correcto de mes");
            mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número de mes: "));
        }
        if(mes == 1){
            JOptionPane.showMessageDialog(null, "El mes es Enero y tiene 31 días");
        }
        if(mes == 2){
            JOptionPane.showMessageDialog(null, "El mes es Febrero y tiene 28 días");
        }
        if(mes == 3){
            JOptionPane.showMessageDialog(null, "El mes es Marzo y tiene 31 días");
        }if(mes == 4){
            JOptionPane.showMessageDialog(null, "El mes es Abril y tiene 30 días");
        }
        if(mes == 5){
            JOptionPane.showMessageDialog(null, "El mes es Mayo y tiene 31 días");
        }
        if(mes == 6){
            JOptionPane.showMessageDialog(null, "El mes es Junio y tiene 30 días");
        }
        if(mes == 7){
            JOptionPane.showMessageDialog(null, "El mes es Julio y tiene 31 días");
        }
        if(mes == 8){
            JOptionPane.showMessageDialog(null, "El mes es Agosto y tiene 31 días");
        }
        if(mes == 9){
            JOptionPane.showMessageDialog(null, "El mes es Septiembre y tiene 30 días");
        }
        if(mes == 10){
            JOptionPane.showMessageDialog(null, "El mes es Octubre y tiene 31 días");
        }
        if(mes == 11){
            JOptionPane.showMessageDialog(null, "El mes es Noviembre y tiene 30 días");
        }
        if(mes == 12){
           JOptionPane.showMessageDialog(null, "El mes es Diciembre y tiene 31 días"); 
        }
        
    }
}
