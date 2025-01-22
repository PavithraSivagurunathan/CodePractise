package NewStringMethods;

import java.util.Scanner;
import java.util.stream.Collectors;

public class StringMethods {
	Scanner sc=new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println("Enter the String :");
		StringMethods ref = new StringMethods();
		String str = ref.sc.next();
		if(str.isBlank()) {
			System.out.println("Entered String is Blank");
		}else {
		    System.out.println("Entered String is : "+str);	
		}
		String s="   Lines()\n is the collection of string\nwhich has been separated by line delimitor.   ";
		//System.out.println(s.lines().collect(Collectors.toList()));
		//System.out.println(s.lines());
		System.out.println(s.repeat(2));
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
		
	}

}
