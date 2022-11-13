package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
		 //Number + Number : Addition
		System.out.println(5+5);
		
		//Number + String: Concatenation
		System.out.println(5+"hello");
		
		//String + Boolean: Concatenation
		System.out.println("hello "+ true);
		
		//Boolean + Number
		//System.out.println(true+1); doesn't work
		
		//String + String: Concatenation
		System.out.println("hello"+"World");
		
		//Examples
		System.out.println(2+0+3+ "Cybertek");//5Cybertek(soldaki numaralari toplayip birlestitiyor)
		System.out.println("Cybertek"+2+0+5);//Cybertek205(sagdakileri toplamadan birlestiriyor)
		System.out.println(2+0+5+ "Cybertek"+2+0+5);//*!!!7Cybertek205
		System.out.println(2+0+5+ "Cybertek"+(2+0+1));//7Cybertek3(compiler is doing parenthesis individually)  
	

	}

}
