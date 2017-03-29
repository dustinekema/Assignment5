package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import edu.wmich.cs1120.la5.TerrainScanner;

/**
 * This is the MapCreatorFromTxt class which implements the IMapCreator interface. This 
 * class creates the map by reading each line of an input file (.txt file) and determining 
 * if that section of the map is passable or not.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area = new Area[10][10];

	/**
	 * This method reads each line of the input file and splits each double value 
	 * into their respective fields of a string array. The method then determines if 
	 * the current section it is reading is a high area or low area. It then sends the 
	 * information for that section to the private area[][] array.
	 * @param fileName This is the name of the file that will be read for information
	 * @param threshold This is the threshold which will make a part of the terrain impassable
	 * @throws IOException This will throw for if there is an IO exception
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Scanner file = new Scanner(new File(fileName));
		String[] field = new String[3];

		while (file.hasNext()) {
			for (int row = 0; row < area.length; row++) {
				for (int col = 0; col < area[0].length; col++) {
					String aLine = file.nextLine();
					field = aLine.split(" ");

					double basicEnergyCost = Double.parseDouble(field[0]);
					double elevation = Double.parseDouble(field[1]);
					double radiation = Double.parseDouble(field[2]);

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

		scanner.setTerrain(area);
		file.close();
	}

	/**
	 * This method returns this class' private TerrainScanner object scanner
	 * @return TerrainScanner This returns the private TerrainScanner object from this class
	 */
	@Override
	public TerrainScanner getScanner() {
		return scanner;
	}

	/**
	 * This method sets this class' private TerrainScanner object scanner 
	 * to be equal to the TerrainScanner parameter that is sent in
	 * @param scanner this is the TerrainScanner parameter that the class' private 
	 * TerrainScanner object will be set to
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
