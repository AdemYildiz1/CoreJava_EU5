package day37_inheritance;

public class School {

	public static void main(String[] args) {
		//we are going to test INHERITANCE example--> Student(child)-Person(parent), 
		
		Person person = new Person ();
		Student student = new Student();
		
		person.name="Mike";
		person.age=35;
		person.gender='M';
		
		//Child class(student) can assign instance variables and call methods from Parent class(Person)
		//Because child class inherited parent class with "extend" key word.
		
		student.name="Smith";  
		student.age =30;
		student.gender='M';
		
		student.studentID=1000;
		
		person.eat("steak");
		student.eat("pzza");
		
		//person.code("java"); 
		
		
		

	}

}
