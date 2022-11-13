package day25_arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {
	
		String[] product= {"Timberland","Shirt","Watch","bag","Shoes"};
		
		for(int i=0; i<product.length; i++) {
			System.out.println(product[i]);
		}
		System.out.println("---------------");
		//we can get same result with "FOR EACH LOOP"
		// "for Each Loop" we use it without index number and use any name with array's variable
		// "for Each Loop" is used with just ARRAY.
     
		for (String prd:product) {
			System.out.println(prd);
		}
		System.out.println("---------------");
		double[]prices= {120.0, 12.99, 300, 25, 67.89};
		
		for (double money:prices ) {
			System.out.println(money);
		}
		System.out.println("---------------");
		//example; print products in reverse order
		//for this example we can not use "for each loop" because it needs index number
		
		for(int i=product.length-1; i>=0; i--) {
			System.out.println(product[i]);
		}
	}

}
