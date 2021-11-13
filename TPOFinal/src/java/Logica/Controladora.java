
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
     
    ControladoraPersistencia controlpersis = new ControladoraPersistencia ();
    
    public void crearPersona(String dni, String nombre, String apellido, String direccion, String profesion, String tipoHabitacion, String cantPersona) {
        
        Persona perso = new Persona ();
        perso.setDni(dni);
        perso.setNombre(nombre);
        perso.setApellido(apellido);
        perso.setDireccion(direccion);
        perso.setProfesion(profesion);
        perso.setTipohabitacion(tipoHabitacion);
        perso.setCantpersona(cantPersona);
    
        controlpersis.crearPersona(perso);
        
    }
    
    
}
