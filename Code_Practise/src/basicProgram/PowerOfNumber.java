package basicProgram;

import java.util.Scanner;
public class PowerOfNumber {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the digit for which the power needs to be found : ");
		int digit  = sc.nextInt();
		System.out.print("Enter the power: ");
		int power = sc.nextInt();
		int val =1;
		for (int i=1;i<=power;i++) {
			val = val*digit;
		}
		System.out.println("Power of "+digit+"is - > "+val);
	}

}
