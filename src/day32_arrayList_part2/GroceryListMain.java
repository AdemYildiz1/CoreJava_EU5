package day32_arrayList_part2;

import java.util.Scanner;

public class GroceryListMain {
	/*if we created this two objects "sc" and "gList" under public as usual in main method 
	we wouldn't use them in different local method that we are going to create,
	so we created both objects under public classes by adding static key words at the beginning to generalize.
	Basically with static we can access references, variable everywhere inside the class */
	
	static GroceryList gList=new GroceryList(); //gList object ref will be able to reach what GroceryList class has.
	static Scanner sc=new Scanner (System.in); // sc ref name object will be able to reach what Scanner Class has
	
	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		
		printInstructions();
		
		while(!quit) {
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();                  //1*
			sc.nextLine();                       //REMEMBER!! after 1*  we are using 2* sc.nextLine(); so we have to put it
			
			switch(choice) {
			
			case 0:
				printInstructions();
				break;
			case 1:
				gList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit=true;
			    break;
			}		
		}		
	}
	public static void printInstructions() {
		
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
	}
	public static void addItem() {
		System.out.println("Enter your grocery item: ");
		gList.addGroceryItem(sc.nextLine());             //2*
	}
	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo=sc.nextInt();
		sc.nextLine();      //REMEMBER!!RULL!!whenever you are using string after primitive data types(int,long..etc)
		System.out.println("Enter replacement item: ");
		String newItem=sc.nextLine();
		gList.modifyGroceryItem(itemNo-1,newItem);
	}
	public static void removeItem() {
		System.out.println("Enter item number: ");
		int itemNo=sc.nextInt();
		sc.nextLine();      //REMEMBER!!
		gList.removeGroceryItem(itemNo-1);
	}
	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem=sc.nextLine();
		
		if(gList.findItem(searchItem)!=null) {
			System.out.println("Found "+searchItem+ " in your grocery list");
		}else {
			System.out.println(searchItem+" is not in the grocery list");
		}
	}
}
