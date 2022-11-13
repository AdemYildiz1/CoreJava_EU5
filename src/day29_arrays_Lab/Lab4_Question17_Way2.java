package day29_arrays_Lab;

public class Lab4_Question17_Way2 {

	public static void main(String[] args) {

		int[]x= {10,3,5,6};

		System.out.println(differences(x));
		

	}
	public static int differences(int[]arr) {
	
		//finding the biggest
		
		int max=0; //let's assume max is 0
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
				
			}
	    }
		//finding the smallest 
		
		int min=max; // lets assume max number (we found above is the smallest)
		
         for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
				
			}
	    }
		return max-min;
		
   }
}

