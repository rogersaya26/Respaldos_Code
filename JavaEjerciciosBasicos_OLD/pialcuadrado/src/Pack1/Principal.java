/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.math.BigDecimal;

/**
 *
 * @author Sayas
 */
public class Principal {
    
    public static void main(String [] args)
    {
        CalcularPICuadrado c1 = new CalcularPICuadrado();
        c1.CalcularPIALCuadrado();
       
        CalcularPICuadrado c2 = new CalcularPICuadrado();
        c2.CalcularPIALCuadrado();
    
        BigDecimal radio = new BigDecimal(87.5698);
        BigDecimal areaCirculo;
        areaCirculo = c2.CalcularAreaCirculo(radio);
        System.out.println("area del circulo (pi*r^2)= "+areaCirculo);
    
        
        
        
    }
}
