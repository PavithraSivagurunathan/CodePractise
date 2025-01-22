package stringPrograms;

import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String Str1= "ARMY";
		String Str2="MARY";
		if(checkanagaram(Str1,Str2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}
	public static boolean checkanagaram(String a,String b) {
		char[] arr1=a.toLowerCase().toCharArray();
		char[] arr2=b.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

}
