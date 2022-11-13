package day45_exceptions;

public class BadArray {

	public static void main(String[] args) {
	
		int[] number = {1,2,3};
		
		for(int i=0; i<=number.length; i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("Learning Exception");

	}

}
/* Because of --> i<=number.length, it gives "exception"
 
 in the council it says in detail.
  " Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at day45_exceptions.BadArray.main(BadArray.java:10)"
	
	here, Exception belongs to java.lang package
	and belongs to ArrayIndexOutOfBoundsException Class
	
*/

