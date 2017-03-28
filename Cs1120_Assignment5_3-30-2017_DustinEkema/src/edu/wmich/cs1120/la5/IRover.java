package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * This is the IArea interface. This provides the basic rules for the Area class, 
 * which will implement this interface.
 * 
 * @author Ricardo
 *
 */
public interface IRover {
	
	/**
	 * This method will set a required method for the Rover class. This will return this 
	 * class' ArrayList<Area> whenever it is called.
	 * @return ArrayList<Area> this is the ArrayList<Area> that will be returned.
	 */
	ArrayList<IArea> getPath();
	
	/**
	 * This method will set a required method for the Rover class. This will set this class' 
	 * ArrayList<Area> to an area array of size specified by the parameters sent in.
	 * @param startRow This is the starting row for the Rover.
	 * @param startCol This is the starting column for the Rover.
	 */
	void setPath(ArrayList<IArea> path);
	
	/**
	 * This method will set a required method for the Rover class. This will get the result of 
	 * the analysis according to the type of the analyzer.
	 */
	void analyzePath();
	
	/**
	 * This method will set a required method for the Rover class. This will return the name of 
	 * the analyzer.
	 * @return String this is the analyzer that is returned.
	 */
	String getAnalysis();
	
	/**
	 * This method will set a required method for the Rover class. This will set the name of the 
	 * analyzer.
	 * @param analysis this is the name that the analyzer is set to.
	 */
	void setAnalysis(String analysis);
	
	/**
	 * This method will set a required method for the Rover class. This will return a String.
	 * @return String this is the string that is returned.
	 */
	String toString();
}
