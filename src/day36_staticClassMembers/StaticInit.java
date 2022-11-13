package day36_staticClassMembers;

public class StaticInit {

	static final int NUM_SECONDS_PER_HOURS;    //normally final variable needs to be assigned, if not it gives ERROR. But,
                                              //we can assign it in static block because static block runs only ONE TIME                                     
	static {                                  
		System.out.println("Static init");
		int numSecondPerMinute=60;
		int numMinutePerHour=60;
		NUM_SECONDS_PER_HOURS=numSecondPerMinute*numMinutePerHour;
		
	}
	
	private static int one;
	private static final int two;
	private static final int three=3;
	//private static final int four;
	
	static {
		one=1;
		two=2;
	//	three=4;      //it gives error it is already assigned(above)
	//	two=4;        it gives error it is already assigned
	}
}
