package Logica;

import java.util.List;

public class ControladoraUser {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    public boolean verificarUsuario (String usuario, String contra) { 
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
    
        if (listaUsuarios != null){
            
            for(Usuario usu : listaUsuarios) {
                
                if(usu.getNombreUsuario().equals(usuario) && usu.getConstrasenia().equals(contra)) 
                {
                    
                    return true;
                }
        }
        
    }
    return false;
}

    
}
