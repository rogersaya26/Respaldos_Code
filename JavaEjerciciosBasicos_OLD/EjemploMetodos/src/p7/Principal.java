/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import javax.swing.JOptionPane;

/**
 *
 * @author Sayas
 */
public class Principal {
    
    public static void main(String[]args)
    {
        String n;
        DatosPersona dp=new DatosPersona();
        n=JOptionPane.showInputDialog("ingresa un Nombre: ");
        dp.dameNombre(n);
       JOptionPane.showMessageDialog(null,"el nombre es: "+dp.devuelveNombre());
        System.out.println("el nombre es: "+dp.devuelveNombre());
    }
    
}
