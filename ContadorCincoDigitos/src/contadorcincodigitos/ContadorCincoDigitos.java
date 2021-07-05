/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcincodigitos;

/**
 *
 * @author jeffr
 */
public class ContadorCincoDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_random = (int) Math.floor(Math.random() * (1 - 99999) + 99999);
        int lst;
        int dividendo = 10;
        int divisor = 1;
        String res = "";
        
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                
                lst = numero_random % 10;
                numero_random = numero_random - lst;
                res = lst + res;
                
            } else {
                
                lst = (numero_random % (dividendo *= 10)) / (divisor *= 10);
                numero_random = numero_random - lst;
                res = lst + res;
                
            }
        }
        res = res.replaceAll("3","E");
        System.out.println(res);
        
    }

}
