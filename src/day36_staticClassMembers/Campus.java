package day36_staticClassMembers;

public class Campus {
 
	private String city;
	static String country;
	
	static {
		System.out.println("Static block-1");    //STATIC BLOCK
		country="USA";
	}
	
	 public Campus (String city) {
		 System.out.println("Constructor");
		 this.city=city;
	 }
	 
	 static {
		 System.out.println("Static block-2"); //STATIC BLOCK
		 country="UK";
	 }
}
