/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        String articulo;
        double costo, preciovent, utilidad, impuesto;
        
        //Solicitud de valores al usuario 
        System.out.print("Ingrese el nombre del artículo: ");
        articulo= datos.next();
        System.out.print("Ingrese el costo del producto: ");
        costo = datos.nextDouble();
        
        // Operaciones
        utilidad = costo * 1.5;
        impuesto = costo * 0.15;
        preciovent = costo + utilidad + impuesto;
               
        // Se muestra el resultado
        System.out.print("El articulo: "+articulo+"\n");
        System.out.print("Tiene una utilidad de: $"+utilidad+"\n");
        System.out.print("Un impuesto de: $" +impuesto+"\n");
        System.out.print("Y su precio de venta es: $" +preciovent);
    }
    
}
