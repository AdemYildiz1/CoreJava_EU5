package day9_controlFlowStatement_Part3;

public class Task39_OrLogicWithSwitch {

	public static void main(String[] args) {
		
		//A or B or C -- pass D or E -- Fail
		
		char grade= 'D';
		
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("PASS");
			break;
		case 'D':
		case 'E':
			System.out.println("FAIL");
			break;
		}

	}

}



