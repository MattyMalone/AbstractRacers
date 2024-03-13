/**
 * The tortoise class builds a tortoise which inherits from the AbstractRacer
 * class
 * 
 * @author (Alex Chui)
 * @version (2024/3/4)
 */
public class Tortoise extends AbstractRacer 
{
    public Tortoise(String name) 
    {
        super(name);
    }

    public void move() 
    {
        setPosition(getPosition() + 1);
    }
    
}