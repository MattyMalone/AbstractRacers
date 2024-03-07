
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
        for(int i = 0; i < daytona.getDistance(); i++)
        {
            daytona.update();
            if(daytona.raceOver())
            {
                if(daytona.getWinner().size() > 1)
                {
                    System.out.println("There was multiple winners: ");
                    for(int x = 0; x < daytona.getWinner().size(); x++)
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
        }
        
        
    
    }
    public static void output()
    {
        
    }
}
