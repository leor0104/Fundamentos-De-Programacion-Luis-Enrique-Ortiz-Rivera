/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);
        // TODO code application logic here
        int i=1,res=1;
        int n=0;
        String nombre;
        int horas,dia;
        double sueldo;
        System.out.println("Ingrese el numero: ");
        n = imput.nextInt();
        while (n>=1){
            res= res*((n+i)/2);       
            //Contador
            n--;
            i++;
        }
        System.out.println("Resultado: "+res);  
    }       
}
