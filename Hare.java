
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
            setPosition(getPosition() + ((int)(Math.random() * 3) + 1));
            energy -= 2;
        } 
        else 
        {
            energy += 1;
        }
    }
    public String getType() 
    {
        return "H";
    }   
    public String toString() 
    {
        String track = getName() + " | ";
        for (int i = 0; i < getPosition(); i++) 
        {
            track += " ";
        }
        track += "H";
        return track;
    }
}