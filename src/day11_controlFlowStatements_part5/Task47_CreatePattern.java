package day11_controlFlowStatements_part5;

public class Task47_CreatePattern {

	public static void main(String[] args) {
		//WAY 1
		for(int i = 1; i<=7; i++) {
			
			System.out.println("******");
			}
		
		System.out.println("___________________________");
		
		//WAY 2
		int rows=6, columns=7;
		
		for(int a =1; a<=columns; a++) {
			
			for(int b=1; b<=rows; b++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		} 
	
	}


