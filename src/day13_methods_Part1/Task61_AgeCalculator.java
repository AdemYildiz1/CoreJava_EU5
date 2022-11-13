package day13_methods_Part1;

public class Task61_AgeCalculator {

	public static void main(String[] args) {
		
          ageCalculator(2021, 1986);
          ageCalculator(2021, 1984);
          
	}
	
	public static void ageCalculator(int current,int birthyear ) {
		
		int age= current-birthyear;
		System.out.println( age);
		
	}

}
