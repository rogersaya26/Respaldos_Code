/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       int a;
       int i=1;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce el numero a autoincrementar ");
       a=sc.nextInt();
       while(i <=a)
       {
           System.out.println(i);
           i++;
       }
       
        
    }
    
}
