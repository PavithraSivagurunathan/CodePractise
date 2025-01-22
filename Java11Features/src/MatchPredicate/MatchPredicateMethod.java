package MatchPredicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class MatchPredicateMethod {
	
	public static void main (String[] args) {
		
		String Regex = "ee";
		Pattern pr=Pattern.compile(Regex);
		Predicate <String> sr = pr.asMatchPredicate();	
		System.out.println(sr.test("ee"));
	}

}
