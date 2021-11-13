
package Logica;


public class Pato extends Animal implements IVolador, IAcuaticos {

    private int cantKmNada;
    private int cantKmCamina;
    
    @Override
    public void soyAnimal() {
        
        System.out.println("Soy un animal, Soy un Pato");
    }

    @Override
    public void volar() {
        System.out.println("Soy un pato y vuelo al ras del agua");
    }

    @Override
    public void nadar() {
        
        System.out.println("soy un pato y nado sobre el agua");
    }
    
    
}
