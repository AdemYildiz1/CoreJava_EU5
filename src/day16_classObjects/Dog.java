package day16_classObjects;

    //class is a blueprint that has common properties(character) and methods(action,behaviors)

public class Dog {

	// here is properties
	String breed;
	int age;
	String color;
	String name;
	
	//here is our ACTIONS/METHODS/BEHAVIOURS about objects
 public void barking() {
	 System.out.println(name+ " is barking");
 }
 public void hungry() {
	 System.out.println(name+ " is hungry");
 }
 public void sleeping() {
	 System.out.println(name+ " is sleeping"); 
 }
 
}
