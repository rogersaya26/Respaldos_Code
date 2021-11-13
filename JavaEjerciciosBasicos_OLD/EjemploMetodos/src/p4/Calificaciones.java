/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.util.Scanner;
/**
 *
 * @author Sayas
 */
public class Calificaciones {
   
    double arregloCalif[]=new double[5];
    
public void pideCalificaciones()
{
    //metodo que no devuelve nada ni tiene parametro
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese las 5 calificaciones: ");
    
    for (int i=0;i<5;i++) 
    {
    arregloCalif[i]=sc.nextDouble();
    
    } 
}

public void mostrarCalificaiones()
{
    int j=0;
    System.out.println("Las calificaiones son: ");
    while(j<5)
    { 
        System.out.println(arregloCalif[j]);   
        j++;
    }    
    }
   
}
