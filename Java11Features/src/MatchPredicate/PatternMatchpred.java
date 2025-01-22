package MatchPredicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternMatchpred {

	public static void main (String[] args) {
		
		Pattern regex= Pattern.compile("pavi");
		Predicate<String> st =regex.asMatchPredicate();
		System.out.println(st.test("Indu"));
	}
	}
