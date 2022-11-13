package day29_arrays_Lab;

public class Lab4_Question16 {

	public static void main(String[] args) {
		
		int[]x= {2,1,2,3,4};
		
		System.out.println(evenNumber(x));
	}
	public static int evenNumber(int[] arr) {
		
		int counter=0;
		
		for(int i=0; i<arr.length; i++) { // we can do it by using "Each for loop"
			
			if(arr[i]%2==0) {
				
				counter++;
			}
		}
		return counter;
	}

}



