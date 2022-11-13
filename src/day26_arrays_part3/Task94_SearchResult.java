package day26_arrays_part3;

import java.util.Arrays;

public class Task94_SearchResult {

	public static void main(String[] args) {
	
		//Create a password based on the given 2 info 
		//output: CD132G00ABC!
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] arr1=info1.split("xxx"); //split removes the delimiters and and makes an array with 3 elements
		
		String[] arr2=info2.split("xxx");
		
		System.out.println(arr1[1]+arr2[1]);
		

	}

}
