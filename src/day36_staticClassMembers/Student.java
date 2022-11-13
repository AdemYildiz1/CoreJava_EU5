package day36_staticClassMembers;

public class Student {
	
	String name;
	int age;
	int idnNumber;  //belongs to object/instance variable
	static String school="Cybertek"; // it belongs to class/ it is called static variable
	                                 // after putting static keyword it doesn't belong object any more
	
	
	public Student(String name, int age, int idnNumber) {
		
		this.name = name;
		this.age = age;
		this.idnNumber = idnNumber;
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idnNumber=" + idnNumber + ", school=" + school + "]";
	}
	

}
