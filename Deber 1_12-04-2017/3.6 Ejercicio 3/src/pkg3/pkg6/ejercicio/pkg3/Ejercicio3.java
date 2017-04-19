/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        double horas, dias, minutos, segundos;
        
        //Solicitud de valores al usuario 
        System.out.print("Ingrese la cantidad de horas a transformar: ");
        horas= tiempo.nextDouble();
        
        // Operaciones
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
               
        // Se muestra el resultado
        System.out.print("La cantidad de "+horas+" horas equivalen a:\n");
        System.out.print(+dias+" dias\n"+minutos+" minutos\n"+segundos+" segundos");
    }
    
}
