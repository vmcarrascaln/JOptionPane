/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Estudiante
 */
public class SimpleFrame {

    public static void main(String[] args) {
     JFrame frame = new JFrame();
     // Tomado de https://www.w3.org/Icons/32x32/caution.gif
     Image icon = Toolkit.getDefaultToolkit().getImage("caution.gif");
     frame.setIconImage(icon);
     JPanel panel = (JPanel) frame.getContentPane();
     panel.setBackground(Color.WHITE);
     frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
     frame.setSize(new Dimension(300,120));
     frame.setLayout (new FlowLayout());
     
     frame.setLayout(new GridLayout(2,3));
     for(int i = 1; i<=6; i++){
         frame.add(new JButton("Button" + 1));
     }
     //Cerrando la ventana
     Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
     frame.setLocation(dim.width/2-frame.getSize().width/2, 
             dim.height/2-frame.getSize().height/2);
     frame.setTitle("A frame");
     
     JButton button1 = new JButton(); 
     button1.setText("I'm a button.");
     button1.setBackground(Color.BLUE);
     frame.add(button1);
     
     
     
     JButton button2 = new JButton();
     button2.setText("Click me!");
     button2.setBackground(Color.RED);
     frame.add(button2);
     
     
     frame.setVisible(true);
     
    }
    
}
