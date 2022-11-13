package day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {
		//PARSING converts string type to primitive(int, double...etc) by using methods of wrapper classes.
		
		String numberAsString="2018";
		System.out.println(numberAsString); // 2018 here is in a string type
		
		int number=Integer.parseInt(numberAsString); // here string "2018" is converted to primitive 
		System.out.println(number);// 2018 here is not string so we can use it in any algorithm 
		
		
		numberAsString=numberAsString+1;
		number=number+1;

		System.out.println(numberAsString);//20181 here num 1 is concatenated to string 
		System.out.println(number);        //2019 here num 1 is added to number
		
		//example
		
		double number2 =Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		//OPPOSITE OF PARSING/ converting integer to string
		//1st way to make a string
		int i=10;
		String s=String.valueOf(i); 
		System.out.println(s);     //it will return primitive 10 to the string "10"
		
		//2. way to make a string
		String s2=Integer.toString(i);
		System.out.println(s2);  //it will return primitive 10 to the string "10"
		
		
		
	}
	

}


