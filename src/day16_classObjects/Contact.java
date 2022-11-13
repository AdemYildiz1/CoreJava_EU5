package day16_classObjects;

public class Contact {

	String name;
	int phoneNumber;
	String email;
	
	public void call() {
		System.out.println(name + " is calling ");
	}
	public void sendMessage() {
		System.out.println(name + " is sending message to"+ phoneNumber);
	}
	public void sendEmail() {
		System.out.println(name+ " is sending email ");
	}
}
