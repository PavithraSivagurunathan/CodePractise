package basicProgram;
import java.util.Scanner;
public class Factorial {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int value = sc.nextInt();
		int val= value;
		int Factorial=1 ;
		while (value!=0) {
			Factorial =Factorial*(value--);
		}
		System.out.println("Factorial value of "+val+" - > "+Factorial);
	}

}
