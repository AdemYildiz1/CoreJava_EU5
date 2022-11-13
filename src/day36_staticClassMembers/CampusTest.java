package day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		//if you have static block it will run and first time and before anything even before object creating 
		//because definition of Static block says whenever class loading it runs.
		
		Campus c1=new Campus("McLean");
		Campus c2=new Campus("Arlington");
//
		System.out.println(Campus.country);//UK, Because class was uploaded with static block-1
		                                   //then static block-2 replaced with first so "UK" is printed.
		
		
		
	}

}
