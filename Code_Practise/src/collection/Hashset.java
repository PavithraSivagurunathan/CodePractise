package collection;

import java.util.*;

public class Hashset {
	public static void main(String[] args) {
		Set<String> s =new HashSet<String>();
		s.add("hello");
		s.add("world");
		s.add("hello");// Do not accept duplicate values , not ordered and cannot be accessed with index
		System.out.println(s);
		LinkedHashSet <Integer> r= new LinkedHashSet<Integer> ();
		r.add(1);
		r.add(5);
		r.add(34);
		r.add(5);
		System.out.println(r);
		
	}

}
