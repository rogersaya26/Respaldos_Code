
package Pack1;


public class Principal {
    
    public static void main(String[]args)
    {
        System.out.println("Inicia Metodo Main");
        Ventana v1=new Ventana(50, 50, 400, 400);
        v1.mostrarInformacion();
        v1.modificarDimensiones(100, -50);
        v1.mostrarInformacion();
        
     
        OtraVentana nueva=new OtraVentana(100,50,400,450,"titulo de la Nueva Ventana");
        nueva.mostrarInformacion();
        nueva.desplazaVentana(200, 200);
        nueva.mostrarInformacion();
    }
}
