package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.*;

/**
 * This is the MapCreatorFromDat class, which implements the IMapCreator
 * interface. This class creates the map by reading a random access file (.dat
 * file) and determining if that section of the map is passable or not.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class MapCreatorFromDat implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area = new Area[10][10];
	private IExpression factory;

	/**
	 * This method reads the input file (.dat file).
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		int i = 0;
		RandomAccessFile randomFile = new RandomAccessFile(fileName, "r");

		while (i != -1) {
			for (int row = 0; row < area.length; row++) {
				for (int col = 0; col < area[0].length; col++) {
					double basicEnergyCost = randomFile.readDouble();
					double elevation = randomFile.readDouble();
					double radiation = randomFile.readDouble();
					char operator = randomFile.readChar();
					int val1 = randomFile.readInt();
					int val2 = randomFile.readInt();
					
					factory = ExpressionFactory.getExpression(operator, val1, val2);
					if (factory.getValue() != -1) {
						randomFile.seek(factory.getValue() * 34);
					}
//					if (radiation >= .5) {
//						Area highArea = new HighArea(basicEnergyCost, elevation, radiation);
//						area[row][col] = highArea;
//					} else if ((radiation < .5) && (elevation > (threshold * .5))) {
//						Area highArea = new HighArea(basicEnergyCost, elevation, radiation);
//						area[row][col] = highArea;
//					} else {
//						Area lowArea = new LowArea(basicEnergyCost, elevation, radiation);
//						area[row][col] = lowArea;
//					}
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
