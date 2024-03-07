
/**
 * Write a description of class Hare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hare extends AbstractRacer
{
    private int energy;

  
    public Hare(String name, int energy) 
    {
        super(name);
        this.energy = energy;
    }
    public void move() 
    {
        if (energy > 0) 
        {
            setPosition(getPosition() + ((int)Math.random() * 3));
            energy -= 2; 
        } 
        else 
        {
            energy += 1; 
        }
    }

    /**
    * Overrides the toString method
    */
    public String toString()
    {
        String current = "Start:";
        for(int i = 0; i < getTrackLength() - getPosition(); i++)
        {
            System.out.print(" ");
        }
        System.out.print("H");
        for(int i = getPosition(); i < getTrackLength(); i++)
        {
            System.out.print(" ");
        }
        return current;
    }
}
