
package Pack1;
import java.util.ArrayList;
public class Extra {
    
    ArrayList<SerVivo> lista = new ArrayList();
    
    public Extra()
    {
        lista.add(new Animal("Felino"));
        lista.add(new Animal("Pez"));
        lista.add(new Humano("Femenino"));
        lista.add(new Humano("Masculino"));
        lista.add(new Planta("Flor"));
        lista.add(new Planta("Cactus"));
        lista.add(new Planta("Carnivora")); 
    }   
    public void invocar()
    {
        for(SerVivo sb:lista)
        {
            sb.Alimentarse();
        }
    }
                
    public static void main(String[] args) {
     Extra  e= new Extra();
     e.invocar();
        
        
    }
            
            
            
    
    
    
}
