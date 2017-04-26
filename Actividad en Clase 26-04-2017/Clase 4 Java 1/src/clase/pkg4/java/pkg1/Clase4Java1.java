/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4.java.pkg1;

/**
 *
 * @author Salas
 */
public class Clase4Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,res=0;
        
        
        while (i<=12){
            //Procesos
            res=i%2;
            if(res==0){
                System.out.println(i+" es par");
            }else{ 
                System.out.println(i+" es impar");
            }
            //Contador
            i++;
        }
    }
}   
