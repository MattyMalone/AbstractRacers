
/**
 * Write a description of class RaceRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class RaceRunner 
{
    public static void main(String[] args) 
    {
        ArrayList<AbstractRacer> Racers = new ArrayList<AbstractRacer>();
        Hare Jumpee = new Hare("Jumpee", 10);
        Tortoise sluggo = new Tortoise("sluggo");
        Race daytona = new Race(Racers);
        daytona.addRacer(sluggo);
        daytona.addRacer(Jumpee);
        System.out.println("The race: ");

        for (int i = 0; i < daytona.getDistance(); i++) 
        {
            daytona.update();
            if (daytona.raceOver()) 
            {
                if (daytona.getWinner().size() > 1) 
                {
                    System.out.println("There were multiple winners: ");
                    for (int x = 0; x < daytona.getWinner().size(); x++) 
                    {
                        System.out.println(daytona.getWinner().get(x).getName());
                    }
                } 
                else 
                {
                    System.out.println("The winner is: ");
                    System.out.println(daytona.getWinner().get(0).getName());
                }
            }
            // Delay for visibility
            try 
            {
                Thread.sleep(500); // Adjust the delay time as needed (in milliseconds)
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static void clearScreen() 
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}

