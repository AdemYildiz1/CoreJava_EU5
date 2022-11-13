package day40_accessModifiers_final_hiding;

public class TestParentChild {

	public static void main(String[] args) {

		//we can not override instance variables; we can hide them
		//Basically, two copies are created in memory whatever references we are using it calls that one.
		
		Child c =new Child ();
		System.out.println("Value of x before increment "+ c.x);//200
		
		c.increment();
		System.out.println("Value of x after increment "+ c.x);//200
		
		Parent p=new Parent ();
		System.out.println("Value of x before increment "+ p.x);//100 but memory 101
		
		p.increment();
		System.out.println("Value of x after increment "+ p.x);//101

	}

}
