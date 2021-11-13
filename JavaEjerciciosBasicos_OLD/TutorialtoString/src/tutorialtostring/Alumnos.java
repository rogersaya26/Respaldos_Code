/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialtostring;

/**
 *
 * @author Sayas
 */
public class Alumnos {
    
    private String nombre,id; 
     private int       edad;
     
     public Alumnos(String nom, int ed, String i)
     {
         nombre=nom;
         edad=ed;
         id=i;
     }
     public String toString()
     {
         return "nombre:"+nombre+"---"+"Edad:"+edad+"---"+"id:"+id;
     }
            
}
