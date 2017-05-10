/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseejerc1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ClaseEjerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        //Creo variables para pedir por consola los datos 
        int n,a=0, i=1, res=0, contador=0;int x = 0;
        
        //Solicitu de datos al usuario
         
        System.out.print("Ingrese el limite de la serie: ");
        n=datos.nextInt();
        
        /*do{
             System.out.print("variables : "+contador);
             contador++;
        }while(contador<n);
        do{
             System.out.print("variables : "+contador);
             contador++;
        }while(contador!=10);*/ 
        do{
            x=(int)(Math.random()*n);
            System.out.println("Numero: "+x);
            System.out.println("Desea continuar: (1/0)");
            a=datos.nextInt();
        }while (a!=0);
    
    }
 }

 
