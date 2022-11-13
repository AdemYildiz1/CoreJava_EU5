package day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args)  {
	
	//throw:  you are throwing your error manually by using RuntimeException class. 
		
	//throws/throws clause: for handling exception  	
	//while declaring "throws exception" comes to next to the method 
	//which means there is some error/exception in method so it wants to throws/declare them	
	//!! if one is calling this method that has "throws exception" next to it the one is responsible for handling it or redeclare it
		
	//handling can happen with try/catch
		
		//eq-1, throw
		System.out.println("Hello world");
		
		//throw new RuntimeException("This is some exception");
		
		//eg-2, throw
		String username="";
		
	if (username.isEmpty()) {
		throw new RuntimeException("User name can not be empity"); //manually we wrote this error/exception
	}else {
		System.out.println("Valid username");
	}
	System.out.println("------------------------------");
	
	try {
		sleep3(2000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	   }
	
	}
	//eg-1 throws  (lets call and handle last sleep method(3) in the main method)
	public static void sleep(int seconds) throws InterruptedException {
		 Thread.sleep(seconds*1000);
	}
	public static void sleep2(int seconds) throws InterruptedException  {
		 sleep(seconds); //after calling we declared throws
	}
	public static void sleep3(int seconds) throws InterruptedException  {
		 sleep2(seconds);
	}
	
	
	
}

