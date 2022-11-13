package day6_LogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;

		boolean res1 = (i1 == i2) & (c1 == c2);// F & T = F
		boolean res2 = (i1 == i2) && (c1 == c2);// F&&----= F (SHORT-CIRCUT) if first is F, 
												// java doesn't care second expression.
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);

		boolean res3 = (c1 == c2) | (i1 == i2);// T|F=T
		boolean res4 = (c1 == c2) || (i1 == i2);// T||---- SHORT CIRCUT
		System.out.println(res3);
		System.out.println(res4);
		
		boolean res5 = (c1 == c2) ^ (i1 == i2);//T^F=T
		boolean res6 = (c1 == c2) ^ (i1 != i2);// T^T= F
        System.out.println(res5);
        System.out.println(res6);
        
        
	}

}
