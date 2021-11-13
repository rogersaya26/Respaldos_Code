
package Pack1;

import java.math.BigDecimal;


public class CalcularPICuadrado 
{
    public void CalcularPIALCuadrado()
    {
        double pi = 3.1416;
        double piPARACuadrado = pi * pi;
        System.out.println("este metodo CalcularPIALCuadrado de la clase CalcularPICuadrado");
        System.out.println("el resultado es " +piPARACuadrado);
       
    }
    
    public BigDecimal CalcularAreaCirculo(BigDecimal radio)
    {
    BigDecimal areaCirculo;
    BigDecimal pi = new BigDecimal("3.141592653558979323");
        System.out.println("Radio (Objeto Big Decimal)"+radio );
        System.out.println("constante de pi: "+pi);
    radio = radio.multiply(radio);//r=r*r = R^2Radio al cuadrado
        System.out.println("radio al cuadrado: "+radio);
    
        areaCirculo= radio.multiply(pi);//pi*r^2;
        return areaCirculo;
    
    }
    
    
    
  
    
    
}
