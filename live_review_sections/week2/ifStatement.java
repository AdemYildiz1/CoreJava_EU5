package week2;

public class ifStatement {

	public static void main(String[] args) {
		
		int a=10, b=20, c=20;
		
		if(a>b&&a>c) {
			System.out.println("a is greater = "+ a);
		}else if (b>c) {
			System.out.println("b is greater = "+ b);
		}else
			System.out.println("c is greater = "+ c);

	}

}
