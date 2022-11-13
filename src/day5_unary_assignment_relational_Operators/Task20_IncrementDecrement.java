package day5_unary_assignment_relational_Operators;

public class Task20_IncrementDecrement {

	public static void main(String[] args) {

		int a = 1;

		a = -a-- + a++ / -a-- * --a;// soldan okumaya baslar tum pre ve post hesabindan sonra islem sirasi yapilir

		System.out.println("a = " + a);
		
	}

}
