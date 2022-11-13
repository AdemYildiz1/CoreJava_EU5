package day15_methods_part3;

public class Task68_Retirement {

	public static void main(String[] args) {
		
    //HERE!!! WE ARE COONNECTING TWO METHODS
	
		yearsUntilRetirement("Mike",1990);
		
	}

	public static int calculateAge(int yearBirth) {
		
		    // int age=2019-yearBirth; 
		    // return age;     (we can directly return age like below instead.)
		
		    return 2019-yearBirth;
	
	}
	public static void yearsUntilRetirement (String name,int yearBirth) {
		
		int HowLong=65-calculateAge(yearBirth);
		
		System.out.println(name+" retires in "+HowLong+" years");
	}
	
	
}
	

