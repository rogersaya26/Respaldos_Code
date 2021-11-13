
package Pack1;


public class Ventana {
    
    protected int posX,posY,ancho,alto;
    
    public Ventana(int x, int y, int a, int h)
    {
        posX=x;
        posY=y;
        ancho=a;
        alto=h;
        System.out.println("declaracion de variables de ventana Constructor");
    }
  
    public void mostrarInformacion()
    {
        System.out.println("metodo mostrar informacion dentro de Ventana");
        System.out.println("Posicion en x: "+posX);
        System.out.println("Posicion en y: "+posY);
        System.out.println("ancho: "+ancho);
        System.out.println("alto: "+alto);     
    }
    
    public void modificarDimensiones(int cambioAncho, int cambioAlto)
    {
        System.out.println("Metodo modificaDimensiones dentro de ventana");
        System.out.println("Dimensiones Modificadas: ");
       //ancho = 200
        ancho+=cambioAncho; //ancho=ancho+cambioAncho;
        alto+=cambioAlto;   //alto=alto+cambioAlto;   
    }
       
}
