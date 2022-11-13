package day4_arithmeticOperators;

public class Casting_ImplicitAndExplicit {

	public static void main(String[] args) {

		//Implicit Casting
		int x= 'A';
		  System.out.println(x);//Print: 65
		double d= 20;  
		  System.out.println(d);// print: 20.0(20 den sonra decimal gibi gosterir)
		  
		 /*CONCLUSION:
		   1-Done by compiler
		   2-smaller data type to bigger data type
		   3-it is called widening
		   4-no loss of data
		  */
		  
		//Explicit Casting
		  int y= 130;
		  //byte b=y; Does not work so if we insist we have to write in parenthesis (byte)
		  byte b = (byte)y;
		  
		  System.out.println(b);//print: -126
		  
		  /*CONCLUSION:
		   1-Done by programmer
		   2-Bigger data type to smaller
		   3-It is called narrowing
		   4-loss data
		   */
          
		  // a bit different example
		  
		  int pies=10, people=4;
		  double piecesPerson;
		  piecesPerson= (double)pies/people;// print: 2.5
		  piecesPerson= pies/(double)people;// print: 2.5 
		  piecesPerson= pies/people;// print: 2.0
		  piecesPerson= (double)(pies/people);// print: 2.0 ="(double) int/int" so you are dividing int/int than casting to double thats why it is 2.0 
		  System.out.println(piecesPerson);
		  
		  
		  
		  
		  

	}

}
