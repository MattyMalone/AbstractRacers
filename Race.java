
/**
 * Write a description of class Race here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Race
{
    ArrayList<AbstractRacer> Racers; 
    private int distance;
    public Race(ArrayList<AbstractRacer> Racers)
    {
        this.Racers = new ArrayList<AbstractRacer>();
        this.Racers = Racers;
        this.distance = 40;
    }
    
    public void update()
    {
        for(AbstractRacer john : Racers)
        {
            john.move();
        }
        for(AbstractRacer john : Racers)
        {
            System.out.printf("%s |", john.getName());
            john.toString();
            System.out.println();
        }
    }
    public int getDistance()
    {
        return distance;
    }
    public void addRacer(AbstractRacer racer)
    {
        Racers.add(racer);
    }
    public ArrayList<AbstractRacer> getRacers()
    {
        return Racers;
    }
    public boolean raceOver()
    {
        for(AbstractRacer john : Racers)
        {
            if(john.getPosition() >= distance)
            {
                return true;
            }
        }
        return false;
    }
    public ArrayList<AbstractRacer> getWinner()
    {
        ArrayList<AbstractRacer> johnson = new ArrayList<AbstractRacer>();
        for(int i = 0; i < Racers.size(); i++)
        {
            if(Racers.get(i).getPosition() >= distance)
            {
                johnson.add(Racers.get(i));
            }
        }
        return johnson;
    }
}
