/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Sayas
 */
public class Principal {
    public static void main(String[]args)
    {
        //se creA EL objeto de tipo operaciones numericas
     OperacionesNumericas OP =new OperacionesNumericas();  
     OP.PideNumeros();
     OP.suma();
     OP.resta();
     OP.muestraResultado();
     
        
    }
}
