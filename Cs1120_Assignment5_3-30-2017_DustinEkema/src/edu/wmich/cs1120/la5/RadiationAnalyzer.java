package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * This is the RadiationAnalyzer class, which implements the IRover 
 * interface. 
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class RadiationAnalyzer implements IRover {

	/**
	 * This method will set a required method for the Rover class. This will return this 
	 * class' ArrayList<Area> whenever it is called.
	 * @return ArrayList<Area> this is the ArrayList<Area> that will be returned.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method will set a required method for the Rover class. This will set this class' 
	 * ArrayList<Area> to an area array of size specified by the parameters sent in.
	 * @param startRow This is the starting row for the Rover.
	 * @param startCol This is the starting column for the Rover.
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method will set a required method for the Rover class. This will get the result of 
	 * the analysis according to the type of the analyzer.
	 */
	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method will set a required method for the Rover class. This will return the name of 
	 * the analyzer.
	 * @return String this is the analyzer that is returned.
	 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method will set a required method for the Rover class. This will set the name of the 
	 * analyzer.
	 * @param analysis this is the name that the analyzer is set to.
	 */
	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method will set a required method for the Rover class. This will return a String.
	 * @return String this is the string that is returned.
	 */
	@Override
	public String toString() {
		return null;
	}
}
