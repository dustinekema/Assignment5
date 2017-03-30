package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * This is the ElevationAnalyzer class, which implements the IRover 
 * interface.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class ElevationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	
	/**
	 * This will return this class' ArrayList<Area> whenever it is called.
	 * @return ArrayList<Area> this is the ArrayList<Area> that will be returned.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	/**
	 * This will set this class' ArrayList<Area> to an area array of 
	 * size specified by the parameters sent in.
	 * @param startRow This is the starting row for the Rover.
	 * @param startCol This is the starting column for the Rover.
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	/**
	 * This will get the result of the analysis according to the type of the analyzer.
	 * @return 
	 */
	@Override
	public void analyzePath() {
		
		double pathElevation = 0;
		double avElevation = 0;
		for (int i = 0; i < path.size(); i++) {
			pathElevation += getPath().get(i).getElevation();
			
	}
		avElevation = pathElevation/path.size();
		analysis = toString() + avElevation;
	}
	/**
	 * This will return the name of the analyzer.
	 * @return String this is the analyzer that is returned.
	 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	/**
	 * This will set the analyzer to the parameter that is sent in.
	 * @param analysis this is the string that the analysis is set to.
	 */
	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis;
	}
	
	/**
	 * This will return a String.
	 * @return String This is the string that is returned.
	 */
	@Override
	public String toString() {
		return "Elevation Analysis: ";
	}

}
