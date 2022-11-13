package day34_constructors;

public class DiceTest {

	public static void main(String[] args) {
	
		final int SIX_SIDED=6;
		Dice sixDice=new Dice(SIX_SIDED);
		//sixDice.roll(); // *we can call like that as well instead of calling roll() in cons
		
		rollDice(sixDice);  
    //!!WE are calling "rollDice() method which has object from Dice Class
	// so we need to put "sixDice" object here
		
	}
	
	public static void rollDice (Dice d) { //to pass object value we need class name and a value represent (sixDice)object name as a parameter 
		
		//Rolling a 6 sided dice(6 rakami  sabit ve zarin 6 yuzunu ifade ediyor)
		System.out.println("Rolling a "+d.getSides()+ " sided dice");
		
		//The dice's value: 
		System.out.println("The dice's value: "+d.getValue());
		
	}

}
