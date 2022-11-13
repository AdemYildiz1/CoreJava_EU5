package day36_staticClassMembers;

import static java.lang.Math.*; //Import all static properties belongs to math class

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16)); //if we did not import Static Math class we have to use Class name to call method
		
		//Because we have imported "static Math class(above)" we can directly get method or properties without class name  
		
		System.out.println(sqrt(16));
		
		System.out.println(PI);   
		
	}
	
}
