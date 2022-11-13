package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac=new Mac();
		mac.use();
		//mac.code(); no accessible, So It gives ERROR. We first check parent(reference type ).
		
		//(acikcasi polymorphismde, aranan method parent ta yoksa direct error zaten, )
		//it is not overridden in child and it is NOT in Parent class as well. 

		Mac myMac=new Mac();
		myMac.use();
		myMac.code(); // here is tottaly fine it is not created in polymorfic way. Mac class has both methods
		
		AppleDevice watch=new AppleWatch();
		watch.use();
		
		 
		             
	}

}
