package day24_arrays_part1;

import java.util.*;

public class Task88_CarsArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		Random rn=new Random ();
		
		String[] cars=new String[7];
		
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="BMW";
		cars[4]="Mercedes";
		cars[5]="Porsche";
		cars[6]="Ferrari";
		
		System.out.print("Enter index number to select car ");
		int index=sc.nextInt();
		
		if (index==0||index==1||index==2) {
			System.out.println("Price of  "+cars[index]+" is "+rn.nextInt(((200000)+1)+200000));
			
		}else if(index==3||index==4) {
			System.out.println("price of "+ cars[index]+" is "+rn.nextInt(((300000)+1)+500000));
			
		}else if(index==5||index==6) {
			System.out.println("price of "+ cars[index]+" is "+rn.nextInt(((500000)+1)+100000));
		}else {
			System.out.println("invalid selected");
		}

	}

}
