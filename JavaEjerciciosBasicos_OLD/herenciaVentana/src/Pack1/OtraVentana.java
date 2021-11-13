
package Pack1;

public class OtraVentana extends Ventana
{
protected String titulo;

public OtraVentana(int x, int y, int ancho, int alto, String tit)
{ 
super(x,y,ancho,alto);
titulo= tit;
System.out.println("OtraVentana extends Ventana es constructor");
}

public void desplazaVentana(int cambioX, int cambioY)
{
    System.out.println("metodo desplazaventana dentro de otraventana");
    posX+=cambioX;  //posX=posX+cambioX;
    posY+=cambioY;
}
//redefinir el metodo con super cargado viene cargada de la clase padre

public void mostrarInformacion()
{
    System.out.println("metodo mostrarInformacion dentro de otraventana");
    super.mostrarInformacion();
    System.out.println("Titulo: "+titulo);
    
}
    
}
