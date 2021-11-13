
package GraficosPaquetes;

import java.awt.*;
import javax.swing.*;




public class Ventana2 extends JFrame {
    
    public Ventana2()
    {
        super("Titulo de mi Ventana");
        setSize(300,300);//metodo de la clase window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container miPanel = getContentPane();
        miPanel.setLayout(new FlowLayout());
        JButton boton=new JButton("Soy Botón");
        miPanel.add(boton);
        JButton boton2=new JButton("Otro botton");
        miPanel.add(boton2);
        JButton boton3 = new JButton("botton 3");
        miPanel.add(boton3);
        JLabel texto = new JLabel("Texto");
        miPanel.add(texto);
        JTextField etiqueta=new JTextField(20);
        miPanel.add(etiqueta);
        
        
        
        
        
    }
    
    
    
}
