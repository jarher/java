import java.util.Scanner;
import java.lang.System;

public class Fahrenheit {
    
    public static double fahrenheit (double numero) {

        double resultado = 32 + ((9 * numero ) / 5);

        return resultado;
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un valor en grados celsius");

        double celsius_a_fahrenheit = fahrenheit(entrada.nextDouble());

        System.out.println("el valor celsius convertido a fahrenheit es: " + celsius_a_fahrenheit);

    }
    
    
}
