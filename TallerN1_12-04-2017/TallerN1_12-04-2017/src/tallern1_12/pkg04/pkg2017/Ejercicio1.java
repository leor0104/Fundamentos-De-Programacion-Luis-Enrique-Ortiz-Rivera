/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallern1_12.pkg04.pkg2017;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        //Creación de variables
        double costo = 0;
        double precm2 = 0;
        double ancho = 0;
        double largo = 0;
        //  Solicitud de los valores al usuario
        System.out.print("Ingrese el costo del m2: ");
        costo = datos.nextDouble();
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = datos.nextDouble();
        System.out.print("Ingrese el largo del terreno: ");
        largo = datos.nextDouble();
        
        
        //operaciones
        precm2 = costo*(ancho*largo);
            
        //Salida en pantalla
         System.out.print("El costo del terreno es: " +precm2);
    }
    
}
