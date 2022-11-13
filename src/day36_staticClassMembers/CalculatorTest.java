package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
	
		//If our method is created with static keyword in Calculator class,
		//then, we can call it with class name or with object name like before
	
		double result= Calculator.plus(55, 7); //1- calling With class name
		System.out.println("result: "+ result); 
		
		Calculator c =new Calculator();
		System.out.println("result: "+ c.plus(55, 7)); //2- calling with object name
		
		
		//** INFORMATION-extra-USEFULL
		//Creating our method and calling the method in the same class
		
		m1();                      //Calling this way just we did before, ONLY under main method IN THE SAME CLASS 
		CalculatorTest.m1();       //calling with Class name  because of static keyword(like above, 1)
		
		CalculatorTest C1= new CalculatorTest();//creating object then calling with object name (like above, 2)
		C1.m1();
		
	}
	public static void m1() {
		System.out.println("hello");
	}

}
