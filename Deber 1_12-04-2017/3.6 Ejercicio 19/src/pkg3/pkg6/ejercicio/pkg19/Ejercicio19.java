/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg19;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double angulo, anguloRadianes;
        double sen, cos;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el tamaño del angulo en grados: ");
        angulo= datos.nextDouble();
      
        // Operaciones
        anguloRadianes = Math.toRadians(angulo); //Convercion directa
        anguloRadianes = angulo / 180 * Math.PI; //Convercion con formula
        sen = Math.sin(anguloRadianes);
        cos = Math.cos(anguloRadianes);
        
        // Se muestra el resultado
        System.out.print("El seno del angulo es: "+sen+"\n");
        System.out.print("El coseno del angulo es: "+cos);
    }
    
}
