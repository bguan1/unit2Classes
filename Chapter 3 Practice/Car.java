

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author Bradley Guan 
 * @version 12 September 2014
 */
public class Car
{
    /** description of instance variable x (fuel efficiency of the car measured in miles per gallon) */
    private double fuelEfficiency;
    private double fuelInTank;

    /** Amount of fuel in gas tank measured in gallons
     * Constructor that specifies the fuel efficiency of this car
     */
    public Car(int Efficiency)
    {
       this.fuelEfficiency = Efficiency;
       this.fuelInTank = 0;
    }

    /**
     * Adds the specified amount of gas in gallons to this car's tank.
     * The drive method reduces the fuel in the tank based on the 
     * specified miles and the efficiency of this car
     *
     * @pre        this method is never invoked with a value for miles that consumes more 
     *              than the available gas in the tank.
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    gallons number of gallons of gas to add to this car's tank
     */
    public void drive (int miles)
    {
       double gallonsBurned = miles / this.fuelEfficiency;
       this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    public void addGas(int gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
}
