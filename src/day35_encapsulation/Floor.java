package day35_encapsulation;

/*
Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0,
in case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
* Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */


public class Floor {
	
	double length, width;
	
	public Floor(double length, double width) {
		
		if(length<0) {     //parameter comes from cons
			this.length=0;	
		}else {
			this.length = length;
		}
		
		if(width<0) {
			this.width=0;
		}else {
			this.width = width;
		}	
    }
	
	public double getArea() { //this is instance method.
		return length*width;   // you can use this. for representing 
		
		
		
		
		
		
	}
}
