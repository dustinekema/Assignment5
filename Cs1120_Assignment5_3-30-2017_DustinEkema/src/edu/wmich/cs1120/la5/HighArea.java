package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	
	@Override
	public double calcConsumedEnergy() {
		return (getBasicEnergyCost() * 4);
	}
}
