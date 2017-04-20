/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3.java.pkg5;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Clase3Java5 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
         // Creacion de variables
         
        String dia;
        
        // Ingreso de variables
        System.out.print("Ingrese el  dia: ");
        dia = datos.next().toLowerCase();
                
        // Opciones
        switch(dia){
            case "lunes":
                System.out.print("G.P. (15:00-16:00) ");
                break;
            case "martes":
                System.out.print("Contabilidad (07:00-10:00) ");
                break;
            case "miercoles":
                System.out.print("F. Programacion (07:00-10:00) & Desarrollo Espiritual (18:00-21:00)  ");
                break;
            case "jueves":
                System.out.print("Matematicas Discretas (07:00-10:00)");
                break;
            case "viernes":
                System.out.print("Estadistica (18:00-21:00)");
                break;              
            default :
                System.out.print("Sin actividad"); 
        }
    }
}   

