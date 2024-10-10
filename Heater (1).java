/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * @author Ayra Mensah
 * @version 1.03 January 23rd, 2024
 */
public class Heater
{
    /** The temperature setting that the heater should maintain. */
    private int temperature;
    
    /** The temperature setting for a newly created heater. */
    private static final int INITIAL_TEMPERATURE = 15;
    
    /** 
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
    private int increment;
    
    /**
     * Stores minimum temperature settings of the heater
     */
    private int min;
    
    /**
     * Stores maximum temperature settings of the heater
     */
    private int max;
    
    /** 
     * The default amount by which the temperature setting is 
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;
    
    private static final int MINIMUM_TEMP = 0;
    
    private static final int MAXIMUM_TEMP = 100;
    
    
    
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.
     */
    public Heater()
    {
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
        min = MINIMUM_TEMP;
        max = MAXIMUM_TEMP;
    }
 
    /**
     * This constructor initializes extra fields
     */    
    public Heater(int minTemp, int maxTemp)
    {
        min = minTemp;
        max = maxTemp;
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
    }

    /**
     * Returns the heater's current temperature setting
     */    
    public int temperature()
    {
        return temperature;
    }
    
    /**
     * Increases the temp of heater by value stored in 
     * increment
     */
    public void warmer()
    {   if ((temperature + increment) <= max)
        {
            temperature = temperature + increment; 
        }   
    }

    /**
     * Decreases the temp of heater by value stored in 
     * increment
     */    
    public void cooler()
    { 
        if ((temperature - increment) >= min)
        {
            temperature = temperature - increment; 
        }
    }
    
    
    /**
     * Change the increment to be the value the user passes
     */    
    public void setIncrement(int newIncrement)
    { 
        if ( newIncrement > 0)
        {
            increment = newIncrement;
        }
        
    }
}
