package day29_arrays_Lab;

public class Lab4_Queastion22 {

	public static void main(String[] args) {

		int[]x= {1,4,1,4,1,};
		
		int counterFor1=0;
		int counterFor4=0;
		
		for(int value1:x) {
			
			 if (value1==1){
				  counterFor1++;
			 }
		}
		for(int value4:x) {
			
			 if (value4==4){
				  counterFor4++;
			 }	 
		}
	if(counterFor1>counterFor4) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	
	
	}
}
