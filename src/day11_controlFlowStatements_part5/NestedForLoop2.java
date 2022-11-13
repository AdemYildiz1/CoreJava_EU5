package day11_controlFlowStatements_part5;

public class NestedForLoop2 {

	public static void main(String[] args) {
		
		for(int i =0; i<3; i++) {
			
			System.out.println("outer loop at state "+ i);
			
			for (int p = 0; p<=3; p++) {
				
				System.out.println("inner loop at state "+ p);
				
				if(p==3) {
					
					System.out.println();
				}
			  }
			}
		}
			
	}


