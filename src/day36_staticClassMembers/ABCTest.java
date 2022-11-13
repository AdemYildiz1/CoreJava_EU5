package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		
		
		ABC.m1();  //RULE!, to call method thru only static way, which is with Classname(explanation below) 
		
		//ABC o1 =new ABC(); //rule says how we can not call this way 
		//o1.m1();
		
                      
		/*
		  whenever all of your methods in your class are static, and you want everyone to call them 
		  with just static ( Classname.methodname() ), then you can simply make your constructor private.
		  so with this way you cut the access initilazition thru constructor
		 */
		
	}

	public static void print() {
		//static int a =5; //RULE!, local Variable cannot be static
		
	}
}
