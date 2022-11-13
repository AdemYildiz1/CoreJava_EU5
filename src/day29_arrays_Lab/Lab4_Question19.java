package day29_arrays_Lab;

public class Lab4_Question19 {

	public static void main(String[] args) {
		
		int[]x= {1,2,2,6,99,93,7,3};
		
		int sum=0;
		
		boolean boolCheckSix=false;
		
		for(int i=0; i<x.length; i++) {
			
			if (boolCheckSix) {
				
				if(x[i]==7) {
					boolCheckSix=false;
				}
				
			}else if(x[i]==6) {
				
				boolCheckSix=true; // after finding number 6 now it can go inside if(boolCheckSix) to check number 7.
				
			}else {
				sum=sum+x[i];
			}
			
		}
		System.out.println(sum);
		
		
	}

}
