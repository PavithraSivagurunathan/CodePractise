package streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateStreamApi {
	
	public static void main(String[] args) {
		List <List<String>> lis= Arrays.asList(Arrays.asList("GOOD Offer","God Package","Stream"),
								Arrays.asList("Flat map","Sorting","Stream"));
		Set<String> IntermediateResult = new HashSet<>();
		List<String> flattenstring = lis.stream().flatMap(List::stream)
				.distinct().filter(s ->s.startsWith("G"))
				.sorted().map( S-> S.toUpperCase())
				.peek( s-> IntermediateResult.add(s)).collect(Collectors.toList());
		System.out.println("Intermediate Results -");
		IntermediateResult.forEach(System.out::println);
		System.out.println("Final Result - ");
		flattenstring.forEach(System.out::println);
	}

}
