package day29_arrays_Lab;

public class Lab4_Question17 {

	public static void main(String[] args) {

		int[]x= {10,3,5,6};

		System.out.println(differences(x));
		

	}
	public static int differences(int[]arr) {
		
		int max=arr[0];
		int min=arr[0];
		int result;
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i+1]>max) {
				
				max=arr[i+1];
				
			}else if(arr[i+1]<min) {
				
				min=arr[i+1];
				
			}
		}
		result=max-min;
		return result;
	}
	

}


