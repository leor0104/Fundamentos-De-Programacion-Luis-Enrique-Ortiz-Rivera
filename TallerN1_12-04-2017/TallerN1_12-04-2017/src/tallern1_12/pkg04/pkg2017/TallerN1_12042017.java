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
public class TallerN1_12042017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        //Creación de variables
        double persona1,persona2,persona3,persona4,persona5;
        double total = 0;
        double media = 0;
        
        //  Solicitud de los valores al usuario
        System.out.print("Ingrese la estatura de la persona 1: ");
        persona1 = datos.nextDouble();
        System.out.print("Ingrese la estatura de la persona 2: ");
        persona2 = datos.nextDouble();
        System.out.print("Ingrese la estatura de la persona 3: ");
        persona3 = datos.nextDouble();
        System.out.print("Ingrese la estatura de la persona 4: ");
        persona4 = datos.nextDouble();
        System.out.print("Ingrese la estatura de la persona 5: ");
        persona5 = datos.nextDouble(); 
        
        //operaciones
        total = persona1+persona2+persona3+persona4+persona5;
        media = total/5;
            
        //Salida en pantalla
         System.out.print("La media de la estatura del curso es: " +media);
    }
    
}
