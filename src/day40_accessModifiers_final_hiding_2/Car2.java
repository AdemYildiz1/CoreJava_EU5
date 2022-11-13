package day40_accessModifiers_final_hiding_2;

import day40_accessModifiers_final_hiding.Car;

public class Car2 extends Car{
	
	  public Car2() {
		  
		 // model="M3";  default has no access
		  year=2017;
		 // door=4;      private has no access    
		  engine=5.3;    //protected has an access because it is in the sub class(child class) 
		  
		  
	  }

}
