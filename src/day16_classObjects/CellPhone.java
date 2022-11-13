package day16_classObjects;

public class CellPhone {

	String brand;
	int screenSize;
	String color;
	int price;
	
	public void call() {
		String info= "brand["+brand+"],color["+color+"],price£["+price+"]";
		System.out.println(info);
		System.out.println("cool calling");
	}
	public void message() {
		System.out.println("cool messaging");
	}
	public void takeAphoto() {
		System.out.println("cool taking a photo");
	}
}
