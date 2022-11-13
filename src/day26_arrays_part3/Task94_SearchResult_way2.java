package day26_arrays_part3;

import java.util.Arrays;

public class Task94_SearchResult_way2 {

	public static void main(String[] args) {
	
		//Create a password based on the given 2 info 
		//output: CD132G00ABC!
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] infoArray1=info1.split("password :");//it removes "password :" and makes an array with 2 elements
		String[] infoArray2=info2.split("password :");

		String pass1=infoArray1[1].split(". Please")[0];// xxxCD132Gxxx 
		String pass2=infoArray2[1].split(". Please")[0];// xxx00ABC!xxx 
		
		pass1=pass1.substring(4, 10);
		pass2=pass2.substring(4, 10);
		
		System.out.println(pass1.trim()+pass2.trim());
		
		
		//String pass1=infoArray1[1].split(". Please")[0]; it is the same example (below)
		
		String[] names={"Ali, Mehmet"};
		String s=names[0];// Ali
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
