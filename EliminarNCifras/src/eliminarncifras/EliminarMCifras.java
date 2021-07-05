/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminarncifras;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class EliminarMCifras {
    
    public static double eliminar_m_cifra(int N, int m){
        
        int divisor_modulo = (int)(Math.pow((int)10, (int)m));
        int modulo_res = N / divisor_modulo;
        return modulo_res;
     
    }
    public static void main(String[] args) {
        int Nnumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cifra entera"));
        int Mnumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otra cifra entera"));
        System.out.println(eliminar_m_cifra(Nnumero, Mnumero));
    }   
    
}
