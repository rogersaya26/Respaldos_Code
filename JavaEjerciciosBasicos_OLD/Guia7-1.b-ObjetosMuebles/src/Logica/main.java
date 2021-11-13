
package Logica;



public class main {

   
    
    public static void main(String[] args) {
    
        Mueble mueble1 = new Mueble(123, "mesa redonda", 0.60, 0.90, "fibra", 3);
        Mueble mueble2 = new Mueble(345, "silla redonda", 0.40, 0.60, "plastico", 8);
        Mueble mueble3 = new Mueble(678, "sillon", 0.80, 0.90, "metal", 6);

        System.out.println("el nombre es: " + mueble1.getNombre() + " el material utilizado es: " + mueble1.getMaterial());
        System.out.println("el nombre es: " + mueble2.getNombre() + " el material utilizado es: " + mueble2.getMaterial());
        System.out.println("el nombre es: " + mueble3.getNombre() + " el material utilizado es: " + mueble3.getMaterial());
        
        mueble1.setMaterial("madera");
        mueble2.setMaterial("madera");
        mueble3.setMaterial("madera");
        
        System.out.println("el nombre es: " + mueble1.getNombre() + " el material utilizado final: " + mueble1.getMaterial());
        System.out.println("el nombre es: " + mueble2.getNombre() + " el material utilizado final: " + mueble2.getMaterial());
        System.out.println("el nombre es: " + mueble3.getNombre() + " el material utilizado final: " + mueble3.getMaterial());
        
        
    }
    
}
