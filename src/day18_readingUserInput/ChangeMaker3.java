package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker3 {

	public static void main(String[] args) {
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of 
		//change
		//quarter=25 cents   //dimes=10 cents   //nickles= 5 cents   //pennies= 1 cent
   
		//give 3 chances if attempts are not correct yet say "sorry" finish it
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number from 1-99:");
		int attempt=0;
		
		do {
			int user_amount=sc.nextInt();
			
			if (user_amount>1&&user_amount<100) {
				changeMaker(user_amount);
				break;
			}else {
				attempt++;
				if(attempt==3) {
					System.out.println("sorry no more attempt");
					break;
				}else{
					System.out.println("try again");
				}
			}
			
		}while(true);
		
	}
	public static void changeMaker(int amount) {
		
        int originalAmount=amount;
		
		int quarters = amount/25; // 87/25=3
		amount=amount%25;//12
		int dimes=amount/10; //12/10=1
		amount=amount%10;//2
		int nickles=amount/5; // 2/5=0
		amount=amount%5;
		int pennies=amount; // 2
		
		System.out.println(originalAmount+" cents in coin can be given as:");
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickles+" nickles");
		System.out.println(pennies+" pennies");	
	}
}
