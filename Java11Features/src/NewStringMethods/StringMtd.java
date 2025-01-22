package NewStringMethods;

import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringMtd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String sr=sc.nextLine();
		if(sr.isBlank()) {
			System.out.println("Given String is blank");
		}else {
			System.out.println("Given String is "+sr);
		}
		System.out.println("Lines - "+sr.lines().collect(Collectors.toList()));
		System.out.println("Repeat- "+sr.repeat(3));
		System.out.println("StripLeading - "+sr.stripLeading());
		System.out.println("StripTrailing - "+sr.stripTrailing());
		System.out.println("Strip - "+sr.strip());
	}

}
