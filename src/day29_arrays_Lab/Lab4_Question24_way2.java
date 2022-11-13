package day29_arrays_Lab;

public class Lab4_Question24_way2 {

	public static void main(String[] args) {
		
		int[]x= {7,2,1,2,4};
		int a=2;
		System.out.println(everywhere(x, a));

	}
	public static boolean everywhere(int[]arr,int a) {
		
		for(int i=0; i<arr.length-2; i++) {
				
				if(arr[i]==a&&arr[i+1]==a||arr[i+2]==a) { // we can use just one "if" instead of nested "if"
					
					return true;	
				}
			}	
		
		return false;
		
		
		}
		
	}


