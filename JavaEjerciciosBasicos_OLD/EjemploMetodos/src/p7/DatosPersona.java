/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author Sayas
 */
public class DatosPersona {
    
    String nombre; //atributo de la clase
    
    //metodo para darle nombte a una persona
    public void dameNombre(String nom) //parametro del metodo
    {
        nombre=nom;
    }
    public String devuelveNombre()
    {
        return nombre;
    }
    
}
