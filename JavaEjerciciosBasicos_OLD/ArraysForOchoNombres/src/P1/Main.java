/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;
import java .util.Scanner;
public class Main {

    public static void main(String[] args) {
       
        String array[] = new String[8];
        Scanner sc = new Scanner(System.in);
        String nom;
        int j;
        System.out.println("Ingrese 8 nombres: ");
        for ( j = 0; j < 8; j++) 
        {
            nom=sc.nextLine();
            array[j]=nom;
        }
        
        System.out.println("Los 8 nombres ingresados son: ");
        for ( j = 0; j < 8; j++) 
        {
            System.out.println(array[j]);
            
        }
        
           
        
      
    }
    
}
