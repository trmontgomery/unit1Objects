import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test1
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL (
            "//4vector.com/i/free-vector-smiling-sun_098908_Smiling_Sun.png");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }

}
