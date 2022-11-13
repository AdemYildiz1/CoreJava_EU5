package day33_classObject_Constructor;

public class RectangleTest {

	public static void main(String[] args) {
		
		//We've learned that we can create unlimited objects that have their OWN properties(variable..etc) and methods
		
		Rectangle R1 = new Rectangle();
		
		System.out.println(R1.length);
//		System.out.println(R1.width);
		
		//basically new keyword calls the constructor and create the object and constructor initializes the values
		//"Rectangle()" is a constructor/a special method is called automatically,while object creating.
		// for example; in this example New keyword invokes the constructor that has 2 double arguments
		
		Rectangle R2 = new Rectangle();
		/*In this example New keyword invokes the constructor that has no parameters. 
		generally we have constructor in template that has no parameters
		INTERVIEW!! Even though we don't have any custom constructor in the template it donesn't give error 
		because JWM has default constructor that assigns/initializes for instance variables(in class template) some default values. 
		*/
		
		
		
		/*
		We learned this way, before learning constructor.
		but it is not efficient. we can do it just by adding value to constructor.
		
		System.out.println(R1.length);// 0.0 Default value so we did not assigned yet,But who gave this default value to us
		System.out.println(R1.width);
		
		R1.length=5.4;
		R1.width=3.2;
		
		R1.getArea();//17.28
		
		Rectangle R2 = new Rectangle();

		R2.length=2.7;
		R2.width=12.5;
	
		R2.getArea();//33.75
		*/
	}

}
