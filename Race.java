
/**
 * Write a description of class Race here.
 *
 * @author (Alex Chui)
 * @version (2024/3/7)
 */



import java.util.ArrayList;
public class Race
{
    private boolean finished;
    private ArrayList<AbstractRacer> Racers; 
    private int distance;
    public Race(int distance)
    {
        this.Racers = new ArrayList<AbstractRacer>();
        this.distance = distance;
        this.finished = false;
    }
    
    public void addRacer(AbstractRacer r)
    {
        Racers.add(r);
    }
    
    public ArrayList<AbstractRacer> getAllRacers()
    {
        return Racers;
    }
    
    public ArrayList<AbstractRacer> update()
    {
        ArrayList<AbstractRacer> winners = new ArrayList<AbstractRacer>();
        for (AbstractRacer r : Racers)
        {
            r.move();
            if (r.getPosition() >= distance)
            {
                winners.add(r);
            }
        }
        return winners;
    }
    
    public int getDistance()
    {
        return distance;
    }
    
    public boolean isFinished()
    {
        return finished;
    }
}


