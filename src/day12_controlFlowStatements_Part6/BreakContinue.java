package day12_controlFlowStatements_Part6;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			
			if(i==4) {
				
				continue;// means for number 4 go to beginning of loop
				//break;// means break the loop and exit
			}
			
			System.out.println(i);
		}       //compiler comes here after break.	

	}

}
