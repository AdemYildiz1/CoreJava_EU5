package day47_collection_part2;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
	//We can do in Stack Last-In, First-Out (LIFO)

		//1-class object way
		Stack<Integer> numStack=new Stack<>();
		numStack.add(50);
		numStack.add(100);
		numStack.add(150);
		
		System.out.println(numStack.toString());//[50, 100, 150]
		
		//add the value, we can do it numStack.add() as well
		numStack.push(200);
		
		System.out.println(numStack.toString());//[50, 100, 150, 200]  last-in(200)
		
		//Remove the value
		numStack.pop(); 
		
		System.out.println(numStack.toString());//[50, 100, 150]  first-out(200) that was last in
		
		//peek(); method reeds the value on the top. 
		System.out.println(numStack.peek());//150
		
		// 2- in polymorfic way
		Vector<Integer> numStack1=new Stack<>();
		//here if we want to access the methods  stack has such as pop(), peek(),push()
		//we need down-casting REMEMBER!parent decides accessing.
		
		
	}

}
