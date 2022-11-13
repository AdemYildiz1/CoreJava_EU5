package day20_StringManipulation_Part2;

import java.util.Scanner;

public class Task82_LoginFunctionality {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your user name: ");
		String userName=sc.nextLine(); //actual user name that user enters.
		
		System.out.print("Enter your user password: ");
		String password=sc.nextLine(); //actual password that user enters.
		
		String userNameInSystem="Mike"; //expected user name.
		String passwordInSystem="123";  //expected password.
		
		if(userName.equals("") && password.equals("")) {
			System.out.println("User name and password can not be empty");
		}else if(userName.equals("") && !password.equals("")) {
			System.out.println("Username can not be empty");
		}else if(!userName.equals("") && password.equals("")) {
			System.out.println("password can not be empty");
		}else if(!userName.equals(userName) || !password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid please verify");
		}else if(userName.equals(userName) && password.equals(passwordInSystem)) {
			System.out.println("User log in succesful");
		}
		
		
	}
}
