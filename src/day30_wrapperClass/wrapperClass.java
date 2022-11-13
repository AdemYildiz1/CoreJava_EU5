package day30_wrapperClass;

public class wrapperClass {

	public static void main(String[] args) {
		
		/*wrapperClass converts primitive into object!!!, And object to primitive
		-why we want to get object! because we can use so many method with the object. so it will be useful
		-primitive itself doesn't have flexibility to use it like object
		-it is used in collections structure system like array...etc
		
		-each primitive(8 primitives) has a corresponding wrapper classes
		byte---Byte
		short---Short
		int---Integer...etc
		
		By using this classes I can convert my primitive to object.THIS IS MAIN POINT
		
		*/
		
		//1- old way TO CREATE object from primitive classes
		//ClassName refName=new ClassName();
		int n1=10;
		Integer n2= new Integer (10); // we created n2 object but it has value of n1
		
		System.out.println(n1);
		System.out.println(n2);
		
		double d1=44.5;
		Double d2=new Double(44.5); //using direct value 
		Double d3=new Double("44.5");// or using it in string format but it still double value!!!
		
		System.out.println(d1);//44.5
		System.out.println(d2);//44.5
		System.out.println(d3);//44.5
		System.out.println(d1+d2+d3);// these are object right now(d2 an d3)
		
		char ch1='a';
		Character ch2=new Character('a');
		System.out.println(ch1);
		System.out.println(ch1);
		
		byte b1=100;
		Byte b2=new Byte((byte)100); //it accepts int so we are casting 
		System.out.println(b1);
		System.out.println(b2);
		
		//2- new way without "new' key word TO CREATE object from primitive classes
		Integer num1 = Integer.valueOf(1234); // we converted this int primitive data type to object num1 ,by using "valueOf()"
		System.out.println(num1);
		
		Boolean bool1=Boolean.valueOf(true);
		Boolean bool2=Boolean.valueOf("false");// because it is wrapper it accepts string value as well
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
		
		
	}

}
