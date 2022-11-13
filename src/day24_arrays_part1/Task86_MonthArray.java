package day24_arrays_part1;

import java.util.*;

public class Task86_MonthArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("enter the index number: ");

		int x=sc.nextInt();
		
		String [] str=new String[12];
		
		str[0]="Januarry";
		str[1]="February";
		str[2]="March";
		str[3]="April";
		str[4]="May";
		str[5]="June";
		str[6]="July";
		str[7]="August";
		str[8]="September";
		str[9]="October";
		str[10]="November";
		str[11]="December";
		
		System.out.println("The month is "+str[x]);
	}

}
