package stringPrograms;

import java.util.Scanner;

public class StringBasicProgram {
	static Scanner sc= new Scanner(System.in);
	public static void main (String[] args) {
		
		System.out.println("Enter the String 1 :");
		String str = sc.nextLine();
		System.out.println("Enter the String 2 :");
		String str1 =sc.nextLine();
		System.out.println("Upper:"+str.toUpperCase());
		System.out.println("Lower:"+str.toLowerCase());
		System.out.println("Forever : "+str.concat(str1));
		System.out.println("Trimmed : "+str.trim());
		System.out.println("Part of String : "+str.substring(1));
		System.out.println("Part of string :"+str.substring(0,4));
		System.out.println("Char at index of "+str.charAt(4));
		System.out.println("Last Index of "+str.lastIndexOf('o'));
		System.out.println("Index of particular val"+str.indexOf('r', 7));
		System.err.println("Index of charrseq"+str.lastIndexOf(str1));
		//Forward of a string
		for (int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		//Backward of a string 
		for (int n=(str.length()-1);n>=0;n--) {
			System.out.println(str.charAt(n));
		}
		/*
		 * 
		 * String s= "String"; String str = new String("!! Hello "); String ref =
		 * "efforted"; StringBuffer strb= new StringBuffer(ref); char[] arr = {'a','b'};
		 * String str2= new String(arr); System.out.println(str); int a =
		 * str.indexOf('e', 1); System.out.println(a);
		 * System.out.println(str.charAt(a)); String str1 = new String("World !!");
		 * System.out.println("Length of String "+(str.length()+str1.length()));
		 * System.out.println("String : "+(str.concat(str1))); System.out.println(str2);
		 * ref="effort1"; System.out.println(strb);
		 */
		
	}

}
