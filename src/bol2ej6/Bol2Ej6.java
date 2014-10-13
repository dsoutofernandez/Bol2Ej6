
package bol2ej6;

import java.util.Scanner;

public class Bol2Ej6 {

    public static void main(String[] args) {
        
        float porcentaje_desc = 0;
        float coste_compra = 0;
        
        System.out.println("Introduzca el prorcentaje del descuento:");
        Scanner rec_porcentaje = new Scanner (System.in);
        
        porcentaje_desc = rec_porcentaje.nextFloat();
        
        System.out.println("Instroduzca el valor de la compra:");
        Scanner rec_valor = new Scanner (System.in);
        
        coste_compra = rec_valor.nextFloat();
        
        System.out.println("El valor final de su compra es " + (coste_compra - ((porcentaje_desc*coste_compra)/100)));
        
        
        
    }
    
}
