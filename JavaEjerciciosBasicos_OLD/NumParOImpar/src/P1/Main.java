/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int v=sc.nextInt();
        if(v%2==0)
        {
            System.out.println(v+" es par");
        }
       else
        {
            System.out.println(v+" es impar");
        }
    
    }
    
}
