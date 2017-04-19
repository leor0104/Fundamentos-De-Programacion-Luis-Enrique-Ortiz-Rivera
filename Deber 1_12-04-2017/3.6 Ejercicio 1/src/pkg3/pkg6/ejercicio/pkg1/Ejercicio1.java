/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        //Creacion de variables
        String descripcion;
        int Unit = 0;  
        double CostProd = 0;
        double CostMaterial = 3.5;
        double CostFijo = 10700;

        //Solicitud de valores al usuario 
        System.out.print("Ingrese la descripción del artículo: ");
        descripcion = datos.next();
        System.out.print("Ingrese el numero de unidades: ");
        Unit = datos.nextInt();
        
        //Operaciones 
        CostProd = Unit*CostMaterial+CostFijo;
        
        // Se muestra el resultado
        System.out.print("El costo de producción de " +Unit+" "+ descripcion+ " es: "+CostProd);
                
    }
    
}
