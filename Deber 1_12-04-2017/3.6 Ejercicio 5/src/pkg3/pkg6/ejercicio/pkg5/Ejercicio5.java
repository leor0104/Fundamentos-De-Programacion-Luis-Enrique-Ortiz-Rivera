/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        int velocidadluz = 300000;
        int segundos, distancia;
        
        //Solicitud de valores al usuario 
        System.out.print("Ingrese el tiempo de recorrido (segundos): ");
        segundos= tiempo.nextInt();
        
        // Operaciones
        distancia = segundos * velocidadluz;
               
        // Se muestra el resultado
        System.out.print("La distancia recorrida por la luz es: "+distancia+"km");
    }
    
}
