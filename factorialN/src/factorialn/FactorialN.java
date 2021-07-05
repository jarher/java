/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialn;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class FactorialN {
    
    public static void fact(int n){
        int res = n;
        for(int i = n-1; i >=1; i--){
            res *= i;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número"));
        fact(numero);
    }
    
}
