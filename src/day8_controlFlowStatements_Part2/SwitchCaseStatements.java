package day8_controlFlowStatements_Part2;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		String weather= "windy";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code java");
			break;
		
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code java");
			break;
			
		case "windy":
			System.out.println("fly a kite");
			System.out.println("Code java");
			break;
			
		case "snowy":
			System.out.println("Go snowboarding");
			System.out.println("Code java");
			break;
		
		default:
			System.out.println("Code java in any other weather");
		
		
		}

	}

}
