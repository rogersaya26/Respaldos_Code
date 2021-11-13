/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.Scanner;
//atributos variables
public class DatosPersonas {
    String nombre,estadoCivil;
    int edad;
    
    
    public void leeDatos()
    
            {
     Scanner teclado = new Scanner(System.in);
                System.out.println("se a ejecutado el metodo lee datos");
                System.out.println("Ingrese su nombre: ");
                nombre=teclado.nextLine();
                System.out.println("Ingrese la edad: ");
                edad=teclado.nextInt();
                System.out.println("Ingrese estado civil: ");
                estadoCivil=teclado.next();       
            }      
    public void MostarDatos()
    {
        System.out.println("se ejecuta metodo MostarDatos");
        System.out.println("el nombre es: "+nombre);
         System.out.println("la edad es: "+edad);
          System.out.println("el estado civil es: "+estadoCivil);
    }
            
}
