/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


public class PropiedadesPOO {

    
    public static void main(String[] args) {
        
    Persona vector [] = new Persona [4];
    Empleado emple = new Empleado(11111555, "Ingeniero", 5532.20, 11111,"555", "1111", "prueba", "empleado", "hola 123");
    Persona pers = new Persona(58, "123123", "persona", "apellido", "hello 55","555");
    Consultor cons = new Consultor(5895, "Consultoreiror", 5, "1124454", "consult", "apellido","ajklsd","687");  
    
    vector[0] = emple;
    vector[1] = pers;
    vector[2] = cons;
    
    pers.soyPersona();
    emple.soyPersona();
    cons.soyPersona();
    }
    
    
}
