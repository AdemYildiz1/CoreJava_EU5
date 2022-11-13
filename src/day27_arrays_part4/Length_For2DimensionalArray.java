package day27_arrays_part4;

public class Length_For2DimensionalArray {

	public static void main(String[] args) {

		int[][] numbers= {
				{1,2,3,4},             //row-0 (this is an array in row 0)
				{5,6},                 //row-1 (this is an array in row 1)
				{9,10,11,23,30,50,60}  //row-2 (this is an array in row 2)
		};

		//display the numbers of row(like how many arrays)
		System.out.println(numbers.length);//3

		//display the number of columns/elements in each row
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("number of column in "+i+" is "+numbers[i].length);
		}
		System.out.println("--------------");
		//print each rows that have columns
		
		for(int i=0; i<numbers.length; i++) {          // i is rows number
			for(int j=0; j<numbers[i].length; j++) {   //  j is column number
				System.out.println(numbers[i][j]);
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
