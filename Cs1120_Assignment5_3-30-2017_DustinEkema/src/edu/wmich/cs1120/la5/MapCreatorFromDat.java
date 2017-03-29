package edu.wmich.cs1120.la5;

import java.io.IOException;

/**
 * This is the MapCreatorFromDat class, which implements the IMapCreator 
 * interface. This class creates the map by reading a random access file (.dat file) 
 * and determining if that section of the map is passable or not.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class MapCreatorFromDat implements IMapCreator {

	/**
	 * This method reads the input file (.dat file).
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		
	}

}
