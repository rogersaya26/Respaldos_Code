/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        
       
        String dia;
        int n;
        
        do
        {
        System.out.println("Ingrese Dia de la semana, Numero del 1 al 7");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        
        switch(n)
        {
                case 1:
               dia="Lunes";
                break;
                
                case 2:
               dia="Martes";
                break;
                
                case 3:
               dia="Miercoles";
                break;
                
                case 4:
               dia="Jueves";
                break;
                
                case 5:
               dia="Viernes";
                break;
                
                case 6:
               dia="Sabado";
                break;
                
                case 7:
               dia="Domingo";
                break;
                
                default:
                    dia="Dia incorrecto. Debe ser del 1 al 7 ";
                    
                
        }
        
        }
        while (n<=0 || n>=7);
        System.out.println("El dia es: "+dia);
        
       
        
    }
    
}
