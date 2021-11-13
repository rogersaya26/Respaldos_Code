/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import java.util.Scanner;
/**
 *
 * @author Sayas
 */
public class OperacionesNumericas {
    double num1,num2,suma,resta;
    
    public void PideNumeros() //metodo sin retornos ni parametros
    {
        System.out.println("se ejecuta metodo PideNumeros");
       Scanner ob = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1=ob.nextDouble();
        System.out.println("Ingrese otro numero");
        num2=ob.nextDouble();
    }
    //metodos para sumar los numeros
    
    public void suma()
    {
       System.out.println("se ejecuta metodo suma");
        suma=num1+num2;
        
    }
    
    public void resta()
    {
        System.out.println("se ejecuta metodo resta");
        resta=num1-num2;
    }
    //metodo que visualice los datos resultados en pantalla
    public void muestraResultado()
    {
        System.out.println("se ejecuta metodo muestraResultado");
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
    }
       
    
}
