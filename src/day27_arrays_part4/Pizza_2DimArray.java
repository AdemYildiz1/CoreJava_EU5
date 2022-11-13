package day27_arrays_part4;

import java.util.Arrays;

public class Pizza_2DimArray {

	public static void main(String[] args) {
		
		String[][] pizzas= {
				{"pineapple","pepperroni"}, // row-0
				{"anchoives", "mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};

		System.out.println(Arrays.toString(pizzas[0]));// prints array in row 0.
		
		// 1- here we get each ARRAY with FOR EACH LOOP
		for(String[] pizza:pizzas) {    // we want array SO we need []
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println("---------------");
		// HERE for ITERATOR LOOP
		for(int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
		    System.out.println(Arrays.toString(pizzas[i]));
			}
		//2-HOW to print each ELEMENT in specific row 
			for(String value:pizzas[3]) { // we don't want array we want to print each element in row 3
				System.out.println(value);//chicken tomatoes onions.	
			}
		//examples(combine 1 and 2 for each loop (above)
			//lets get id of student one by one
			
			int[][] students= {{4,5,6},{12,5,7},{23,56,12,55,3}};
			
			for(int []group:students) { //  we called each row/array for having group so we use [] sign
				for(int studentID:group) { // then we call all id in each group
					System.out.println(studentID);
				}
			}
			
			
			
		}
	}


