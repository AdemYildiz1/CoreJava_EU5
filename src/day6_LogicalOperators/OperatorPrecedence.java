package day6_LogicalOperators;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 20;

		boolean comp = applesCount < orangesCount || orangesCount >= pearsCount;

		// T||--------SHORT CIRCUT = T
		System.out.println(comp);
		System.out.println("************************************");

		String outside;
		int degree;
		outside = "Shinny";
		degree = 70;

		boolean comp2 = (!(outside == "Rainy" || degree == 70)); // (!(F||T) = !T = F
		System.out.println(comp2);
		System.out.println("************************************");

		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;

		// 3==2 || 2==2 && 1==2;  
		// F    || T && F
		// F||F=  F

		System.out.println(res);
		
		

	}

}
