
/**
 * Write a description of class RaceRuner here.
 *
 * @author (Alex Chui)
 * @version (2024/3/5)
 */
import java.util.ArrayList;
public class RaceRunner 
{
    public static void main(String[] args) 
    {
        ArrayList<AbstractRacer> Racers = new ArrayList<AbstractRacer>();
        Hare Jumpee = new Hare("Jumpee", 10);
        Tortoise Sluggo = new Tortoise("Sluggo");
        Pogostick Pogo = new Pogostick("Pogo");
        Race daytona = new Race(Racers);
        daytona.addRacer(Sluggo);
        daytona.addRacer(Jumpee);
        daytona.addRacer(Pogo);
        System.out.println("The race: ");

        for (int i = 0; i < 5; i++) 
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
