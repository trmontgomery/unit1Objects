import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random roll = new Random();
        System.out.println(roll.nextInt(6)+1);
    }

}
