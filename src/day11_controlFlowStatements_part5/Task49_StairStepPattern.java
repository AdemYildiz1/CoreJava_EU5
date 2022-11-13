package day11_controlFlowStatements_part5;

public class Task49_StairStepPattern {

	public static void main(String[] args) {
         
		int rows=6;
		
		for (int i = 1; i<=rows; i++) {
			
			for(int b=1; b<=i; b++) {    
				                        //burda bosluk sayisi onemli.
				System.out.print(" "); //i sayisina kadar bosluk print edilir
				                      // yani b=1 den b<i ye kadar tekrarlanir inner loop
			}
			
			System.out.println("#");
		}

	}

}
