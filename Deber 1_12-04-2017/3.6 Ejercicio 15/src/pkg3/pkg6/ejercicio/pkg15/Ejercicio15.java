/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg15;

import java.util.Scanner;

/**
 *
 * @author Luis Ortiz
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double valor_dolares;
        double dolar_yenes, dolar_pesetas, dolar_libras, dolar_marcos;
        double valor_yenes, valor_pesetas, valor_libras, valor_marcos;
        
        //Solicitud de valores al usuario 
        System.out.print("Ingrese el valor de la compra en dolares: ");
        valor_dolares= datos.nextDouble();
        System.out.print("Ingrese el costo de un dolar en: \n-Yenes:");
        dolar_yenes = datos.nextDouble();
        System.out.print("-Pesetas:");
        dolar_pesetas = datos.nextDouble();
        System.out.print("-Libras esterlinas: ");
        dolar_libras = datos.nextDouble();
        System.out.print("-Marcos: ");
        dolar_marcos = datos.nextDouble();
        
        // Operaciones
        valor_yenes = valor_dolares * dolar_yenes;
        valor_pesetas = valor_dolares *dolar_pesetas;
        valor_libras = valor_dolares *dolar_libras;        
        valor_marcos = valor_dolares *dolar_marcos;
        
        // Se muestra el resultado
        System.out.print("La cantidad a pagar en: \n-Yenes es de: "+valor_yenes+"\n");
        System.out.print("-Pesetas es de: "+valor_pesetas+"\n");
        System.out.print("-Libras esterlinas es de: "+valor_libras+"\n");
        System.out.print("-Marcos es de: "+valor_marcos);
    }
    
}
