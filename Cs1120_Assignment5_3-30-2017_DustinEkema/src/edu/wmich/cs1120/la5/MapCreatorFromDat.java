package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.*;

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
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area = new Area[10][10];
	/**
	 * This method reads the input file (.dat file).
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		int i=0;
		RandomAccessFile randomFile= new RandomAccessFile(fileName,"r");
		String[] field = new String[3];
		double basicEnergyCost = Double.parseDouble(field[0]);
		double elevation = Double.parseDouble(field[1]);
		double radiation = Double.parseDouble(field[2]);
		//long x;
		while (1<2) { // FIX THIS 
			for (int row = 0; row < area.length; row++) {
				for (int col = 0; col < area[0].length; col++) {
				//	String aLine = file.nextLine();
				//	field = aLine.split(" ");

		if (radiation >= .5) {
			Area highArea = new HighArea(basicEnergyCost, elevation, radiation);
			area[row][col] = highArea;
		} else if ((radiation < .5) && (elevation > (threshold * .5))) {
			Area highArea = new HighArea(basicEnergyCost, elevation, radiation);
			area[row][col] = highArea;
		} else {
			Area lowArea = new LowArea(basicEnergyCost, elevation, radiation);
			area[row][col] = lowArea;
		}
				}
			}
		}
		
	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
		
	}

}
