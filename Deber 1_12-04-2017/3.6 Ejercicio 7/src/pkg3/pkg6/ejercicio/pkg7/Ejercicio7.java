/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        double GCelsius,GFahrenheit;
                
        //Solicitud de valores al usuario 
        System.out.print("Ingrese la tempuratura en grados Celsius: ");
        GCelsius= tiempo.nextDouble();

        // Operaciones
        GFahrenheit = (9/5) * GCelsius + 32;
        
        // Se muestra el resultado
        System.out.print("Su equivalente es: "+GFahrenheit+" grados Fahrenheit");
    }
    
}
