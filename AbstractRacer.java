
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
    private int tracklength;
    /**
    * Constructs an object according to the subclass
    * that inherits from Racer. (You can't construct an
    * actual Racer object because it's abstract. Go ahead,
    * try it!)
    */
    public AbstractRacer(String name)
    {
        this.name = name;
        position = 0;
        tracklength = 14;
    }
    /**
    * The abstract method move() must be defined by
    * subclasses.
    */
    public abstract void move();
    /**
    * Overrides the toString method
    */
    public String toString()
    {
        String current = "Start:";
        for(int i = 0; i < tracklength - position; i++)
        {
            System.out.print(" ");
        }
        System.out.print("R");
        for(int i = position; i < tracklength; i++)
        {
            System.out.print(" ");
        }
        return current;
    }
    /**
    * The getPosition() method returns the current position
    * of the racer.
    */
    public int getPosition()
    {
        return position;
    }
    
    
    /**
     * returns track length
     */
    public int getTrackLength()
    {
        return tracklength;
    }
   
    /**
    * The setPosition() method takes a parameter specifying the
    * next position and mutates position to that specified location.
    */
    public void setPosition(int position)
    {
        this.position = position;
    }
   
    
    

}