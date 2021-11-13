/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Scanner;
public class ClaseMain {

    
    public static void main(String[] args) {
       
       int i,num,contador=0;
       int arreglo[]=new int[10];
       Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los numero: ");
        for (i = 0; i < 10; i++) 
        {
            num=sc.nextInt();
            arreglo[i]=num;
            if (num<6)
            {
                break;
            }
        }
        System.out.println("a finalizado el ciclo for con break");
        System.out.println("Valores que capturastes: ");
        for (i = 0; i < contador; i++) {
            if (arreglo[i]>=6)
            System.out.println(arreglo[i]);
                    
            
            
        }
        
        
        
        /*for (int i = 0; i < 5; i++)
        {
          if(i==3)
          {
              break;
          }
            System.out.println(i);       
                     
        }
        System.out.println("el programa finalizo");
        
      */  
    }
    
}
