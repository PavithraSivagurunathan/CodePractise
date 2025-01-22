package java8features;

import java.util.Scanner;
@FunctionalInterface
interface Interface{
	int multiply(int m);
}
public class singleparam {
	Scanner sc=new Scanner(System.in);
    void printvalue(int a,Interface m) {
    	int d=m.multiply(a);
    	System.out.println("The value is"+a+":"+d);
    }
    public static void main (String[] args) {
    	System.out.println("Enter the square of a number : ");
    	singleparam param = new singleparam();
    	int r=param.sc.nextInt();
    	param.printvalue(r,(e) -> { 
    	return e*e;
    	});
    	
    }
}
