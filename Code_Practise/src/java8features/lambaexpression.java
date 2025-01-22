package java8features;

import java.util.Scanner;

@FunctionalInterface
interface lambdaexp{
	int add(int a,int b);
	default void print() {
		System.out.println("** Lambda Expression **");
	}
}
public class lambaexpression {
	static Scanner sc= new Scanner (System.in);
	public static void main (String [] args) {
		System.out.println("Enter the First Number: ");
		int e =sc.nextInt();
		System.out.println("Enter the Second Number:");
		int f=sc.nextInt();
		lambdaexp addition = (a,b) -> {
			int c=a+b;
			System.out.println("Addition of "+a+" and "+b+" : "+c);
			return c;
			};
	   addition.add(e, f);
	   addition.print();

}
}
