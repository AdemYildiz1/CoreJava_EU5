package day35_encapsulation;
/*
Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor
and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor
with a carpet. //cost*area
 */

public class Calculator {
                         // Floor floor= new Floor(); remember this is basic creating object like that;
	                     // Floor is class name, floor is reference name/Carpet is class name carpet is reference name.
	Floor floor;         // we need to create object By using Floor class name to access Floor class to calculate total cost.
	Carpet carpet;       // we need to create object By using Carpet class to access Carpet class to calculate total cost.
	                     // so, for getting area we wrote reference type(Floor) and reference variable(floor),
	                     // And getting cost we wrote reference type(Carpet) and reference variable(carpet),
	                     // Basically, This is how we link Calculator classes to Carpet and Floor classes,it is called composition
	
	public Calculator(Floor floor, Carpet carpet) { // to initialize these objects we need cons
		this.floor = floor;                         //remember!! we need class name for passing object as an parameters.
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		return carpet.getCost()*floor.getArea(); //How am I going to get cost (from Carpet class) and area (from Floor class)?
	}                                            //if I want to bring any thing from template we need object/object type
}
