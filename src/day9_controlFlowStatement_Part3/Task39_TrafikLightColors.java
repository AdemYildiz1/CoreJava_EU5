package day9_controlFlowStatement_Part3;

public class Task39_TrafikLightColors {

	public static void main(String[] args) {

		char light = 'o';

		switch (light) {
		case 'R': case 'r':// or we can write the code like (case 'R', 'r':)
			System.out.println("Red");
			break;
		case 'O', 'o':
			System.out.println("Orange");
			break;
		case 'G','g':
			System.out.println("Green");
		    break;
		default:
			System.out.println("No Color");
		

		}

	}

}
