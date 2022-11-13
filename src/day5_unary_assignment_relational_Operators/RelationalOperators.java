package day5_unary_assignment_relational_Operators;

public class RelationalOperators {

	public static void main(String[] args) {

		// just print with relational operator
		System.out.println((6 * 4) <= (3 * 4));
		System.out.println('a' < 'b');

		System.out.println("------------------------------------------------------------------");

		// declaring with variables and printing by using boolean
		byte b1 = 1;
		byte b2 = 2;
		double d1 = 3.5;
		int i1 = 17;
		float f1 = 67.0f;

		boolean test1 = b1 < b2;
		System.out.println(test1);

		boolean test2 = b1 > b2;
		System.out.println(test2);

		boolean test3 = (d1 == b1);// equals sign
		System.out.println(test3);

		boolean test4 = (d1 != b1);// ! degil/not isareti old icin != esit degil anlaminda
		System.out.println(test4);

		boolean test5 = ((i1 * d1) >= (f1 - 42));
		System.out.println(test5);

	}

}
