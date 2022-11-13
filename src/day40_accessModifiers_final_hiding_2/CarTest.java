package day40_accessModifiers_final_hiding_2;

import day40_accessModifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		//!!! IF you want to use class from different package you need to import it so we imported the "day_40.."
		
		Car c=new Car();
		
		//c.model="M3";   default has no access in different package
		
		c.year=2017;      //public has access from everywhere
		
		//c.door=4;       private has no access unless it is in the same class.
		
		//c.engine=5.3;   protected has no access, because it is NOT in sub class

		
		
		
		
		
		
		
		/*!whenever you create your class/custom class, 
		your class inherits some methods and super(); keyword directly from object class
		object class already exists in java.
		for example; 
		  c.hashCode();
		  c.equals(c);
		  c.wait();
		*/ 
		  
		  
	}

}
