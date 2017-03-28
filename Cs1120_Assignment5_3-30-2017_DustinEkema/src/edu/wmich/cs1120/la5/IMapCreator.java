package edu.wmich.cs1120.la5;

import java.io.IOException;

/**
 * This is the IMapCreator interface. This provides the basic rules for the MapCreator class, 
 * which will implement this interface.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public interface IMapCreator {
	/**
	 * This method will set a required method for the MapCreator class. This method will 
	 * read an input file for energy cost, elevation, and radiation levels for each section 
	 * of the map. It will then determine, based on these values and a threshold value, whether 
	 * a area is a high area, a low area, or impassable. ONce this has been determined for a section 
	 * it will then be sent to a 2d array containing each area object.
	 * @param fileName this is the name of the file that will be read.
	 * @param threshold this is the threshold that is set by the user.
	 * @throws IOException This will throw an exception  if there is an IO error.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException;
	
	/**
	 * This method will set a required method for the MapCreator class. This method will 
	 * return this class' TerrainScanner whenever it is called.
	 * @return TerrainScanner this is the TerrainScanner object that is returned.
	 */
	public TerrainScanner getScanner();
	
	/**
	 * This method will set a required method for the MapCreator class. This method will 
	 * set this class' TerrainScanner object to the parameter that is sent into the method.
	 * @param scanner this is the object that the class' TerrainScanner object will be set to.
	 */
	public void setScanner(TerrainScanner scanner);
}
