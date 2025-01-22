package collection;

import java.util.*;

public class SortedSet {
	public static void main(String[] args) {
		TreeSet<String> sr= new TreeSet<String>();
		sr.add("Hello");
		sr.add("World");
		sr.add("to");
		System.out.println(sr);
		Iterator li = sr.iterator();
		for(Object o: sr) {
			System.out.println(o);
		}
	}

}
