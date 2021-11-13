
package Persistencia;

import Logica.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PersonaJpaController persoJpa = new PersonaJpaController ();
    
   public void crearPersona (Persona per) {
       
        try {
            persoJpa.create(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
}
