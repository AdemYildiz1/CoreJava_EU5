package day36_staticClassMembers;

public class StaticMethods {
	
	
	static String name = "Apple";  //STATIC VARIABLE
	int age=10;                    //INSTANCE VARIABLE
	
	public static void show1() { // STATIC METHOD
		
		//show2();          /*RULE-1, you can NOT call(access) any instance variable or method from static method*/
		//show3();
		show4();    
		System.out.println(name);  
		//System.out.println(age); //Error  
		
	}
	
	public void show2() {     //INSTANCE METHOD
		show1();
		show3();
		show4();                /*RULE-2,you can call(access) any static variable or method from instance method*/
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void show3() {  
		
	}
	
	public static void show4() {
		
	}
	
}
