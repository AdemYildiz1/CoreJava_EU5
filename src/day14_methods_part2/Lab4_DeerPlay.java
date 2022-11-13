package day14_methods_part2;

public class Lab4_DeerPlay {
	
	/*Question-4
    The deers in VA spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90. 
	Unless it is summer, then the upper limit is 100 instead of 90.
	Write a method that accepts temperature and a boolean is Summer, 
	prints true if the deers play and false otherwise.

	deerPlay(70, false); true
	deerPlay(95, false); false
	deerPlay(95, true);  true
   */
	public static void main(String[] args) {
		deerPlay(70, false); 
		deerPlay(95, false); 
		deerPlay(95, true); 

	}
	public static void deerPlay(int temp, boolean isSummer) {
		
		if (temp>=60&&temp<=100&&isSummer==true) {
		System.out.println("TRUE");	
		
		}else if (temp>=60&&temp<=90&&isSummer==false) {
		System.out.println("TRUE");
		
		}else {
			System.out.println("FALSE");
		}
	}

}
