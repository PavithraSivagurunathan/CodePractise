package java8features;

import java.util.Scanner;
/*If we wants to have the method need to declare it with default */
@FunctionalInterface
interface expression {
	int add(int s,int b);
	default void display() {
		System.out.println("This is the Program for lambda expression");
	}
	default void print() {
		System.out.println("Print");
	}
}

public class InterfacewithArgumentedMethod {
	static Scanner sc= new Scanner(System.in);
	public static void main(String [] args) {
		System.out.print("Enter the First Number for performing the addition : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number for performing the addition : ");
		int b= sc.nextInt();
		//int c =0;
		expression ex= (int d,int e) -> {
			int c=d+e;
			System.out.println("Addition of  "+d+" and b is "+e+" : "+c);
			return c;
		};
		ex.add(a,b);
		ex.display();
		ex.print();
	}

}

