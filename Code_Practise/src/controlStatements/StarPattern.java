package controlStatements;
import java.util.Scanner;
public class StarPattern {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value :");
		int innervalue = sc.nextInt();
		for (int i=1;i<=innervalue;i++) {
			for (int j=i;j<=innervalue;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
