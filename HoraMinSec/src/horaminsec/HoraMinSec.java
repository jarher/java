/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horaminsec;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class HoraMinSec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hora = JOptionPane.showInputDialog("Ingrese la hora");
        String min = JOptionPane.showInputDialog("Ingrese los minutos");
        String sec = JOptionPane.showInputDialog("Ingrese los segundos");
        
        while(Integer.parseInt(hora) < 0 || Integer.parseInt(hora) >= 25){
            JOptionPane.showMessageDialog(null, "Error, hora inválida");
            hora = JOptionPane.showInputDialog("Ingrese la hora");
        }
        while(Integer.parseInt(min) < 0 || Integer.parseInt(min) > 60){
            JOptionPane.showMessageDialog(null, "Error, minutos inválidos");
            min = JOptionPane.showInputDialog("Ingrese los minutos");
        }
        while(Integer.parseInt(sec) < 0 || Integer.parseInt(sec) > 60){
            JOptionPane.showMessageDialog(null, "Error, segundos inválidos");
            sec = JOptionPane.showInputDialog("Ingrese los segundos");
        }
        if(Integer.parseInt(hora) < 10){
            hora =  "0" + hora;
        }
        if (Integer.parseInt(min) < 10){
            min = "0" + min;
        }
        if (Integer.parseInt(sec) < 10){
            sec = "0" + sec;
        }
        JOptionPane.showMessageDialog(null, "Hora válida " + hora + ":"+ min + ":" + sec);
    }
    
}
