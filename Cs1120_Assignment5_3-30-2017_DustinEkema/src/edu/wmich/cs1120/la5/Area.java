package edu.wmich.cs1120.la5;

/**
 * This is the Area class which implements the IArea interface. This class is 
 * called each time a new line of an input file is read and processed.
 * @author Ricardo
 *
 */
public abstract class Area implements IArea {
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * This is the constructor for the class. 
	 * @param basicEnergyCost
	 * @param elevation
	 * @param radiation
	 */
	public Area(double basicEnergyCost, double elevation, double radiation) {
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
	
	/**
	 * This method returns this class' private basicEnergyCost whenever it is called
	 * 
	 * @return double this returns this private class' basicEnergyCost
	 */
	public double getBasicEnergyCost() {
		return this.basicEnergyCost;
	}
	
	/**
	 * This method sets this class' basicEnergyCost to the basicEnergyCost 
	 * parameter that is sent into the method
	 * 
	 * @param basicEnergyCost this is the the double that the private class' basicEnergyCost 
	 * will be set to
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}
	
	/**
	 * This method returns this class' private elevation whenever it is called
	 * 
	 * @return double this returns this private class' elevation
	 */
	public double getElevation() {
		return this.elevation;
	}
	
	/**
	 * This method sets this class' elevation to the elevation parameter 
	 * that is sent into the method
	 * 
	 *  @param elevation this is the double that the private class' elevation will be set to
	 */
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	
	/**
	 * This method returns this class' private radiation whenever it is called
	 * 
	 * @return double this returns this private class' radiation
	 */
	public double getRadiation() {
		return this.radiation;
	}
	
	/**
	 * This method sets this class' radiation to the radiation parameter 
	 * that is sent into the method
	 * 
	 * @param radiation this is the double that the private class' radiation will be set to
	 */
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}
	
	/**
	 * This method calculates the consumedEnergy for each section of the map.
	 * 
	 * @return this is the amount of energy consumed for the section of the map
	 */
	public double calcConsumedEnergy() {
		return 0;
	}
}
