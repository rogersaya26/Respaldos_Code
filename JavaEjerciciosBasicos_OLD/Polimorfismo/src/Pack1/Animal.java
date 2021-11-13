/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

/**
 *
 * @author Sayas
 */
public class Animal extends SerVivo{
    
     String tipo;
    public Animal(String ti)
    {
        tipo=ti;
    }
    
    public void Alimentarse()
    {
        System.out.println("Soy una Animal, me estoy alimentando"+"Soy un "+tipo); 
    }
    
}
