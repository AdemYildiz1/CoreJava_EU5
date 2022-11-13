package day11_controlFlowStatements_part5;

public class Task48_CreatePattern2 {

	public static void main(String[] args) {
        
		int rows=7;
		
		for(int a =1; a<=rows; a++) {
			
			for(int b=1; b<=a; b++) { // a ya bagli olarak yildiz print edilir
				
				System.out.print("*");
			}
		System.out.println();
		}
			
	}	
 
}
