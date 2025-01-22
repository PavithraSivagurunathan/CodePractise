package streamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Doubleofdigits {
	
	public static void main(String[] args) {
		List<Integer> ls =Arrays.asList(2,5,1,6,8);
		ls.forEach(n -> System.out.print(n+" "+"\n"));
		//Stream<Integer> st =
				ls.stream().sorted().map(n -> n*2).forEach(n -> System.out.println(n));
		//st.forEach(n -> System.out.print(n+" - "));
		//st.forEach(n -> System.out.print(n +" "));
		//st.count();
	}

}
