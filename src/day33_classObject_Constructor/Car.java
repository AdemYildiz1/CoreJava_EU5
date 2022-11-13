package day33_classObject_Constructor;

public class Car {

	// instance variables/objects
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	// we have to create constructor to assign value
	//1-without parameter
	public Car() {
		model="Honda";
		make="Civic";
		year=2020;
		mile=5000;
		color="red";
		
	}
	//2 with parameter
	public Car(String mo,String ma, int yr, double ml,String cl) {
		model=mo;
		make=ma;
		year=yr;
		mile=ml;
		color=cl;
	}
	// if we want to use parameter name as a current object name. 
	//eg: passing same parameter name to instance variable(object) we should use "this" that represents current object(instance variable).
	//basically it means. ok I am working with the current object to specify instance variable
	
	//in this way we are not confused.
	
	public Car(String model, String make, int year, int mile, String color) {
	
		this.model = model;
		this.make = make;
		this.year = year;        
		this.mile = mile;
		this.color = color;
	}
	//SHORT CUT TO CREATE CONSTRUCTOR: right click-- source--Generate constructor using fields:)
	
	
	
	
	
	
	
	
	
	
	
}
