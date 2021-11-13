
package Logica;



public class Gorrion extends Animal implements IVolador {
    
    private int cantPlumas;
    private String colorPlumas;

    @Override
    public void soyAnimal() {
        
        System.out.println("Soy un Animal, Soy un Gorrion");
        
    }

    @Override
    public void volar() {
        System.out.println("hola soy un gorrion y vuelo bajito");
    }
   
    
    
}
