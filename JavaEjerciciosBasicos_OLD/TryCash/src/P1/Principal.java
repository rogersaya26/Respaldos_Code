/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

public class Principal {

    public static void main(String[] args) {
      
        int[] miArreglo=new int[5];
        
        
        try
        {
        System.out.println(miArreglo[-2]);
        int num=0;
        int division=100/num;
        }
        catch(ArrayIndexOutOfBoundsException exception)
                {
                    System.out.println("error al intentar dividir el numero enre cero");  
                    
                }
                
        catch(ArithmeticException exception)
        {
            System.out.println("se intentó acceder a un indice incorrecto del arreglo");         
        }
        
        
        
        
    }
    
}
