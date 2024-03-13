
/**
 * Write a description of class Hare here.
 *
 * @author (Alex Chui)
 * @version (2024/3/12)
 */
public class Hare extends AbstractRacer 
{
    private int energy;
    

    public Hare(String name) 
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
    
}