package streamApi;

import java.util.*;

public class SumofDigit {
	public static void main(String[] args) {
		List<Integer> r=new ArrayList<Integer> ();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(5);
		System.out.println(r);
		int sc=r.stream().mapToInt(n ->n).sum();
		System.out.println(sc);
		
	}

}
