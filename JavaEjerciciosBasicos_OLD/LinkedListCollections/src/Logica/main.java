/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sayas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        Persona per1 = new Persona("hola", "chau", 16);
        Persona per2 = new Persona("auron", "play", 32);
        Persona per3 = new Persona("el", "rubius", 31);

        
        lista.add(per1);
        lista.add(per3);
        lista.add(0,per2);

            /*Primera forma de recorrer*/
    for (Persona per : lista) {/*por cada persona de esta lista hacer lo siguiente*/
    
            System.out.println("Nombre: " + per.getNombre());
}
    
    /*Segunda forma de recorrer*/
    
    for (int i=0; i<lista.size(); i++) {
        System.out.println("Nombre: " + lista.get(i).getNombre());
    }      
        
}

}
