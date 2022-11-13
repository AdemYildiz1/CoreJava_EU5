package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {
		
		//how to access the values, we use "array name[5]" in system
		// "array name[5], 5 here is index number and index start from 0 like we learnt in class and object
		
         int[] numbers=new int[4];
		float[] temp=new float[100];
		char[] letters=new char[40];
		long[] units= new long[50];   
		String words[]=new String[5];
		
		System.out.println(numbers[3]); // 0, it is default value because we don't have still values
		System.out.println(temp[7]); //0,0 default
		System.out.println(words[3]); // null, because string default is null
		System.out.println(units[50]);// it is out of bounds because for size 50 the index max is 49.
		
	}

}



