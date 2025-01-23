package arrays;

import java.util.Scanner;
public class Arrays {
	static Scanner sc= new Scanner(System.in);
	public static void main (String[] args) {
		System.out.print("Enter the size: ");
		int lenth= sc.nextInt();
		String[] carr= new String[lenth];
		
		for (int lp=0;lp<lenth;lp++) {
			System.out.print("Enter the values for the index of :"+lp+"\t");
			String val=sc.next();
			carr[lp]=val;
		}
		System.out.println("The Array of String in Forward :");
		
		for (int lp1=0;lp1<lenth;lp1++) {
			System.out.println(carr[lp1]);
		
		}
		System.out.println("The Array of String in Backward :");
		for (int lp2=lenth-1;lp2>=0;lp2--) {
			System.out.println(carr[lp2]);
		}
	}

}
