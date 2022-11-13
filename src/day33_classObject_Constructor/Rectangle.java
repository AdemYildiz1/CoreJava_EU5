package day33_classObject_Constructor;

public class Rectangle {

	//instance variable
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}
	
	//constructor/special method has no  any "RETURN" or "NO RETURN TYPE" (VOID) AND its name must be the SAME AS THE CLASS NAME.
	//its responsibility is to instantiate the objects variables/initialize instance variable with values
	//eg: for this question our constructor instantiates length and width with a and b in an easier way. 
	
	public Rectangle(double a,double b) {
	
		length=a;
		width=b;
		
		
	}
	public Rectangle() {
		length=5.4;
		width=3.2;
		
	}
}
