package day16_classObjects;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		CellPhone phone1=new CellPhone();
		CellPhone phone2=new CellPhone();
		
		phone1.brand="iphone7";
		phone1.color="black";
		phone1.price=100;
		
		
		//System.out.println(brand); gives error
		//So we can not call class properties directly you need to call them with object name like (below)
		System.out.println(phone1.brand+" "+ phone1.color +" color is $"+phone1.price);
		
        
		phone1.call();
		
		phone2.brand="Samsung 10";
		phone2.screenSize=7;
		System.out.println(phone2.brand+ " screenSize is "+ phone2.screenSize);
		phone2.price=39;
		phone2.color="black";
		
		System.out.println("#####PHONE 2 VALUES ####");
		System.out.println("Brand: "+ phone2.brand);
		System.out.println("Screen size: "+ phone2.screenSize);
		System.out.println("COLOR: "+ phone2.color);
		
		System.out.println("#####Calling methods####");
		
		phone2.takeAphoto();
		phone2.message();
		phone2.takeAphoto();
	}

}
