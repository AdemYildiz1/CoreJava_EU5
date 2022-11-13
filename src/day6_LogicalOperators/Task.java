package day6_LogicalOperators;

public class Task {

	public static void main(String[] args) {

		/*TASK
		 1- Create a double variable with the value 20
		 2- Create a second variable of type double with the value 80
		 3- Add both numbers up and multiply by 25
		 4- Use the reminder operator to figure out the reminder from  the sum of #3 divided by 40
		 5- Print remaining total (#4) is equal to 20 or less: true/false
		 
		 (3# ve #4 isareti galiba task 3 ve 4 deki ni demek istiyior:)
		 */
		
		double d1 = 20;
		double d2 = 80;
		
		double res = (d1+d2)*25;                          
		double remainder = res%40; 
		
		System.out.println("Remainig total is equal to 20 or less? - " + (remainder<=20));
		
		
		
	}

}
