package day16_classObjects;

public class Employee {

	String name;
	String JobTitle;
	double salary;
	
	public void work() {
		System.out.println(name+"is working hard");
	}
	public void attendMeeting() {
		System.out.println(name+" is attending a meeting");
	}
	public void introduce () {
		System.out.println("Name: "+name+ " job title"+ JobTitle+" Salary"+ salary);
	}
}
