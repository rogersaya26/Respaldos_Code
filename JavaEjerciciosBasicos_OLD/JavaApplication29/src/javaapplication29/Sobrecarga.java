/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;


public class Sobrecarga {
    
    public void operaciones()
    {
        System.out.println("no estas realizando niunguna operacion");
    }
    
    public void operaciones(int num1,int num2)
    {
        System.out.println("Metodo con dos parametros tipo int");
        System.out.println(num1+num2);
    }
    
    public void operaciones(double num1,double num2)
    {
        System.out.println("Metodo con dos parametros tipo double");
        System.out.println(num1+num2);
    }
    public void operaciones(int num1,int num2, int num3)
    {
        System.out.println("Metodo con tres parametros tipo int");
        System.out.println(num1+num2+num3);
        
    }
    
}
