/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author Sayas
 */
public class OperacionesNumericas {
    
    double division,multiplicacion;
    
    public void divide(double num1, double num2)
    {
        division=num1/num2;
    }
    
    public void multiplica(double num1, double num2)
    {
        multiplicacion=num1*num2;
    }
    
    public void muestraResultado()
    {
        System.out.println("la division es: "+division);
        System.out.println("la multiplicacion es: "+multiplicacion);
    }
    
    
}
