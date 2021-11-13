/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

import java.util.Scanner;

/**
 *
 * @author Sayas
 */
public class Principal {
    public static void main(String[]args)
    {
        OperacionesNumericas op = new OperacionesNumericas();
       Scanner sc=new Scanner(System.in);
       System.out.println("introduce un numero: ");
       double n1=sc.nextDouble();
        System.out.println("introduce otro numero: ");
       double n2=sc.nextDouble();
        op.divide(n1, n2);
        op.multiplica(n1,n2);
        op.muestraResultado();
    }
    
}
