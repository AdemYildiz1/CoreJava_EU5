package day45_exceptions;

public class Checked_And_UncheckedExceptions {

	public static void main(String[] args) {
		//two ways to handle checked exception
		//1-try/catch  
		//2-Throws  declaration
		
		try {                   //it is a checked exception  
			Thread.sleep(2000); //here it was red and we hovered over,then we chose " try/catch" to handle
			                    //we would have been declare throws declaration as well.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
