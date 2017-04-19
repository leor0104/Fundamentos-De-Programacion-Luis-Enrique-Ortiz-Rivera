/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double compra_dolares, dolar_pesos, cantidad_pesos;
        
        //Solicitud de valores al usuario 
        System.out.print("Ingrese el valor de la compra en dolares: ");
        compra_dolares= datos.nextDouble();
        System.out.print("Ingrese el costo de un dolar en pesos: ");
        dolar_pesos = datos.nextDouble();
        
        // Operaciones
        cantidad_pesos = compra_dolares * dolar_pesos;
               
        // Se muestra el resultado
        System.out.print("La cantidad a pagar en pesos es de: "+cantidad_pesos);
    }
    
}
