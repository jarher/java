/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un número entero positivo "));
        int num_1 = 0;
        int num_2 = 1;
        int sum = 0;
        String res = "";

        while (numero < 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("error, por favor ingrese un número entero positivo "));
        }
        res += num_1 + "\n" + num_2 + "\n";
        sum = num_1 + num_2;
        
        while (sum < numero) {
            res += sum + "\n";
            num_1 = num_2;
            num_2 = sum;
            sum = num_1 + num_2;
        }

        System.out.println(res);
        /*
        serie = new int[serie.length + 1];

        for (int i = 0; i < serie.length; i++) {
            if (sum > 100) {
                break;
            }
            if (serie.length == 2) {
                sum = +1;
                serie[serie.length - 1] = sum;
            } else {
                sum = serie[serie.length - 3] + serie[serie.length - 2];
                serie[serie.length - 1] = sum;
            }
            serie = new int[serie.length + 1];
            System.out.println(serie.length);
        }

         */

    }

}
