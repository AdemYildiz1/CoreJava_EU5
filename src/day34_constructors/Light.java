package day34_constructors;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;
	
	//REMEMBER!! this(), for chaining
	//           this.instanceVariable, for representing/specifying instance variable for assigning
	
	//1
	public Light() {
		this(0,false);   // here I chained//called cons 2  from cons 1
		System.out.println("Returning from no-argument constructor no.1");
	}
	
	//2
	public Light(int watt, boolean ind) {
		this(watt,ind,"x"); //here we call con 3, "watt=0" and "ind=false" parameters allready are coming in cons 1 "this(0,false)"
		                    // so just "x" is assigned
		System.out.println("Returning from constructor no.2");
		
	}

	//3
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
	}
	
}

//they are called overloading constructor as well/like overloading method
//because numbers of parameters or type of parameters for each constructor are different


