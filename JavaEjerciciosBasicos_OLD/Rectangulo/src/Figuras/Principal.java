package Figuras;
import javax.swing.JFrame;
public class Principal {

    public static void main(String[] args) {
       
        DibujoRectangulo dib=new DibujoRectangulo();
        JFrame ventana=new JFrame();
        ventana.add(dib);
        ventana.setSize(400,400);
        ventana.setVisible(true);
        
        
        
    }
    
}
