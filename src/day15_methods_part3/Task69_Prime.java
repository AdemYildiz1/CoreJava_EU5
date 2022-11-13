package day15_methods_part3;

public class Task69_Prime {

	public static void main(String[] args) {
		
		//System.out.println(isPrime(37)); first way of printing
		//second way
		int num=4;
		if(isPrime(num)) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
		
	}
	public static boolean isPrime(int num) {
		
		boolean flag=true;
		
		if(num==1||num==0) {
			
			flag=false;
			
		}else {
			
			for(int i=2; i<num; i++) {
				
				if(num%i==0) {
					
					flag=false;
					break;
					
				}	
			}
		}
		return flag; //if loop and first if statement are not correct then,
	                 // we return flag that is already initialized with true
	}
}
