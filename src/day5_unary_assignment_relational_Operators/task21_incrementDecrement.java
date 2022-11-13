package day5_unary_assignment_relational_Operators;

public class task21_incrementDecrement {

	public static void main(String[] args) {

		int x = 4;
		int y = x * 4 - x++;

		System.out.println("x =" + x);//5
		System.out.println("y = " + y);//4*4 - 4(x++ prints old value)

		//x in memory:4>5
		//y          :4 * 4 - 4
		
	}

}
