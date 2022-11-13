package day33_classObject_Constructor;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university="Cybertek"; // university name is the same for each student so we can assign just here
	
	public Student(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		System.out.println(name+" is attending lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name+" is submitting assignment");
	}
	
	public void attendingLab() {
		System.out.println(name+" is attending lab");
	}
	
	
}

