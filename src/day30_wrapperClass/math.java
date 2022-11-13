package day30_wrapperClass;

public class math {

	public static void main(String[] args) {
	
		// we do not import it because it is already in lang Package.
		double result= Math.pow(4.0, 2.0);
		System.out.println(result);
		
		double res2=Math.sqrt(25.0);
		System.out.println(res2);
		
		final double PI=Math.PI;
	    System.out.println(PI);
	    
	    System.out.println(Math.round(4.6));//5'e yuvarlar.
	    System.out.println(Math.round(3.2));//3'e yuvarlar.
	    
	    // Math.floor and Math.ceil: yakinliga bakip yuvarlamaz direk tavan ceker yada zemine ceker 
	    System.out.println(Math.floor(4.6));//4'e iner
	    
	    System.out.println(Math.ceil(4.2));//5'e cikar.
	
	}

}


