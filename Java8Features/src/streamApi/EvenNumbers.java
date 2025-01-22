package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenNumbers {
	public static void main(String[] args) {
		
		List <Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream <Integer> r = li.stream().filter(m -> m%2 ==0).map( d -> d*d);
		r.forEach(j ->System.out.println(j));
		
	}

}
