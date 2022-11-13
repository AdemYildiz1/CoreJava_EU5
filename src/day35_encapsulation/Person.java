package day35_encapsulation;

public class Person {

	String name;
	private int age;
	char gender;
	
	
	//setters--         if you do just only create setters is called sometimes Write-only
	
	public void setAge (int age) {  //this is like filter, Method name must be "setName" / no return here just set
		 if (age<0) {
			 System.out.println("Not valid age");
		 }else {
			 this.age=age; 
		 } 
	}
	//getters--        if you do just only create getters is called sometimes Read-only 
	
	public int getAge() {     // this is for getting/printing after cutting with private and setting filters
		                      // method name must be "getName" / we return here to get
		return age;
	}
	
	//SHORT WAY: right click--source--Generate Getters and Setters    so we can create getters and setters easier
	
}
