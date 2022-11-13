package day26_arrays_part3;

public class StringManupilation_InArray {

	public static void main(String[] args) {
		
	/*How to Call "string methods" from "Array Element"
	-Keep in mind! we have two length concept 
	-one is "names.length" =ARRAY SIZE, for array it is property/field 
	-other is our String method with parenthesis "names[1]length()" STRING SIZE of Element that has 1 index number.
	*/	
		String[] myCars= {"Honda","Mercedes","BMW","Toyoto","Ford  "};
		
		System.out.println(myCars[0].length());//5
		System.out.println(myCars[1].charAt(2));//r It means go string of index[1], print its char of index[2]
		System.out.println(myCars[4].trim()); //Ford (with no spaces)
		System.out.println(myCars[2].substring(2, 3));//
		System.out.println(myCars[1].equals(myCars[2]));// false 
		System.out.println(myCars[1]==myCars[2]);//false

		System.out.println("-----------------------");
		// example; How can I print each length"
		
		for(int i=0; i<myCars.length; i++) {
			System.out.println(myCars[i].length()); //it gives each element length of myArray
		}
		
		
	}

}
