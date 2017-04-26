/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1.java.pkg3;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Clase1Java3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        // TODO code application logic here
        int i=1,res=0;
        int n=0;
        String nombre;
        int horas,dia;
        double sueldo;
        System.out.println("Ingrese el numero de empleados: ");
        n = imput.nextInt();
        while (i<=n){
            System.out.println("Empleado "+i+" Nombre: ");
            nombre = imput.next();
            System.out.println("Empleado "+i+" Horas de trabajo por dia: ");
            horas=imput.nextInt();
            dia=horas*15;
            sueldo =dia*20;
            System.out.println("Empleado "+i+" Su sueldo es:"+sueldo);
            //Contador
            i++;
        }
        }
    }
