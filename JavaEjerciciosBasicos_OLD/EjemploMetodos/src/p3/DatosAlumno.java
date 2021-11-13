/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import javax.swing.JOptionPane;

public class DatosAlumno 
{
   
    String nombre;
    double calificacion;
    
    public void PideDatos()
    {
       nombre=JOptionPane.showInputDialog("ingrese el nombre: ");
       calificacion=Double.parseDouble(JOptionPane.showInputDialog("ingrese la calificacion: "));
       
    }
    
    public void estado()
    {
        if(calificacion >=6)
        {
            JOptionPane.showMessageDialog(null,"El alumno Aprobó");
        }
          else
        {
            JOptionPane.showMessageDialog(null,"el alumno Reprobó");
        }
            
     }
    
    public void muestraDatos()
    {
        JOptionPane.showMessageDialog(null,"El nombre es: "+nombre);
        JOptionPane.showMessageDialog(null,"la calificacion es: "+calificacion);
    }
    
    
}
    

