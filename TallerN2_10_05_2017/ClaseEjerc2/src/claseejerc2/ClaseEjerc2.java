/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseejerc2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ClaseEjerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        //Creo variables para pedir por consola los datos 
        int a=0, i=1, res=0, contador=0;int x = 0;
        double n, N;
        
        //Solicitu de datos al usuario
         
        System.out.print("Ingrese un numero: ");
        n=datos.nextInt();
       
        //Proceso
        n=(Math.ceil(n/10))*10;
        x = (int) (n);

        do{
            System.out.println(x);
            x-=10;
        }while (x>0);
    }
    
}
