package day34_constructors;

import java.util.Random;

public class Dice {

	int sides; 
	int value;
	
	public Dice(int numSide){
		sides=numSide;
		roll(); // *either we can call the method that has random value here or (check in the main method)
	}
	
	public void roll() {
		Random rand = new Random();
		value=rand.nextInt(sides)+1;
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value;
	}
	
	
	
}
