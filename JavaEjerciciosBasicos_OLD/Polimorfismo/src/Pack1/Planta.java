
package Pack1;


public class Planta extends SerVivo {
    
    String tipo;
    public Planta(String ti)
    {
        tipo=ti;
    }
    
    public void Alimentarse()
    {
        System.out.println("Soy una planta, me estoy alimentando"+"soy de una planta de tipo"+tipo); 
    }
    
}
