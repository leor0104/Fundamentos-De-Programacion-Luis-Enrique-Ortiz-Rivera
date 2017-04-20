/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3.java.pkg4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Clase3Java4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        char departamento; 
        String opcion;
        //Solicitu de datos al usuario
        System.out.print("Ingrese el nombre del departamento: ");
        opcion=datos.next();
        departamento = opcion.charAt(0);
        
        //Creacion de variables        
      switch(departamento){
          case 'A':
              System.out.println("Departamendo de Desarrollo");
              break;
          case 'B':
              System.out.println("Departamendo de Recursoso Humanos");
              break;
          case 'C':
              System.out.println("Departamendo de Finanzas");
              break;
          case 'D':
              System.out.println("Departamendo de Mercadeo");
              break;
          default :
      }
    }
    
}
