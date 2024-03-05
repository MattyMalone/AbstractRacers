
/**
 * The Pogostick rider hops in place half of the time, but otherwise makes big leaps!
 * 
 *
 * @author (Alex Chui)
 * @version (2024/3/5)
 */
public class Pogostick extends AbstractRacer
{
    public Pogostick(String name)
    {
        super(name);
    }
    
    public void move()
    {
        int bounce = ((int) Math.random() * 10);
        if(bounce == 0)
        {
            setPosition(getPosition() + 5);
        }
        else if (bounce == 1 || bounce == 2)
        {
            setPosition(getPosition() + 4);
        }
        else if(bounce == 3 || bounce == 4)
        {
            setPosition(getPosition() + 3);
        }
        else if (bounce >= 5 || bounce <= 9)
        {
            setPosition(getPosition());
        }
    }
    
    public String toString()
    {
        String current = "Start:";
        for(int i = 0; i < getTrackLength() - getPosition(); i++)
        {
            System.out.print(" ");
        }
        System.out.print("P");
        for(int i = getPosition(); i < getTrackLength(); i++)
        {
            System.out.print(" ");
        }
        return current;
    }
}

