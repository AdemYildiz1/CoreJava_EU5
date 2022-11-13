package day4_arithmeticOperators;

public class Task_CalculateAreaAndPerimeter {

	public static void main(String[] args) {
		
		// calculate area and perimeter of the circle that has a radius of 5.5 uding the formulas.
		
		double area, perimeter;//double area, perimeter,radius=20; (we can write this two lines like that aswell)
		double radius= 5.5;
		final double pi= 3.14;
		
		perimeter=2*radius*pi;
		area=radius*radius*pi;
		
		System.out.println("Area is "+area);
		System.out.println("Perimeter is "+perimeter);
			
		}
		

	}


