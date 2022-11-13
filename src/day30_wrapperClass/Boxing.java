package day30_wrapperClass;

public class Boxing {

	public static void main(String[] args) {
		
		//AUTOBOXING - Primitive to object(to wrap)
		Integer num1=1234; 
		
		int n=5;  // we got this primitive(5) and convert it to object type,below (we basically wrapped it/put in the box)
		Integer num2=n;

		//UNBOXING- Object to primitive
		Double d1=new Double (34.2); //just creating an object
		double d2=d1;  // we got this object(d1=34.2) convert it to primitive( we basically unwrapped/ opened the box
		System.out.println("d1: "+d1);//34.2
		System.out.println("d2: "+d2);//34.2
		
		long l1=new Long(6000000L);//Unboxing
		
		Long l2=new Long(345699459);//just creating an object(l2)		
		long l3=l2;//unboxing, we converted object l2 to l3(int, primitive)		
		
		//NOTE THAT!!!
		
		//It is ok to do implicit casting  like from int to double 
		int x=345;
		double y=x;
		
		//it is not ok to do it in wrapper classes
		
		Integer num3=Integer.valueOf(345);
		//Double d3=num3; it gives error
		
		
		
		
		
		
		
				
				
		
	}

}
