package day5_unary_assignment_relational_Operators;

public class unaryOperators {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = -100;
		int i3 = -(i1 + i2);

		System.out.println("i3 " + i3);

		boolean flag = true;
		System.out.println(!flag);// print: false "!" inverts
		System.out.println(!!flag);// print: true

		// pre-increment pre-decrement
		int b = 25;

		System.out.println(++b);//25, direk 1 artar ayni line da
		System.out.println(--b);//26 direk 1 azalir ayni line da
		
		//post-increment , post-decrement
		int b1 = 25;

		System.out.println(b1++);//25,bu ifade soyle okunur:print old value(b1), but increase memory by 1
		System.out.println(b1--);//26 print old value (26, memoryde olani) but decrease memory by 1
		
  // examples
		int i = 10, j = 5;
		i++; // same as i=i+1;
		--j;// same as j=j-1;

		System.out.println("i = " + i);
		System.out.println("j = " + j);

		// i=11, j=4  artik "i" =11 j=4
		int res = i++ + --j;

		System.out.println("res = " + res);// prints old value so i=11 (remember post-incremenet) memory increase by 1
                                           // increase by 1 and print so j=3
		                                   // finally, res=14
		
		
	}

}
