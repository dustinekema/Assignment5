package edu.wmich.cs1120.la5;

/**
 * This is the HighArea class which extends the Area class. In addition to the 
 * methods in the Area class, this class calculates how much energy is consumed
 * when the rover comes across a high area.
 * 
 * @author Ricardo
 *
 */
public class HighArea extends Area {
	
	/**
	 * This is the constructor for a high area. It constructs from the superclass (Area).
	 * @param basicEnergyCost this is the basic energy cost for the current section.
	 * @param elevation this is the elevation for the current section.
	 * @param radiation this is the radiation for the current section.
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
	}
	
	/**
	 * This method calculates how much energy is consumed in the rover when it comes
	 * to a section of the map with a high area.
	 * 
	 * @return double this is the amount of energy that was consumed.
	 */
	@Override
	public double calcConsumedEnergy() {
		return (getBasicEnergyCost() * 4);
	}
}
