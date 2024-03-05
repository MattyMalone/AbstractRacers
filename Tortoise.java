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
    
    public String toString()
    {
        String current = "Start:";
        for(int i = 0; i < getTrackLength() - getPosition(); i++)
        {
            System.out.print(" ");
        }
        System.out.print("T");
        for(int i = getPosition(); i < getTrackLength(); i++)
        {
            System.out.print(" ");
        }
        return current;
    }
}