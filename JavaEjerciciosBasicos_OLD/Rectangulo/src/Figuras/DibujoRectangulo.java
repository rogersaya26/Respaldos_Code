
package Figuras;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DibujoRectangulo extends JPanel {
    
    public DibujoRectangulo()
    {
        setBackground(Color.WHITE);
        
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        int anchoRect=100;
        int altoRect=200;
        g.drawRect(100, 100, anchoRect, altoRect);
        g.setColor(Color.RED);
        
    }
    
    
    
    
}
