/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precioventa;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffr
 */
public class PrecioVenta {

    
    
    public static int precioIva (int valorUnidad, int numeroUnidades, int iva){
        int totalPrecioUnidades = valorUnidad * numeroUnidades;
        int precioConIva = totalPrecioUnidades + (totalPrecioUnidades * iva / 100);
        return precioConIva;
    }
    public static void main(String[] args) {
        int valorUnidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor por unidad del producto sin iva"));
        int numeroUnidades = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número de productos vendidos "));
        int iva = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de IVA"));
        JOptionPane.showMessageDialog(null, 
                "El valor de la unidad es: " + valorUnidad + "\n" +
                "El número de unidades es: " + numeroUnidades + "\n" +
                "El valor del IVA es de: " + iva + "\n" +
                "El precio sin iva es: " + valorUnidad * numeroUnidades + "\n" +
                "El precio con iva es: " + precioIva(valorUnidad, numeroUnidades, iva));
    }
    
}
