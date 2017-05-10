/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifcedu;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class VerifCedu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner datos = new Scanner(System.in);
        
        //Creo variables para pedir por consola los datos 

        String cedula;
        int suma = 0, n = 2, res, N;
        
        //Ingreso de datos
        do {
            System.out.print("Ingrese un numero de cedula: ");
            cedula = datos.next();
        } while (cedula.length() != 10);

        //Proceso para comprobar cedula
        for (int i = 0; i < cedula.length() - 1; i ++) {
            
            N = ((cedula.charAt(i)) - 48) * n;
            if (N >= 10)  {
                suma += (Integer.toString(N).charAt(0) - 48 + Integer.toString(N).charAt(1) - 48);
            } else {
               suma += N; 
            }if (n == 2) {
                n = 1;
            } else {
                n = 2;
            }
            
        }
        
        //Transformar al superior y restar
        res = (int)(suma - (suma % 10) + 10);
        
        //Presentacion de datos
        if ((res - suma) == (cedula.charAt(9)) - 48){
            System.out.println("Numero de cedula valido");
        } else {
            System.out.println("Numero de cedula invalido");
        }
      
        
    }
    
}
