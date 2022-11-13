package day29_arrays_Lab;

public class Lab4_Question18 {

	public static void main(String[] args) {
		
		int[]b= {1,2,2,1,13,3};
 
		System.out.println(sumUnlucky(b));
	}
	public static int sumUnlucky(int []arr) {
		
		int sum=0;
		
		for(int value: arr) {
			if(value==13) {
				break;
			}
			sum=sum+value;
			
		}	
		return sum;
	}

}
