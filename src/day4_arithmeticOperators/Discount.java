package day4_arithmeticOperators;

public class Discount {

	public static void main(String[] args) {
		
		/*this program calculates the sale price an item
		  that is regularly priced at 59$, with a 20% discount on it
		*/
		int RegularPrice=59;
		double Discount;
		double SalesPrice;
		
		 Discount=RegularPrice*0.2;
		 SalesPrice=RegularPrice-Discount;
		 
		 System.out.println("RegularPrice: $"+ RegularPrice);
		 System.out.println("Discount Amount: $"+ Discount);
		 System.out.println("Sales Price: $"+ SalesPrice);
		
	}

}
