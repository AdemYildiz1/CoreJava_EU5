package day8_controlFlowStatements_Part2;

public class Task32_LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		a=50;
		b=70;
		c=60;
		
		
		if (a>b&&a>c) {
		System.out.println("a is the largest");
		}else if(b>c&&b>a) {
			System.out.println("b is the largest");
		}else if(c>a&&c>b) {
			System.out.println("c is the largest");
		}else {
			System.out.println("numbers are equal");
		}
           
	}

}
