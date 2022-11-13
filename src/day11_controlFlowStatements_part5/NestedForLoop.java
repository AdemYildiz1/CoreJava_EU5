package day11_controlFlowStatements_part5;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) {
			
			System.out.println("Outer Loop Iteration "+ i);
			
			for(int j =1; j<=2; j++) {                         
				
				System.out.println("i = "+ i + "; j = " + j);
				
			}
			
		}
		// if 1st loop is correct then it is printed
		// then, 2nd loop is printed till it will be false
		// after 2nd loop is done again 1st loop is printed (i becomes 2)
		// then 2nd loop start from beginning to till false 
		// after 2nd loop is done again 1st loop is printed (i becomes 3)...so on
		// (NOT  i variable continues where it stop working but j start from beginning each time.
		// because j is in small curly braces but i is in bigger)
		//which NOT means firs inner loop done than it goes outer loop.
	}

}
