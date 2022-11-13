package day3_variables_dataTypes;

public class creatingVariablesInDiffirentWays {

	public static void main(String[] args) {
		
		//way-1 declaring and assigning
	int price1 = 5; 
	int quantity1= 14;
	
	  //way-2 It is said that it is best way:)
	int price2,quantity2;
	price2=100;
    quantity2=20;
    
    String s1,s2; // here no assign just declaring
    
    String name,address,country,lastname;
    name="Ozzy";
    address="USA";
    
    //way 3 (not good way:))
    int price3=5, quantity3=50;
    String s3="yes", s4="no";
    
    // way4 multiple if it is like that just last one, i3 can run
    int i1,i2,i3=0;
    
    System.out.println(i3);
    
     // int num,String value;  does not work
    int num; String valu; // it works because of ";" between them
    
    
	}

}
