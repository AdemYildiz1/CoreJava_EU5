package day24_arrays_part1;

public class TypesOfArrayDeclaration_And_Initialization {

	public static void main(String[] args) {

	//Way 1- initialization

	int[] myList=new int[4];
	
	myList[0]=10;
	myList[1]=20;
	myList[2]=30;
	myList[3]=40;
	
	// Way 2- initialization Easiest way:)
    // We don't use "new" key word
	int[] myList1= {10,20,30,40};   
	
	System.out.println(myList1[0]);//10
	System.out.println(myList1[1]);//20
	System.out.println(myList1[2]);	
	System.out.println(myList1[3]);

	//Examples
	
	String[] myArray= {"apple","orange","banana"};
	
	System.out.println(myArray[0]);//apple
	
	
	
	
	}

}


