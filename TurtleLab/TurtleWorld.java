import java.awt.Color;
import java.util.Random;
public class TurtleWorld
{
   
    public static void main(String [] args)
        throws InterruptedException
    {
        World TurtleWorld = new World();
        Turtle t1 = new Turtle(TurtleWorld);
        Turtle t2 = new Turtle(TurtleWorld);
        Thread.sleep(1000);
        t1.turnRight();
        t1.forward();
        Thread.sleep(1000);
        t2.turnLeft();
        t2.forward();
        Random ranX = new Random();
        Random ranY = new Random();
        int t1X = t1.getXPos();
        int t1Y = t1.getYPos();
        int t2X = t2.getXPos();
        int t2Y = t2.getYPos();
        while(t1.isVisible() == true) {
            if (t1X != ranX.nextInt(500)) {
                
                if (t1Y != ranY.nextInt(500)) {
                    
                    if (t2X != ranX.nextInt(500)) {
                        
                        if (t2Y != ranY.nextInt(500)) {
                            t1.turn(30);
                            Thread.sleep(100);
                            t1.forward(100); 
                            t1Y = t1.getYPos();  
                            t2.turn(30);
                            Thread.sleep(100);
                            t2.forward(100); 
                            t2Y = t1.getYPos(); 
                    
       
        
    }
                t1X = t1.getXPos();
}

}

}

}
}
}