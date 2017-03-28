package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;

/**
 * <h1>Rover 2.0</h1> This program is an extension of the Planetary Scanner assignment,
 *  Firstly, the rover needs to be programmed to be able to read from both text files 
 *  (e.g., txt file) and binary files (e.g., dat file). Besides, the interface “IRover” 
 *  is updated so that it can support extensive analysis towards the path obtained in 
 *  addition to total energy consumed, for example, get the range of elevation, get the 
 *  total radiation, etc.
 * 
 * @author Ricardo
 *
 */
public class Assignment5 {

	/**
	 * This is the main method of the program. The main method only has one line of 
	 * code, which calls the startGUI method in the MainWindow class.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow.startGUI();
	}
}
