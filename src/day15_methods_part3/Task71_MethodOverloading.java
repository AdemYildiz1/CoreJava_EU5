package day15_methods_part3;

public class Task71_MethodOverloading {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);
		
		calcFeetAndInchesToCentimeters(6,5);
		
	}
	public static double calcFeetAndInchesToCentimeters( double feet, double inches) {
		
		if(feet<0||(inches<0||inches>12)) {
			System.out.println("invalid feet or inches");
			return-1;
		}
		double centimeters=(feet*12)*2.54;
		
	System.out.println(feet+" feet, "+ inches+" inches = "+ centimeters+" centimeters");

           return centimeters; 
    }
	public static double calcFeetAndInchesToCentimeters(double inches) {
		 
		if(inches<0) {
			System.out.println("invalid inches");
			return-1;
		}
		double feet=(int)inches/12; //we are having remaining inches so we can apply casting.
		double remainingInches = inches%12;
		System.out.println(inches+" inches = "+ feet+ " feet and "+ remainingInches+" inches");
		
		return calcFeetAndInchesToCentimeters(feet,remainingInches);
	}
	
	
}
