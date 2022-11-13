package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer>numList=new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		//1- means write method that accepts an ArrayList(numList) and print one by one
		printList(numList);
		
		System.out.println("\n------------");
		
		ArrayList<Double>doubleList=new ArrayList<>();
		doubleList.add(10.13);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		//2- means write a method that accepts an ArrayList(doubleList) 
		//then finds total value and returns it to primitive double!
		double sum=sumList(doubleList);
		System.out.println(sum);
		
		System.out.println("------------");
		
		//3- it means, just call a method that accepts integer value 
		//The method returns the value( its size is 15) to an ArrayList( that is assigned to the ArrayList in the method), 
		//Finally, print this ArrayList.
		ArrayList<Integer>list=getList(15);
		System.out.println(list.toString());
		
		System.out.println("------------");
		
		//4-it means just call a method that accepts 20 random values,assign them and returns them to an ArrayList, then print it
		ArrayList<Integer>rList=getRandomList(20);
		System.out.println(rList.toString());
		
		System.out.println("------------");
		
		ArrayList<String>strNums=new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		//5- it means write a method that accepts the arrayList(strNums) that has strings 
		//returns it to new ArrayList(converted) that has int objects
		ArrayList<Integer>converted=convertToIntList(strNums);
		System.out.println(converted);
		
		}//1
		public static void printList(ArrayList<Integer>nums) {
			
			for(Integer value:nums) {
				System.out.print(value+" ");	
		    }
			
	    }//2
		public static double sumList(ArrayList<Double>total) {
			double sum=0;
			
			for(Double value:total) {
				sum=sum+value;
			}
			return sum;
			
		}//3
		public static ArrayList<Integer> getList(int size) {
			
			ArrayList<Integer>newList=new ArrayList<>();
			
			for(int i=0; i<=size; i++) {
			 newList.add(i);
			 
			}
			return newList;
			
		}//4
		public static ArrayList<Integer> getRandomList(int size){
			
			Random r=new Random ();
			
			ArrayList<Integer>randomNums=new ArrayList<>();
			
			for(int i =1; i<=size; i++) {
				
				randomNums.add(r.nextInt(101));
			}
			return randomNums;
			
		}//5
		public static ArrayList<Integer> convertToIntList(ArrayList<String>strList){
			
			ArrayList <Integer>newList=new ArrayList<>();
			
			for(String str:strList) {
				
				newList.add(Integer.parseInt(str));
			}
			return newList;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
			

}
