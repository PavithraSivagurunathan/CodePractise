package collection;

import java.util.*;

public class Dequeue {
	public static void main(String[] args) {
		ArrayDeque <Integer> arq = new ArrayDeque <Integer> ();
		arq.add(1);
		arq.add(4);
		arq.addFirst(0);
		arq.addLast(8);
		System.out.println(arq);
		//arq.clear();
		//System.out.println(arq);
		
	}

}
