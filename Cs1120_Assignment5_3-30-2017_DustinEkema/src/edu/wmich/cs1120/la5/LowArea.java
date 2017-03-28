package edu.wmich.cs1120.la5;

/**
 * This is the LowArea class which extends the Area class. In addition to the 
 * methods from the Area class, this class calculates how much energy is consumed 
 * when the rover comes across a low area.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class LowArea extends Area {
	
	/**
	 * This is the constructor for the class. It constructs from the superclass (Area).
	 * @param basicEnergyCost this is the basic energy cost for the current section.
	 * @param elevation this is the elevation for the current section.
	 * @param radiation this is the radiation for the current section.
	 */
	public LowArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
	}
	
	/**
	 * This method calculates the energy consumed when the rover comes across a low area.
	 * 
	 * @return double this is the energy consumed for the low area by the rover.
	 */
	@Override
	public double calcConsumedEnergy() {
		return (getBasicEnergyCost() * 2);
	}
}
