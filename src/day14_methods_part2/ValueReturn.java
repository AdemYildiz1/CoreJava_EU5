package day14_methods_part2;

public class ValueReturn {

	public static void main(String[] args) {
		
		sum(2,3);
		System.out.println(sum(2,3)); // first way for printing after returning 
		
		int x=sum(2,3); // second way for printing after returning you assign arguments to returning date type
		System.out.println(x);
	}
	
	public static int sum(int num1, int num2) {
		
		int result=num1+num2;
		
		return result;  // in java we can return just one value 
		
	}

}
