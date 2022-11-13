package day27_arrays_part4;

public class Initializing_2DimensionalArray {

	public static void main(String[] args) {

		String[][] teams=new String[2][4]; // means 2 team 4 players
		
		//Assign elements /player --WAY 1
		teams[0][0]="Mike";  //1st team first player
		teams[0][1]="Tonny"; //1st team second player
		teams[0][2]="Smith"; //1st team third player
		teams[0][3]="Evan";  //1st team Fourth player...etc do it for 2nd team.
		
		teams[1][0]="David";  //2nd team first player.
		teams[1][1]="Emmay"; 
		teams[1][2]="John"; 
		teams[1][3]="Ryan";

		//Assign elements/Player---WAY 2
		String[][] names= {{"Mike","Tonny","Smith","Evan"} , {"David","Emmay","John","Ryan"}};
		
		// We can show it with more understandable
		
		String[][] names1= 
			 {
				{"Mike","Tonny","Smith","Evan"} , //row 0(team1)
				{"David","Emmay","John","Ryan"}   //row 1(team2)
				
		     };
	}

}
