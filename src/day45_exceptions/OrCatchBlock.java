package day45_exceptions;

public class OrCatchBlock {

	static String str;
	
	public static void main(String[] args) {
		//to be able to use "OR" catch block 
		//Exception types can Not be sub-parent types 
		try {
			System.out.println(str.toUpperCase());
			
		}catch(IllegalArgumentException|NullPointerException e){ 
			e.printStackTrace();
			
		}

	}

}
