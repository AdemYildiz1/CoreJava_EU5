package day24_arrays_part1;

public class LengthOfArray {

	public static void main(String[] args) {
		
		
		int[] myList= {10,20,30,40};
		
		String[] myArray= {"apple","orange","banana"};
		
		//arrayname.length gives us size of ARRAY (!!!length here is not method it is property)
		//Basically, it gives how many elements we have in our ARRAY
		
		System.out.println(myList.length);//4
		System.out.println(myArray.length);//3
		
		//examples;
		//print each element separately.
		
		int[] myList1= {10,20,30,40};
		
		for(int i=0; i<myList1.length; i++) {
			System.out.println(myList1[i]);
			
		}
	}

}
