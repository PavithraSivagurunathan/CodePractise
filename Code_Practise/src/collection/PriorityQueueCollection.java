package collection;

import java.util.*;

public class PriorityQueueCollection {
	
	public static void main(String[] args) {
		Queue t=new PriorityQueue();
		t.add('u');
		t.add('e');
		t.add('r');
		Queue t1 =new PriorityQueue(t);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t.peek());// Print the top element on the queue based on their functional order even though the priority queue is for of FIFP
		System.out.println(t.poll());
		System.out.println(t.peek());
		System.out.println(t);
	}
	

}
