package day39_inheritance_review_AccessModofiers;

public class Toyota extends Car{

	private int roadService;

	public Toyota(int roadServices) {          //because(below) I hardcoded in super(); I cleaned assigning variables in here 
		super("Toyota", "4DW", 4, 4, 6, false);//for toyota class car is now parent class
		this.roadService = roadService;
	}

	public void accelerate(int rate) {
		
		int newVelocity= getCurrentVelocity()+rate;
		
		if (newVelocity==0) {
			stop();
			changeGear(1);
		}else if(newVelocity>0&&newVelocity<=10) {
			changeGear(1);
		}else if(newVelocity>10&&newVelocity<=20) {
			changeGear(2);
		}else if(newVelocity>20&&newVelocity<=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDriection());
			
		}
		
	}
	
}
