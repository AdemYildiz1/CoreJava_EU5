package day18_readingUserInput;

import java.util.Scanner;

public class Task74_PositiveNumberTotal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int userNumber=0;
		int sum=0;
		
		do{
			System.out.print("Enter numbers:");
			userNumber=sc.nextInt();
			
			if(userNumber<0) {
				break;
			}else {
			sum=sum+userNumber;
			}
			
		}while(true);
		System.out.println("total= "+ sum);
	}

}
