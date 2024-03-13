
/**
 * The abstract class AbstractRacer is used to describe a participant
 * in a race. The abstract method move() is defined differently
 * according to each different subclass that inherits from Racer.
 */
public abstract class AbstractRacer
{
    // instance variables
    private String name;
    private int position;
    private int racerNum;
    /**
    * Constructs an object according to the subclass
    * that inherits from Racer. (You can't construct an
    * actual Racer object because it's abstract. Go ahead,
    * try it!)
    */
    public AbstractRacer(String name)
    {
        this.name = name;
        this.position = 0;
        this.racerNum = 0;
        racerNum++;
        
    }
    
    public abstract void move();
    
    public String toString()
    {
        return "Racer[name: " + name + ", position: " + position + ", number: " + racerNum + "]"; 
    }
    
    
    public int getPosition()
    {
        return position;
    }
    
    public void setPosition(int position)
    {
        this.position = position;
    }
    
    public int getRacerNum()
    {
        return racerNum;
    }
}