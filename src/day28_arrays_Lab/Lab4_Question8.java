package day28_arrays_Lab;

public class Lab4_Question8 {

	public static void main(String[] args) {
		
		int[]x= {2,5};
		int[]z= {4,5};
 
		System.out.println(contain(x));
		System.out.println(contain(z));
	}
	public static boolean contain(int []arr) {
		
		for(int value:arr) {
			if(value==2||value==3) {
				return true;
			}
	    }
	
	        return false;
 
	}
}





