/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_suerte;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class Numero_suerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fecha_nacimiento = JOptionPane.showInputDialog("ingrese la fecha de nacimiento en el formato recomendado dd/mm/aa");
        String split_fecha[] = fecha_nacimiento.split("/");
        String cadena_numeros = "";
        int suma_numeros = 0;
        
        while(split_fecha.length != 3){
            JOptionPane.showMessageDialog(null, "formato no válido");
            fecha_nacimiento = JOptionPane.showInputDialog("ingrese la fecha de nacimiento en el formato recomendado dd/mm/aa");
        }
        
        for(int i = 0; i < split_fecha.length; i++){
            String chars[] = split_fecha[i].split("");
            for(int j = 0; j < chars.length; j++){
                cadena_numeros += chars[j];
            }
        }
        
        String array_numeros[] = cadena_numeros.split("");
        for(int k = 0; k < array_numeros.length; k++){
            suma_numeros += Integer.parseInt(array_numeros[k]);
        }
        System.out.println(suma_numeros);
    }
    
}
