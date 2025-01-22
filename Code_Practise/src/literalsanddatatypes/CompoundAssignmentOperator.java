package literalsanddatatypes;

import java.util.Scanner;

public class CompoundAssignmentOperator {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//CompoundAssignmentOperator var=new CompoundAssignmentOperator();
		System.out.println("Enter the value to perform the compound assignment operation:");
		 int a = sc.nextInt();
		a+=2;
		System.out.println("a -> "+a);
		a-=2;
		System.out.println("a -> "+a);
		a*=2;
		System.out.println("a -> "+a);
		a%=2;
		System.out.println("a -> "+a);
		a/=2;
		System.out.println("a -> "+a);
	}

}
