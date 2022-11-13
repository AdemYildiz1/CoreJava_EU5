package day17_classObjects_part2;

import java.util.Scanner; // util icinde scanner class lari cagiririz sadece
//import java.util.*; util icindeki butun classi cagirmak icin

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);    // I want to get value from keyboard by using scanner class so object is created
		
		System.out.print("Enter a byte value:");//we ask with "system.out.print" so that we can give the notification, like ok let's enter a value
		                                  //If we want to return smth we need to use method    
		//sc.nextByte();                  //now, it holds whatever I put from the keyboard(5.10...etc)
		                                  //compiler needs to bring this value(I write console) to my code by calling scanner methods
		byte b1 = sc.nextByte();          //to use this value we have to assign the method to its variable
		                                  //basically it means,We can write in the console this value and assign like that 
		System.out.println(b1);           //so, whatever I write console bring it to me as a byte data type finally we can us it(b1)
		System.out.println(b1*4);
		System.out.println(b1%3);                  
		
		/*!!!!sonuc olarak 2 seyi bilecegiz object olusturduktan sonra;
        1-system.out.print(); ask to user what to enter
        2- bring that value with the method
         */                
		
	}

}
