package collection;

import java.util.*;

public class ArrayListProgram {
	
	public static void main(String[] args)   {
		ArrayList ls = new ArrayList();
		ls.add(1);
		ls.add(1.1);
		ls.add("character");
		ls.add('c');
		ls.add(true);
		System.out.println(ls);
		ListIterator li = ls.listIterator();
		while(li.hasNext()) {
			System.out.println("values - "+li.next());
		}
		while(li.hasPrevious()) {
			System.out.println("values -"+li.previous());
			try {
			ls.add(0);//Throws the ConcurrentModificationException while trying to add the object to list when iterator in execution
			}catch (Exception E){
				// E.printStackTrace();
				System.out.println("Exception while adding the value when the iterator is functioning");
			}
		}
		if(ls.contains(1)) {
			System.out.println(ls.size());
			System.out.println(ls.hashCode());
		}
		
	}

}
