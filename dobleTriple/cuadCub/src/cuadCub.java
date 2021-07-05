import java.util.Scanner;
import java.lang.System;

public class cuadCub{

    public static int doble_numero (int num) {

        int doble_num = (int)Math.pow(num, 2);

        return  doble_num;
    }

    public static int triple_numero (int num) {

        int triple = (int)Math.pow(num, 3);

        return triple;
    }

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un número entero");

        int numero = entrada.nextInt();

        int doble = doble_numero((int)numero);

        int triple = triple_numero((int)numero);
        
        System.out.println("el doble del número" + numero + "es " + doble);

        System.out.println("el doble del número" + numero + "es " + triple);

    }


}