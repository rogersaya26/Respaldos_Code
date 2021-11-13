
package Logica;
import java.util.List;
import java.util.ArrayList;

public class main {

  
    public static void main(String[] args) {
        
      List<Persona> lista = new ArrayList<Persona>();  
        
      Persona per1 = new Persona("hola", "chau", 16);
      Persona per2 = new Persona("auron", "play", 32);
      Persona per3 = new Persona("el", "rubius", 31);
      
      lista.add(per2);
      lista.add(per1);
      lista.add(per3);
    
    
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
