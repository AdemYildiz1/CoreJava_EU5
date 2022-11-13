package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//we can do in Queue First-In, First-Out (FIFO)
		 
		// remember collection frame work linkedList implements Queue interface
		
		Queue<String>queue = new LinkedList<>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya"); //First-in 
		
		System.out.println(queue.remove()); // first-out (Mike) 
		System.out.println(queue.toString());//[Ozzy, Jamal, Asiya]
		
		//removing element from queue using poll();
		// poll() is similar to remove() except that it returns null if queue is empty.
		
		queue.poll(); 
		System.out.println(queue.toString());//[Jamal, Asiya]
		
		//peek(); check first element
		System.out.println(queue.peek());
		
	}

}
