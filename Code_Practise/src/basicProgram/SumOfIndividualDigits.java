package basicProgram;
import java.util.Scanner;
public class SumOfIndividualDigits {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in) ;
	 System.out.println("Enter the value to find the sum of individual Digits");
	 int input = sc.nextInt();
	 int sum =0;
	 while(input !=0) {
		sum = sum + (input%10); 
		input = input/10;
	 }
	 System.out.println("Sum of Individual Digits - " + sum);
	 
 }
}
