package day42_interface;

public class Tesla2 extends Vehicle implements Electric,SelfDriving {

	//unlike abstraction, we use implements for interface NOT Extends
	//we can implements more then one interfaces, which means interfaces support multiple inheritance

	  
	@Override
	public void charge() {

	}
	@Override
	public void charge2() {
		
	}
	@Override
	public void selfDrive() {
		
	}
	

}
