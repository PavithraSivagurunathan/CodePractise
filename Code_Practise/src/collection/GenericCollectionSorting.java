package collection;


import java.util.*;

public class GenericCollectionSorting {
	
	public static void main (String[] args) {
		Stack <Integer> r = new Stack<Integer>();
		r.push(1);
		r.push(8);
		r.push(4);
		System.out.println(r);
		Iterator li =r.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		Collections.sort(r);
		System.out.println(r);
		int re=r.peek();
		System.out.println(re);
		r.pop();
		System.out.println(r);
		r.pop();
		System.out.println(r);
	}

}
