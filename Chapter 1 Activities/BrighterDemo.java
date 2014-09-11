import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class BrighterDemo
{
   
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(6,9,8);
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0)
        System.out.println(box);
     
    }

}
