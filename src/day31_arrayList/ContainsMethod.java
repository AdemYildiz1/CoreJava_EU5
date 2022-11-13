package day31_arrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String>list1=new ArrayList<>();
		
		list1.add("jan");
		list1.add("feb");
		list1.add("mar");
		list1.add("apr");
		list1.add("may");
		
		System.out.println(list1.toString());
		
		ArrayList<String>list2=list1; //Remember !list2 is referencing to list1 any changes affect both array list
		
		//copy all values from list1
		ArrayList<String>months=new ArrayList<>(list1); //but here we coppied list1 to months object
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months);//[jan, feb, mar, apr, may, Jun, July, Aug]
		
		System.out.println(months.contains("jan"));//true
		System.out.println(months.contains("Dec"));//false
		
		//how to check an element in array list in their own position
		System.out.println(months.indexOf("feb")==1);  //true
		            //or
		System.out.println(months.get(1).equals("feb"));//true
		
		//containsAll(): 
		
		if(months.containsAll(list1)) {
			System.out.println("Months have all list1"); //it is printed so we already copied list1 to months 
		}else {
			System.out.println("some values are missing");
		}
		
	}

}



