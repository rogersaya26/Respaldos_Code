/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotutorial;

/**
 *
 * @author Sayas
 */
public class Calcular {
    
    public static int factorial(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact*=n--; //fact=fact*n--;
        }
        return fact;
        
    }
    
}
