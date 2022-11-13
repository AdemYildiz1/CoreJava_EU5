package day23_stringManipulationLab_randomClass;

import java.util.*;

public class Task83_RollDice {

	public static void main(String[] args) {
		
		int dice1;
		int dice2;
		String again="y";
		
		Random rn=new Random ();
		Scanner sc= new Scanner (System.in);
		
		while(again.equalsIgnoreCase("y")) {
			
		System.out.println("rolling the dices");
		dice1=rn.nextInt(6)+1;
		dice2=rn.nextInt(6)+1;
		
		System.out.println("Their values are:"+ dice1 +" and "+ dice2);
		
		System.out.print("Roll them again (y=yes)?");
		again=sc.nextLine(); // we call this method so user can use console to say yes or no
	
		
		}
	}

}
