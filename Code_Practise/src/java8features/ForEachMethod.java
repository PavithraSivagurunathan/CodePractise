package java8features;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class ForEachMethod {
	static Scanner sc= new Scanner(System.in);
	public static void main(String [] args) {
		ArrayList <Integer> arr = new ArrayList<Integer> ();
		//Consumer<Integer> cons=new Consumer<Integer> {
			
		//};
		System.out.print("Enter the size of the ArrayList : ");
		int size = sc.nextInt();
		System.out.println("Enter the numbers to be get added into the arraylist :");
		for(int i=0;i<size;i++) {
			arr.add(i,sc.nextInt());
		}		
		//arr.add(0, 1);
		//arr.add(1, 2);
		System.out.println("ArrayList : "+arr);
		//arr.remove(1);
		//System.out.println("Array List after removal of value :"+arr);
		arr.forEach(n -> {
			if(n%2 ==0) {
				arr.remove(n);
				System.out.println("List after Removing even values : "+arr);
			}
			
		});
		
	}

}
