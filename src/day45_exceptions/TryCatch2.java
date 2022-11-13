package day45_exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
	//we have two methods that should be known
		//1- getMessage()      -->gives brief description of exception/ it has some returning so use it in sysout...
		//2- printStackTrace();-->it gives detail about exception/ it has no returning in java background so no need to use sysout...
		
		int[] nums= {36,6,34,12};
		
		try {
			System.out.println(nums[6]);
			
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
			e.printStackTrace();                
		}
		System.out.println("-------------------------------");
		
		try {
			int j=100;
			int n=j/0;
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
