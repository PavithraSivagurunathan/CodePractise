package stringPrograms;

import java.util.Scanner;

public class Stringtochararray {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		String str= sc.nextLine();
		char[] arr= str.toCharArray();
		System.out.println(arr);
		System.out.println(arr[0]);
		
	}

}
