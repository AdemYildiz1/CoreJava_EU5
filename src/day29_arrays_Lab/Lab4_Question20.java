package day29_arrays_Lab;

public class Lab4_Question20 {

	public static void main(String[] args) {
		
		int[]x= {1,1,2,2};
		
		
	          System.out.println(NextTo2(x));
	}
	public static boolean NextTo2(int[]arr) {
		
		boolean flag=false;
		
		for(int i=0; i<arr.length-1; i++) {
			
			if (arr[i]==2 && arr[i+1]==2) {
				 
				flag=true;
				break;
				
			}else {
				flag=false;
			}
			
		}
		return flag;
	}

}
