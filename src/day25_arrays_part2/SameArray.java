package day25_arrays_part2;

public class SameArray {

	public static void main(String[] args) {
		//references to same array
		
		int[] array1= {2,4,6,8,10};
		
		int[] array2= array1; // here array2 is referencing to values(elements) of array1.

		array1[0]=200;
		
		array2[4]=1000;
		
		System.out.println("the content of array1:");
		for(int val : array1) {
			System.out.println(val);
		}
		System.out.println();
		
		for(int val : array2) {
			System.out.println(val);
		}
		// we can see that array1 and array2 affected in same way so both references to same values
	}

}
