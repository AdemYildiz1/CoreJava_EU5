package day5_unary_assignment_relational_Operators;

public class MixedInteger {

	public static void main(String[] args) {
		
		int i1= 5;
		int i2= 10;
		float f1=15.5f;
		double d1= 20.5;
		
		int res1=i1+i2;
		float res2=i1+f1;
		double res3=i2+d1;
		
		//RULE***!!if you use "BYTE and SHORT" for any arithmetic calculation they are converted to int.
		// you can convert it in two ways by putting integer or explicit casting 
		short firstNumber=10;
		short secondNumber=20;
		
		int thirdNumber=firstNumber+secondNumber;// first way
		short thirdNumber2=(short)(firstNumber+secondNumber);// second way
		
		byte b1=20;
		byte b2=2;
		
		int b3 =b1*b2;// first way
		byte b4= (byte)(b1*b2);//second way
		
		int b5=20;
		int b6=30; 
		byte res = (byte)(b5+b6);// if you try to put in into smaller (byte) so casting is required
		
		byte resx=126+1;// it seems fine even both byte numbers,they are directly number. so casting is not required.  
		                //thats why our rule is valid if structure is through variable arithmetic
		

	}

}
