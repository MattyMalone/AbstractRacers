
/**
 * The Pogostick rider hops in place most of the time, but otherwise makes big leaps!
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
        else if (bounce == 1)
        {
            setPosition(getPosition() + 4);
        }
        else if(bounce == 2)
        {
            setPosition(getPosition() + 3);
        }
        else if (bounce >= 3 || bounce <= 9)
        {
            setPosition(getPosition());
        }
    }
    
    
}
