package day44_oopreview.callcenter;

public class CallCenter {

	public static void main(String[] args) {
		//REMEMBER!, I can just create object in this class 
		//There can NOT be creating object or any instantiating in abstract class or in interfaces.
		
		WhatsApp wa=new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="Whats App";
		wa.call("Ozzy");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();   //static methods and variables in interfaces can be called with its name
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.setCount(4);
		wa.getCount();
		System.out.println(wa.getCount());
		
		System.out.println("-----------------");
		
		//polymorfic way
		VoiceCallable obj =new WhatsApp();
		
		//To be able to access method in child class that is not overridden, then we do casting in 2 ways
		//Here u can use MessagingApp or WhatsApp that extends MessagingApp as a child.
		//1-
		WhatsApp obj2= (WhatsApp)obj;  
		obj2.launch(); //launch() method in MessagingApp class
		
		MessagingApp obj3= (MessagingApp)obj;  
		obj3.launch();
		
		//2- direct casting
		((WhatsApp)obj).launch();
		
		((MessagingApp)obj).launch();
		
		((MessagingApp)obj).allOSCompatible=false;
		
		
		obj.call("Mr Tom"); //REMEMBER!,Parent(reference type make a decision) it is in parent So we can access directly.
		
		//((MessagingApp)obj).videoCall(); error
		
		((WhatsApp)obj).videoCall();
		
		((VideoCallable)obj).videoCall(); //whatsApp is implementing so we can do
		
		
		
		

		
	}

}
