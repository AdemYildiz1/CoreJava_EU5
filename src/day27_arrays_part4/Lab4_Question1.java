package day27_arrays_part4;

public class Lab4_Question1 {

	public static void main(String[] args) {
	
		int[]x= {1,2,6};
		int[]y= {6,1,2,3};
		int[]z= {13,6,1,2,3};
		
	           firstLast6(x); // we called the method it runs but do not print yet
	           
          System.out.println(firstLast6(x)); 
          System.out.println(firstLast6(y));   
          System.out.println(firstLast6(z));   
	}
	public static boolean firstLast6(int[]arr) {
		if(arr.length<1) {
			return false;
		}
		if(arr[0]==6||arr[arr.length-1]==6) {
			return true;
		}else {
			return false;
		}
	
	}
}

