package day26_arrays_part3;

public class Array2Dimensional {

	public static void main(String[] args) {
		//int[]   is 1 Dimensional Array
		//int[][] is 2 Dimensional Array, think of first bracket is like row second is like column
        //int[n][] filling first bracket is mandatory second bracket might change it is optional
		//2 Dimensional Array is an array of arrays
		//if you want to save a date in a table format then we use 2 Dimensional Array.
		
		int [][] scores=new int[3][4]; // 3 rows keep 3 arrays with 4 indexes number each
		
		System.out.println(scores[0]);// give address of first row
		System.out.println(scores[1]);//give address of second row
		
		//print first row
		System.out.println(scores[0][0]);//0 we did not assign yet so it gives default
		System.out.println(scores[0][1]);//0
		System.out.println(scores[0][2]);//0
		System.out.println(scores[0][3]);//0
		
		//print second row
		System.out.println(scores[1][0]);//0 we did not assign yet so it gives default
		System.out.println(scores[1][1]);//0
		System.out.println(scores[1][2]);//0
		System.out.println(scores[1][3]);//0
		
		//Print third row
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		
		System.out.println("----------------------------");
		
		//Assigning the elements 
		scores[0][0]=10; // 1st row of first column is 10
		scores[0][1]=20;// 1st row of second column is 20
		scores[0][2]=30;
		scores[0][3]=40;
		
		scores[1][0]=50;// 2nd row of first column is 50
		scores[1][1]=60;// 2nd row of second column is 60
		scores[1][2]=70;
		scores[1][3]=80;
		
		scores[2][0]=90; // 3nd row of first column is 90
		scores[2][1]=100;// 3nd row of second column is 100
		scores[2][2]=110;
		scores[2][3]=120;
		
		//LETS PRINT AFTER Assigning first row
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		
	}

}
