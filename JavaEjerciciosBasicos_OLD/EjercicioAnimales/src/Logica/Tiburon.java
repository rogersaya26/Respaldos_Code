
package Logica;


public class Tiburon extends Animal implements IAcuaticos {
    
    private int cantDientes;
    private String tipoDeMordida;

    @Override
    public void soyAnimal() {
        
        System.out.println("Soy un animal, Soy un Tiburon");
        
    }

    @Override
    public void nadar() {
        
        System.out.println("soy un tiburon y nado debajo del agua");
    }
   
    
}
