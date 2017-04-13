/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicion3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner datos = new Scanner(System.in);
        
        //Creación de variables
        double num;
        double dia_hora = 24;
        int hora_seg = 3600;
        int hora_min = 60;
        int segundo = 60;
        double Dias = 0;
        double Minutos = 0;
        double Segundos = 0;
        
        //  Solicitud de los valores al usuario
        System.out.print("Ingrese la cantidad de horas a transformar: ");
        num = datos.nextDouble();
        
        
        //operaciones
        Dias = (num/dia_hora);
        Minutos = (num*hora_min);
        Segundos = (num*hora_seg);
            
        //Salida en pantalla
         System.out.print("La Cantidad de " +num+ " equivale a:\n" +Dias+ " - dias\n " +Minutos+ " - minutos\n " +Segundos+ " - segundos "); 
            
    }
    
}
