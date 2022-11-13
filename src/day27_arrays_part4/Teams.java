package day27_arrays_part4;

public class Teams {

	public static void main(String[] args) {
		 
		//Create two teams that have specific players
		
		String[][] teams=new String[2][4]; // means 2 team 4 players
		
		teams[0][0]="Mike";  //1st team first player
		teams[0][1]="Tonny"; //1st team second player
		teams[0][2]="Smith"; //1st team third player
		teams[0][3]="Evan";  //1st team Fourth player...etc do it for 2nd team.
		
		teams[1][0]="David";  
		teams[1][1]="Emmay"; 
		teams[1][2]="John"; 
		teams[1][3]="Ryan";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);//Mike
		
		//How many teams,players we have!
		
		System.out.println("Number of rows/teams: "+teams.length);//2 
		System.out.println("# People in first team: "+teams[0].length);// array/team in row 0 has 4.
		System.out.println("# People in second team: "+teams[1].length);//array/team in row 1 has 4.
		
	}

}
