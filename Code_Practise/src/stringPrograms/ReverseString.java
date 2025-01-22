package stringPrograms;

import java.util.Scanner;
public class ReverseString {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		String Str = sc.nextLine();
		String strrev = "";
		for (int lp=(Str.length()-1);lp>=0;lp--) {
			strrev=strrev+Str.charAt(lp);
		}
		System.out.println("The Reversed String : "+strrev);
	}

}
