package literalsanddatatypes;
import java.util.Scanner;

public class TernaryOperator {
	Scanner sc= new Scanner(System.in);
	public static void main(String[] args){
		TernaryOperator t=new TernaryOperator();
		System.out.print("Enter the Limit :");
		int Limit=t.sc.nextInt();
		System.out.print("Enter the comaparing Value:");
		int comparingValue=t.sc.nextInt();
		String ternaryoperation = (comparingValue<Limit)?(comparingValue+" is less than "+Limit):(comparingValue+" is greater than "+Limit);
		System.out.println(ternaryoperation);
	}

}
