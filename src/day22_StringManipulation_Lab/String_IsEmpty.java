package day22_StringManipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		// empty() it checks if the string is empty or not/it return true or false
		//remember we did an example about empty string on the day20 in login functionality example
		//we used to equals("") to get empty string. Now we can directly use empty() method
		
		String userName="";
		String password="";
		
		if(userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if(userName.isEmpty()||password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
	
	}

}
