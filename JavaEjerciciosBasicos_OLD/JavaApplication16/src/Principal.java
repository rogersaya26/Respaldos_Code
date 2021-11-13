/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayas
 */
public class Principal {
    
    
    public static void main(String[]args)
    {
        //crear instancias de class 
        
        Coche c1=new Coche(); // Primer objeto de tipo coche
        Coche c2=new Coche();
        c1.color="Rojo";
        c1.precio=40000;
        c1.modelo="RT6246WW";
        c2.color="Verde";
        c2.precio=100000;
        c2.modelo="R45GTY34";
        Coche c3=new Coche();
        c3.color="Verde";
        c3.precio=20000;
        c3.modelo="GT436PT";
        System.out.println("Modelo "+c1.modelo);
        System.out.println("Color "+c1.color);
        System.out.println("Precio "+c1.precio);
        
        
    }
}
