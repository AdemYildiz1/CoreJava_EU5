package day10_controlFlowStatement_part4;

public class Task43_NumberAndSquaredTable {

	public static void main(String[] args) {
		
		System.out.println("Number\t\tNumberSquared");
		System.out.println("------------------------");
		
		//WAY-1
		int numSquared=0;
		
		for(int i=1; i<=10; i++) {
			numSquared=i*i;
			System.out.println(i + " \t\t" + numSquared );
			
		}
		System.out.println("********************************");	
		//WAY 2
		for(int number=1; number<=10; number++) {
			System.out.println(number +"\t\t"+number*number);
		}
	}

}
