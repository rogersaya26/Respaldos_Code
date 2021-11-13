
package Logica;


public class main {


    public static void main(String[] args) {
        
        Auto car = new Auto();
        Auto auto1 = new Auto("rojo","lobardini","93","atry23","3");
        Auto auto2 = new Auto("nacar","ford","z24","765tyu","4");
        Auto auto3 = new Auto("rokjo y blanco","chevrolet","impala","b8rt123","4");
        
        car.muestraVacio();
        auto1.muestra();
        auto2.muestra();
        auto3.muestra();
    }
    
    
}
