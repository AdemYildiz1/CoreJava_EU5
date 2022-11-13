package day27_arrays_part4;

public class RaggedArray {

	public static void main(String[] args) {
		
		int[][]array=new int[4][]; // column might change 
		
		System.out.println(array[0]);// default=null 
		
		array[0]=new int[3]; // means, we assigned 3 elements/columns to row 0
		array[1]=new int[4]; //means, we assigned 3 elements/columns to row 1..etc
		array[2]=new int[5];
		array[3]=new int[2];
		
		System.out.println(array[0][0]);//default=0  after column assigned
		
		int[][] array2= {{0,0,0},{0,0,0,0},{0,0,0,0,0},{0,0}}; //it is the same as above
		
	}

}
