package edu.wmich.cs1120.la5;

/**
 * This is the IArea interface. This provides the basic rules for the Area class, 
 * which will implement this interface.
 * 
 * @author Ricardo
 *
 */
public interface IArea {
	
	/**
	 * This method will set a required method for the Area class, it will return 
	 * the double basicEnergyCost whenever it is called.
	 * 
	 * @return double this is the basic energy cost.
	 */
	public double getBasicEnergyCost();
	
	/**
	 * This method will set a required method for the Area class, it will set the class' 
	 * private basicEnergyCost to the parameter that is sent into the method.
	 * @param basicEnergyCost this is the double that the class' private basicEnergyCost will be set to.
	 */
	public void setBasicEnergyCost(double basicEnergyCost);
	
	/**
	 * This method will set a required method for the Area class, it will return the double 
	 * elevation whenever it is called.
	 * @return double this is the elevation.
	 */
	public double getElevation();
	
	/**
	 * This method will set a required method for the Area class, it will set the class' 
	 * private elevation to the parameter that is sent into the method.
	 * @param elevation this is the double that the class' private elevation will be set to.
	 */
	public void setElevation(double elevation);
	
	/**
	 * This method will set a required method for the Area class, it will return the double 
	 * radiation whenever it is called.
	 * @return double this is the radiation.
	 */
	public double getRadiation();
	
	/**
	 * This method will set a required method for the Area class, it will set the class' 
	 * private radiation to the parameter that is sent into the method.
	 * @param radiation this is the double that the class' private radiation will be set to.
	 */
	public void setRadiation(double radiation);
	
	/**
	 * This method will set a required method for the Area class, it will calculate the energy 
	 * that is consumed for a section of the map.
	 * @return double this is the amount of energy that is consumed for a section of the map.
	 */
	public double calcConsumedEnergy();
}


