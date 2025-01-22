package controlStatements;
import java.util.Scanner;
public class DoWhileLooping {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Value : ");
		int dowhileval= sc.nextInt();
		int i=1;
		do {
			System.out.println(++i);
		}while(i<=dowhileval);
			
	}

}
