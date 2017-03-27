package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner();
	private Area[][] area = new Area[10][10];

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
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

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}

}
