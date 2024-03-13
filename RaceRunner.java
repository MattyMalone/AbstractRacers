
/**
 * Write a description of class RaceRuner here.
 *
 * @author (Alex Chui)
 * @version (2024/3/5)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class RaceRunner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int currentBalance = 1000; 
        
        System.out.println("Welcome to the racetrack! Bets are always 500 dollars. If you win, double your money!");
        System.out.println("How long would you like the race to be?");
        int distance = in.nextInt();
        
    }
    
    public static void race(int distance, int currentBalance)
    {
        int newBalance = 0;
        Scanner in = new Scanner(System.in);
        Race race = new Race(distance);
        ArrayList<AbstractRacer> winners = new ArrayList<AbstractRacer>();
        boolean raceFinished = false;
        race.addRacer(new Tortoise("Sluggo"));
        race.addRacer(new Hare("Jumpy"));
	race.addRacer(new Pogostick("Pogo"));
	System.out.println("The three racers are:");
	for (int i = 0; i < race.getAllRacers().size(); i++)
		{
			System.out.println(race.getAllRacers().get(i).toString());
		}
        System.out.print("\n");
        
        System.out.println("Who will you bet on? (1 for Sluggo, 2 for Jumpy, and 3 for Pogo)");
        int bet = in.nextInt();
        
        while (!raceFinished)
        {
            winners = race.update();
            if (winners.size() >= 1)
            {
		raceFinished = true;
		System.out.println("The Race is over!");
            }
        }
        
        if (winners.size() == 1)
        {
            System.out.println("The winner is: ");
            for (AbstractRacer r : winners)
            {
                System.out.println(r.toString() + "\n");
                if (bet == r.getRacerNum())
                {
                    newBalance = currentBalance * 2;                    
                }
            }
        }
        else
        {
            System.out.println("It's a tie! The winners are:");
            for (AbstractRacer r : winners)
            {
                System.out.println(r.toString() + "\n");
                if (bet == r.getRacerNum())
                {
                    newBalance = currentBalance * 2;
                }
            }
        }
        
        if(newBalance > currentBalance)
        {
            System.out.println("Congratulations on winning! Hope you come back soon!");
        }
        else
        {
            System.out.println("Better luck next time!");
        }
    }
    
}
