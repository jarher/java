/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separacion;


import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class Separacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caracteres_1 = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        String caracteres_2 = "YWXVUTSRQPONMLKJIHGFEDCBA";
        String caracteres_3 = "WXVUTSRQPONMLKJIHGFEDCBA";
        String caracteres_4 = "DCBA";
        String caracteres_5 = "CBA";
        String caracteres_6 = "BA";
        String caracteres_7 = "A";
        String caracteres = "";

        String arr[] = {
            caracteres_1,
            caracteres_2,
            caracteres_3,
            caracteres_4,
            caracteres_5,
            caracteres_6,
            caracteres_7
        };
        for(int i = 0; i < arr.length; i++){
            String str[] = arr[i].split("");
            for(int j = 0; j < str.length; j++){
                caracteres += str[j] + " ";
            }
            System.out.println(caracteres);
            caracteres = "";
        }
    }

}
