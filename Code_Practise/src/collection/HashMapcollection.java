package collection;

import java.util.*;

public class HashMapcollection {
	public static void main (String[] args) {
		
		HashMap <Integer,String> r= new HashMap<Integer,String>();
	    r.put(1, "Sample");
	    r.put(2, "program");
	    System.out.println("Value at key 1 is "+r.get(1));
	    for(Map.Entry<Integer, String> e: r.entrySet()) {
	    	System.out.println("Key - "+e.getKey()+ "---"+"Values - "+e.getValue());
	    	
	    }
		
	}

}
