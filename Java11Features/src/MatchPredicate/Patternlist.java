package MatchPredicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Patternlist {
	
	public static void main(String[] args) {
		String str="PP";
		Pattern pr=Pattern.compile(str);
		Predicate <String> sr=pr.asMatchPredicate();
		System.out.println("regex - "+sr.test("PP"));
				
	}

}
