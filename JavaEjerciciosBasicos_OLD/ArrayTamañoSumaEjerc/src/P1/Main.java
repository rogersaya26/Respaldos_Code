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
        System.out.println("Introduce el tamaño del arreglo: ");
        int tam = sc.nextInt();
        int suma = 0;
        int arr[] = new int[tam];
        System.out.println("Ingrese los numeros enteros para el arreglo: ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
            suma = suma + arr[i];   
        }
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("Numero almacenado: "+arr[i]);
        }
        
        System.out.println("la suma es: "+suma);
        
       
        
        
        
        
    }
    
}
