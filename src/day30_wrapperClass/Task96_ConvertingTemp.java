package day30_wrapperClass;

import java.util.Arrays;

public class Task96_ConvertingTemp {

	public static void main(String[] args) {
		
		String str="Today weather is sunny and 72 degree. It is a perfect day to practice java.";

		String[]arr=str.split("and ");
		
		arr=arr[1].split(" degree");
		
		String degree=arr[0]; //72 but it is string
		
		double degreeF=Double.parseDouble(degree);//72 now it is primitive
		
		double degreeC=(degreeF-32)*5/9;
		
		System.out.println(degreeF+" fahrenheit is equal to "+ degreeC+" Celcius");
		System.out.println(degreeF+" fahrenheit is equal to "+ Math.round(degreeC)+" Celcius"); 
		// to get rid of decimals of degreeC we used Math.round() method
	}

}
