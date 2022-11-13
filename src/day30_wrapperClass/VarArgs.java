package day30_wrapperClass;

public class VarArgs {

	public static void main(String[] args) {
		
		sum(2, 4);
		sum(2, 4,5,6);                     
			                                 //varArg/variable arguments:
                                            // varArg(variable type...name) accepts elements convert it to array                          
	}    //example 1                        //so instead of writing new method(overloading) 
	public static void sum(int...numbers) { //we can use varArg parameter (put 3 full stop and name it becomes array name)
		                                    //then that varArg parameter can take variable number of arguments.
		int sum =0;
		
		for(int value : numbers) {
			 sum=sum+value;
		}
		System.out.println(sum); //it prints each of them
	}
	    //example 2
	public static String concat(String...strs) { // This varArg accepts arguments an make strs array. 
		                                         //then we can use this array where we want
		String newStr="";
		for(String str:strs) {
			
			newStr = newStr+str.charAt(2);
		}
		return newStr;
	}

}



