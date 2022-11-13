package day45_exceptions;

public class Nullpointer {

	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name.toUpperCase());
			
		}catch(NullPointerException e){ //(Exception e) can be used as well because exception covers all
			System.out.println("NullPointerException happened");
			System.out.println();
			System.out.println("Here is the message: "+ e.getMessage());
			System.out.println();
			System.out.println("here is the stack trace: ");
			e.printStackTrace();
			
		}
		

	}

}
