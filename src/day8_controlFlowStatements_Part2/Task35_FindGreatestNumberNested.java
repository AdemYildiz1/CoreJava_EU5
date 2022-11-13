package day8_controlFlowStatements_Part2;

public class Task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		// it is not on the slide like task 29

		// find the greatest number by using nested
		int n1=2000;
		int n2=3000;
		int n3=4000;
		 
		if (n1>n2&&n1>n3) {
			System.out.println("n1 is biggest number");
		}else {
			if(n2>n3) {
			   System.out.println("n2 is biggest number");
			}else {
			   System.out.println("n3 is biggest number");
			}
		}
		
	}

}
