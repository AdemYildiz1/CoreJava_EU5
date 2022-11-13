package day3_variables_dataTypes;

public class variableDeclaration {

	public static void main(String[] args) {
		
		// declaration
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;
		
		//assigned
		inches=10;
		speed=500;
		month=2;
		distance=40.2;
		salesCommision=5; 
		
		//declared+assigned
		byte feet=5;
		
		System.out.println(inches);
		System.out.println(speed);
		
		/*basic example for variable by using concatenation
		 * so if we change value then output changes
		 * eg: number 20 can be changed
		*/
		
		int number=20;
		System.out.println("My Number is "+ number);
        
	}

}
