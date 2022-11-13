package day23_stringManipulationLab_randomClass;

import java.util.Random;

public class Task84_CoinTosses {

	public static void main(String[] args) {
		
		//lets say 0 for "tails" and 1 for "head"
		
		Random rn=new Random ();
		
		for(int i=0; i<10; i++) {
			int x =rn.nextInt(2);
			
		if(x==0) {
			System.out.println("Tails");
		}else {
			System.out.println("Heads");
		}
		
		}
		
	}

}
