package java8features;

import java.util.Scanner;
@FunctionalInterface
interface evenrodd{
	boolean result (int a );
}

public class twoparam {
	static Scanner sc = new Scanner (System.in);
	static int a ;
	public static void main (String [] args) {
		System.out.println("Enter the value to find whether the number is odd or even");
		 a =sc.nextInt();
		evenrodd fc=(d) -> {
			if(d%2 ==0) {
				return true;
			}else {
				return false;
			}
		};
		if(fc.result(a)) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		
	}

}
