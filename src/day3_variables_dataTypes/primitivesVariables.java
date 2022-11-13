package day3_variables_dataTypes;

public class primitivesVariables {

	public static void main(String[] args) {
	
		byte b1= 25;
		byte b2=-25;
		//byte b3= 128;(for byte it must be -27 to 27 so 128 is out of the limit)

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		 
		short s1= -32768;
		short s2= 32767; 
		short s3= 500;	
		
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		System.out.println("s3 "+s3);
		
		
		int i1= -214768;
		int i2= 20;
		int i3=100_000;// _ helps us read the number easily
		int i4= 100000;
		
		System.out.println("i1= "+ i1);
		System.out.println("i2= "+ i2);
		System.out.println("i3= "+ i3);
		System.out.println("i4= "+ i4);
		
		long l1 = 500;
		long l2 =-2147483649l;// For long, We HAVE to add "l or L" suffix if the number is out of integer) )
		long creditCardNumber= 1353_2145_2556_6666L;
		
		System.out.println("l1 = "+ l1);
		System.out.println("i4= "+ l2);
		System.out.println("creditCardNumber = "+creditCardNumber );
		
		// Floating numbers : default is double
		float f1 = 2.1f;// it is out of limit so we have to add "f or F" suffix
		
		double d1 = 3.14;
		
		System.out.println("f1 = "+f1);
		System.out.println("d1 = "+d1);
		
		// for char decimal value and HTML in unicode table corresponding to character 'A'
		char c1 = 'A';
		char c2 = 65; //decimal in unicode table
		char c3 ='\u0041';// HTML code in unicode table
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		boolean status= true;
		boolean status2= false;
		
		System.out.println("Eligable to take the exam: " + status);
		System.out.println("He is 16, can he take driver licence? :"+ status2);
		
		String name= "Ozzy";
		System.out.println("My name is " + name);
		String age= "12";// Even number works for string if it is in double quote 
		
		
		
		
	}

}
